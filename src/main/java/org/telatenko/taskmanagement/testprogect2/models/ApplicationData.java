package org.telatenko.taskmanagement.testprogect2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicationData {

    @XmlAttribute(name = "ID")
    private String id;

    @XmlElement(name = "ApplicationInformation")
    private ApplicationInformation applicationInformation;

    @XmlElement(name = "Collateral")
    private Collateral collateral;

    @XmlElement(name = "Status")
    private String status;

    @XmlElement(name = "Loaners")
    private Loaners loaners;

}
