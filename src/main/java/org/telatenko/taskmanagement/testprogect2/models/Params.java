package org.telatenko.taskmanagement.testprogect2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Params {

    @XmlAttribute(name = "MinAmount")
    private int minAmount;

    @XmlAttribute(name = "MaxAmount")
    private int maxAmount;

    @XmlAttribute(name = "MinInterestRate")
    private double minInterestRate;

    @XmlAttribute(name = "MaxInterestRate")
    private double maxInterestRate;

    @XmlAttribute(name = "MinMonths")
    private int minMonths;

    @XmlAttribute(name = "MaxMonths")
    private int maxMonths;

}
