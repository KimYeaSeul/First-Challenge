package com.example.CustomerProject.Model.Entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Data
@Entity
public class Account {

    @Id
    private String account_no;

    @Column
    private String account_name;

//     TODO : Solve this problem. Make FK
    // FK를 만들지 않으면 query를 짤 수가 없고,, FK를 만들고자 JoinColumn을 하면 InitData에서 branch_code 인식 못함.
    @Column
    private String branch_code;

//    @OneToMany
//    @JoinColumn(name = "branch_code")
//    private Branch branch;
//
//    @Builder
//    private Account(String account_no,String account_name, Branch branch) {
//        this.account_no = account_no;
//        this.account_name = account_name;
//        this.branch = branch;
//    }
}

