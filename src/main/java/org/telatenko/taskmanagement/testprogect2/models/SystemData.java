package org.telatenko.taskmanagement.testprogect2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class SystemData {

    @XmlAttribute(name = "CreationTime")
    private String creationTime;

    @XmlElement(name = "CreditScores")
    private List<CreditScores> creditScores;

    @XmlElement(name = "LoanProducts")
    private LoanProducts loanProducts;

}
