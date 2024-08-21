package com.assessment.makersharksassessment.service;

import com.assessment.makersharksassessment.dto.SupplierDTO;
import com.assessment.makersharksassessment.enums.ManufacturingProcess;
import com.assessment.makersharksassessment.enums.NatureOfBusiness;

import java.util.List;

public interface SupplierService {
    List<SupplierDTO> findSuppliers(
            String location, NatureOfBusiness natureOfBusiness,
            ManufacturingProcess manufacturingProcess, int page, int size);
}
