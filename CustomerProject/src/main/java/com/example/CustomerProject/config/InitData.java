package com.example.CustomerProject.config;

import com.example.CustomerProject.Model.Entity.Account;
import com.example.CustomerProject.Model.Entity.Branch;
import com.example.CustomerProject.Model.Entity.Transaction;
import com.example.CustomerProject.repository.AccountRepository;
import com.example.CustomerProject.repository.BranchRepository;
import com.example.CustomerProject.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class InitData {
    @Autowired
    AccountRepository accountRepository;

    @Autowired
    BranchRepository branchRepository;

    @Autowired
    TransactionRepository transactionRepository;

    @PostConstruct
    private void initAccount() throws IOException{
        if(accountRepository.count()==0) {
            Resource resource = new ClassPathResource("계좌정보.csv");
            List<Account> accountList = Files.readAllLines(resource.getFile().toPath(), StandardCharsets.UTF_8)
                    .stream().skip(1).map(line -> {
                        String[] split = line.split(",");
                        return Account.builder().account_no(split[0]).account_name(split[1]).branch_code(split[2])
                                .build();
                    }).collect(Collectors.toList());
            accountRepository.saveAll(accountList);
        }

        if(branchRepository.count()==0){
            Resource resource = new ClassPathResource("관리점정보.csv");
            List<Branch> accountList = Files.readAllLines(resource.getFile().toPath(), StandardCharsets.UTF_8)
                    .stream().skip(1).map(line -> {
                        String[] split = line.split(",");
                        return Branch.builder().branch_code(split[0]).branch_name(split[1])
                                .build();
                    }).collect(Collectors.toList());
            branchRepository.saveAll(accountList);
        }

        if(transactionRepository.count()==0){
            Resource resource = new ClassPathResource("거래내역.csv");
            List<Transaction> accountList = Files.readAllLines(resource.getFile().toPath(), StandardCharsets.UTF_8)
                    .stream().skip(1).map(line -> {
                        String[] split = line.split(",");
                        return Transaction.builder().transaction_date(split[0]).account_no(split[1]).transaction_no(split[2])
                                .money(split[3]).fees(split[4]).cancel(split[5])
                                .build();
                    }).collect(Collectors.toList());
            transactionRepository.saveAll(accountList);
        }
    }
}