package com.example.CustomerProject.repository;

import com.example.CustomerProject.Model.AccountResult;
import com.example.CustomerProject.Model.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,String> {
    @Query(value = "SELECT account_no, account_name FROM account WHERE branch_code = :branchCode", nativeQuery = true)
    List<AccountResult> getAccountByBranchCode(@Param("branchCode") String branchCode);
}

