package org.telatenko.taskmanagement.testprogect2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Loaners {

    @XmlElement(name = "ApplicantDetails")
    private ApplicantDetails applicantDetails;

    @XmlElement(name = "CoApplicantDetails")
    private CoApplicantDetails coApplicantDetails;

}
