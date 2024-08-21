package com.assessment.makersharksassessment.dto;

import com.assessment.makersharksassessment.enums.ManufacturingProcess;
import com.assessment.makersharksassessment.enums.NatureOfBusiness;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SupplierDTO {
    @NotNull(message = "Company name cannot be null")
    @NotEmpty(message = "Company name cannot be empty")
    @Size(min = 2, max = 100, message = "Company name must be between 2 and 100 characters")
    private String companyName;

    @NotNull(message = "Website cannot be null")
    @NotEmpty(message = "Website cannot be empty")
    private String website;

    @NotNull(message = "Location cannot be null")
    @NotEmpty(message = "Location cannot be empty")
    private String location;

    @NotNull(message = "Nature of business cannot be null")
    private NatureOfBusiness natureOfBusiness;

    @NotNull(message = "Manufacturing process cannot be null")
    private ManufacturingProcess manufacturingProcesses;
}
