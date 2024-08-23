package org.telatenko.taskmanagement.testprogect2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {

    @XmlAttribute(name = "ID")
    private String id;

    @XmlAttribute(name = "IsSelected")
    private String isSelected;

    @XmlAttribute(name = "Name")
    private String name;

    @XmlAttribute(name = "Description")
    private String description;

    @XmlElement(name = "Params")
    private Params params;

    @XmlElement(name = "EligibilityCriteria")
    private EligibilityCriteria eligibilityCriteria;

}
