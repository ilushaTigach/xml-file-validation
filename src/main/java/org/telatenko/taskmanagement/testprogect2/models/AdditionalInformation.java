package org.telatenko.taskmanagement.testprogect2.models;

import lombok.*;
import lombok.Data;
import javax.xml.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class AdditionalInformation {

    @XmlElement(name = "MaritalStatus")
    private String maritalStatus;

    @XmlElement(name = "Dependents")
    private String dependents;

}
