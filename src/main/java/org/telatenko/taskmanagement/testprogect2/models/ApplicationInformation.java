package org.telatenko.taskmanagement.testprogect2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicationInformation {

    @XmlAttribute(name = "LoanTerm")
    private int loanTerm;

    @XmlAttribute(name = "LoanAmount")
    private int loanAmount;

    @XmlAttribute(name = "RequestedAmount")
    private int requestedAmount;

    @XmlAttribute(name = "InterestRate")
    private double interestRate;

}
