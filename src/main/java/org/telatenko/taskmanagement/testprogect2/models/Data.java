package org.telatenko.taskmanagement.testprogect2.models;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.xml.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
@XmlRootElement(name = "Data")
@XmlAccessorType(XmlAccessType.FIELD)
public class Data {

    @XmlElement(name = "SubjectData")
    private SubjectData subjectData;

    @XmlElement(name = "ApplicationData")
    private ApplicationData applicationData;

    @XmlElement(name = "SystemData")
    private SystemData systemData;

}
