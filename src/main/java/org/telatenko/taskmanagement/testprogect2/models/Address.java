package org.telatenko.taskmanagement.testprogect2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {

    @XmlAttribute(name = "Street")
    private String street;

    @XmlAttribute(name = "City")
    private String city;

    @XmlAttribute(name = "PostalCode")
    private String postalCode;

    @XmlAttribute(name = "Country")
    private String country;

}
