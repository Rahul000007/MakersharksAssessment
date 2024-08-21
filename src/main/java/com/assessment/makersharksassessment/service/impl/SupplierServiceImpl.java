package com.assessment.makersharksassessment.service.impl;

import com.assessment.makersharksassessment.dto.SupplierDTO;
import com.assessment.makersharksassessment.enums.ManufacturingProcess;
import com.assessment.makersharksassessment.enums.NatureOfBusiness;
import com.assessment.makersharksassessment.model.Supplier;
import com.assessment.makersharksassessment.repository.SupplierRepository;
import com.assessment.makersharksassessment.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public List<SupplierDTO> findSuppliers(
            String location, NatureOfBusiness natureOfBusiness, ManufacturingProcess manufacturingProcess,
            int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Supplier> suppliersPage = supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcesses(
                location, natureOfBusiness, manufacturingProcess, pageable);

        return suppliersPage.getContent().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private SupplierDTO convertToDTO(Supplier supplier) {
        SupplierDTO dto = new SupplierDTO();
        dto.setCompanyName(supplier.getCompanyName());
        dto.setWebsite(supplier.getWebsite());
        dto.setLocation(supplier.getLocation());
        dto.setNatureOfBusiness(supplier.getNatureOfBusiness());
        dto.setManufacturingProcesses(supplier.getManufacturingProcesses());
        return dto;
    }
}
