package com.example.CustomerProject.Model.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Table
@Data
@IdClass(TransactionId.class)
@Entity
public class TransactionId implements Serializable {

    @Id
    private String transaction_date;

    @Id
    private String account_no;

    @Id
    private String transaction_no;

}
