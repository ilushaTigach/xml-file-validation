package org.telatenko.taskmanagement.testprogect2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class EmploymentInformation {

    @XmlAttribute(name = "EmployerName")
    private String employerName;

    @XmlAttribute(name = "Position")
    private String position;

    @XmlAttribute(name = "YearsEmployed")
    private String yearsEmployed;

    @XmlAttribute(name = "AnnualIncome")
    private String annualIncome;

}
