package org.telatenko.taskmanagement.testprogect2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditScores {

    @XmlAttribute(name = "ClientID")
    private String clientID;

    @XmlAttribute(name = "CreditScore")
    private int creditScore;

    @XmlAttribute(name = "CreditBureau")
    private String creditBureau;

    @XmlAttribute(name = "ScoreDate")
    private String scoreDate;

}

