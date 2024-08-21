package com.assessment.makersharksassessment.dto;

import com.assessment.makersharksassessment.enums.ManufacturingProcess;
import com.assessment.makersharksassessment.enums.NatureOfBusiness;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SupplierQueryDTO {

    @NotBlank(message = "Location cannot be null or empty")
    private String location;

    @NotNull(message = "Nature of business cannot be null")
    private NatureOfBusiness natureOfBusiness;

    @NotNull(message = "Manufacturing process cannot be null")
    private ManufacturingProcess manufacturingProcess;

}
