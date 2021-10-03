package com.example.CustomerProject.repository;

import com.example.CustomerProject.Model.BranchResult;
import com.example.CustomerProject.Model.Entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BranchRepository extends JpaRepository<Branch,String> {
    @Query(value = "SELECT branch_code, branch_name FROM branch WHERE branch_code = :branchCode", nativeQuery = true)
    List<BranchResult> getAccountByBranchCode(@Param("branchCode") String branchCode);
}
