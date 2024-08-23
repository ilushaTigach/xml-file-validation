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
public class LoanProducts {

    @XmlElement(name = "Product")
    private List<Product> products;

}
