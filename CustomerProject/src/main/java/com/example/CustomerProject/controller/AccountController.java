package com.example.CustomerProject.controller;

import com.example.CustomerProject.Model.AccountResult;
import com.example.CustomerProject.repository.AccountRepository;
import com.example.CustomerProject.repository.BranchRepository;
import com.example.CustomerProject.repository.TransactionRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Sample Let's gootrianrk")
@RestController // data를 반환하겠다
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    @Autowired
    BranchRepository branchRepository;

    @Autowired
    TransactionRepository transactionRepository;

    @GetMapping("/api1")
    public String getApiOne(){
        return "get test api1";
    }

    @GetMapping("/api2")
    public String getApiTwo(){
        return "get test api2";
    }

    @GetMapping("/api3")
    public String getApiThree(){
        return "get test api3";
    }

    @GetMapping("/api4")
    public String getApiFour(){
        return "get test api4";
    }

}
