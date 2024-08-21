package com.assessment.makersharksassessment.model;

import com.assessment.makersharksassessment.enums.ManufacturingProcess;
import com.assessment.makersharksassessment.enums.NatureOfBusiness;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;

    private String companyName;

    private String website;

    private String location;

    @Enumerated(EnumType.STRING)
    private NatureOfBusiness natureOfBusiness;

    @Enumerated(EnumType.STRING)
    private ManufacturingProcess manufacturingProcesses;
}