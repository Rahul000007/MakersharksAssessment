package com.assessment.makersharksassessment.repository;

import com.assessment.makersharksassessment.enums.ManufacturingProcess;
import com.assessment.makersharksassessment.enums.NatureOfBusiness;
import com.assessment.makersharksassessment.model.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    Page<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcesses(
            String location, NatureOfBusiness natureOfBusiness,
            ManufacturingProcess manufacturingProcesses, Pageable pageable);

}
