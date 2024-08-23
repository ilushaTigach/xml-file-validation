package org.telatenko.taskmanagement.testprogect2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Collateral {

    @XmlAttribute(name = "Type")
    private String type;

    @XmlAttribute(name = "Description")
    private String description;

    @XmlAttribute(name = "EstimatedValue")
    private int estimatedValue;

}
