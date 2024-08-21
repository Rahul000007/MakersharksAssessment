package com.assessment.makersharksassessment.controller;

import com.assessment.makersharksassessment.dto.SupplierDTO;
import com.assessment.makersharksassessment.dto.SupplierQueryDTO;
import com.assessment.makersharksassessment.service.SupplierService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    /**
     * Endpoint to retrieve a list of suppliers based on the provided query criteria.
     * This method accepts a POST request with a JSON payload containing filtering criteria and optional pagination parameters.
     * If the request body is valid, the method delegates the retrieval of suppliers to the service layer.
     *
     * @param queryDTO The DTO representing the query criteria for filtering suppliers.
     * @param page     The page number for pagination (optional, defaults to 0).
     * @param size     The number of suppliers per page (optional, defaults to 10).
     * @return ResponseEntity The ResponseEntity containing the list of supplier DTOs and HTTP status code.
     */
    @PostMapping("/query")
    public ResponseEntity<List<SupplierDTO>> getSuppliers(
            @Valid @RequestBody SupplierQueryDTO queryDTO,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        List<SupplierDTO> suppliers = supplierService.findSuppliers(queryDTO.getLocation(),
                queryDTO.getNatureOfBusiness(),
                queryDTO.getManufacturingProcess(),
                page,
                size);
        return ResponseEntity.ok(suppliers);
    }
}
