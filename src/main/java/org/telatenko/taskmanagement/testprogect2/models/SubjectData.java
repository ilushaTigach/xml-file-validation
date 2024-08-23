package org.telatenko.taskmanagement.testprogect2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class SubjectData {

    @XmlAttribute(name = "FullName")
    private String fullName;

    @XmlAttribute(name = "ID")
    private String id;

    @XmlElement(name = "PassportData")
    private PassportData passportData;

    @XmlElement(name = "ContactInformation")
    private ContactInformation contactInformation;

    @XmlElement(name = "Address")
    private Address address;

    @XmlElement(name = "EmploymentInformation")
    private EmploymentInformation employmentInformation;

    @XmlElement(name = "AdditionalInformation")
    private AdditionalInformation additionalInformation;

}
