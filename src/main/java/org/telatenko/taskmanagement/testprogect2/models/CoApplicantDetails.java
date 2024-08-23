package org.telatenko.taskmanagement.testprogect2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class CoApplicantDetails {

    @XmlElement(name = "FullName")
    private String fullName;

    @XmlElement(name = "DateOfBirth")
    private String dateOfBirth;

    @XmlElement(name = "ClientINN")
    private String clientINN;

    @XmlElement(name = "ClientID")
    private String clientID;

}
