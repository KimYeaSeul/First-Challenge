package com.example.CustomerProject.repository;

import com.example.CustomerProject.Model.Entity.Transaction;
import com.example.CustomerProject.Model.TransactionResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
    @Query(value = "SELECT transaction_date, account_no, transaction_no, fees, money, cancel  " +
            "FROM CUSTOMER WHERE account_no = :accountNum", nativeQuery = true)
    List<TransactionResult> getAccountNum(@Param("accountNum") String accountNum);
}
