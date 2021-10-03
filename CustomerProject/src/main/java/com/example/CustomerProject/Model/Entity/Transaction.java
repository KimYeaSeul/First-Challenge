package com.example.CustomerProject.Model.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
@IdClass(TransactionId.class)
@Entity
public class Transaction implements Serializable{
    @Id
    private String transaction_date;

    // TODO : Make FK
    @Id
    private String account_no;

    @Id
    private String transaction_no;

    @Column
    private String money;

    @Column
    private String fees;

    @Column
    private String cancel;

}
