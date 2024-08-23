package org.telatenko.taskmanagement.testprogect2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class ContactInformation {

    @XmlAttribute(name = "Email")
    private String email;

    @XmlAttribute(name = "Phone")
    private String phone;

}
