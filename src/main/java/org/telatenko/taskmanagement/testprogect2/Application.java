package org.telatenko.taskmanagement.testprogect2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.telatenko.taskmanagement.testprogect2.models.Data;
import org.telatenko.taskmanagement.testprogect2.services.ValidationService;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private ValidationService validationService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        File file = new File("src/main/resources/data.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Data data = (Data) unmarshaller.unmarshal(file);

        System.out.println("Root element: " + data.getClass().getName());
        System.out.println("SubjectData: " + data.getSubjectData());
        System.out.println("ApplicantDetails: " + data.getApplicationData().getLoaners().getApplicantDetails());

        validationService.validate(data);
        System.out.println("Validation was successful");
    }
}
