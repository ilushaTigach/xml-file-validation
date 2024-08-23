package org.telatenko.taskmanagement.testprogect2.services;

import org.springframework.stereotype.Service;
import org.telatenko.taskmanagement.testprogect2.models.*;
import javax.xml.bind.ValidationException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@Service
public class ValidationService {

    public void validate(Data data) throws ValidationException {
        validateAge(data.getApplicationData());
        validateAgeCo(data.getApplicationData());
        validateLoanAmountAndTerm(data.getApplicationData(), data.getSystemData());
        validateInn(data.getApplicationData());
        validateInnCo(data.getApplicationData());
    }

    private void validateAge(ApplicationData applicationData) throws ValidationException {
        String dateOfBirthStr = applicationData.getLoaners().getApplicantDetails().getDateOfBirth();
        System.out.println("DateOfBirth from XML: " + dateOfBirthStr);
        if (dateOfBirthStr == null) {
            throw new ValidationException("Error: Date of birth is missing.");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr, formatter);
        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();

        if (age > 85) {
            throw new ValidationException("Error: Applicant age exceeds 85 years.");
        }
        System.out.println("Validate Age");
    }

    private void validateAgeCo(ApplicationData applicationData) throws ValidationException {
        String dateOfBirthStr = applicationData.getLoaners().getCoApplicantDetails().getDateOfBirth();
        System.out.println("DateOfBirth from XML: " + dateOfBirthStr);
        if (dateOfBirthStr == null) {
            throw new ValidationException("Error: Date of birth is missing.");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr, formatter);
        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();

        if (age > 85) {
            throw new ValidationException("Error: Applicant age exceeds 85 years.");
        }
        System.out.println("Validate Age Co");
    }

    private void validateLoanAmountAndTerm(ApplicationData applicationData, SystemData systemData) throws ValidationException {
        int loanAmount = applicationData.getApplicationInformation().getLoanAmount();
        int loanTerm = applicationData.getApplicationInformation().getLoanTerm();

        LoanProducts loanProducts = systemData.getLoanProducts();
        for (Product product : loanProducts.getProducts()) {
            if (product.getIsSelected().equals("1")) {
                int minAmount = product.getParams().getMinAmount();
                int maxAmount = product.getParams().getMaxAmount();
                int minMonths = product.getParams().getMinMonths();
                int maxMonths = product.getParams().getMaxMonths();

                if (loanAmount < minAmount || loanAmount > maxAmount) {
                    throw new ValidationException("Error: Loan amount is out of the allowed range.");
                }
                if (loanTerm < minMonths || loanTerm > maxMonths) {
                    throw new ValidationException("Error: Loan term is out of the allowed range.");
                }
                System.out.println("Validate LoanAmount And Term sucsefull");
            }
        }
    }

    private boolean isValidINN(String inn) {
        if (inn == null || (!(inn.length() == 10) && !(inn.length() == 12))) {
            return false;
        }
        try {
            Long.parseLong(inn);
        } catch (NumberFormatException e) {
            return false;
        }
        return checkControlDigits(inn);
    }

    private boolean checkControlDigits(String inn) {
        if (inn.length() == 10) {
            return checkControlDigitFor10(inn);
        } else if (inn.length() == 12) {
            return checkControlDigitFor12(inn);
        }
        return false;
    }

    private boolean checkControlDigitFor10(String inn) {
        int[] coefficients = {2, 4, 10, 3, 5, 9, 4, 6, 8};
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (inn.charAt(i) - '0') * coefficients[i];
        }
        int controlDigit = sum % 11 % 10;
        return controlDigit == (inn.charAt(9) - '0');
    }

    private boolean checkControlDigitFor12(String inn) {
        int[] coefficients1 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int[] coefficients2 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < 10; i++) {
            sum1 += (inn.charAt(i) - '0') * coefficients1[i];
            sum2 += (inn.charAt(i) - '0') * coefficients2[i];
        }
        sum2 += (inn.charAt(10) - '0') * coefficients2[10];
        int controlDigit1 = sum1 % 11 % 10;
        int controlDigit2 = sum2 % 11 % 10;
        return controlDigit1 == (inn.charAt(10) - '0') && controlDigit2 == (inn.charAt(11) - '0');
    }

    public void validateInn(ApplicationData applicationData) throws ValidationException {
        String inn = applicationData.getLoaners().getApplicantDetails().getClientINN();
        if (!isValidINN(inn)) {
            throw new ValidationException("Error: Invalid INN.");
        }
    }

    public void validateInnCo(ApplicationData applicationData) throws ValidationException {
        String inn = applicationData.getLoaners().getCoApplicantDetails().getClientINN();
        if (!isValidINN(inn)) {
            throw new ValidationException("Error: Invalid INN.");
        }
    }
}
