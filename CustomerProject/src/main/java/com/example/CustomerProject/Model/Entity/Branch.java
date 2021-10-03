package com.example.CustomerProject.Model.Entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
@Entity
public class Branch {
    @Id
    @Column(name = "branch_code")
    private String branch_code;

    @Column
    private String branch_name;
}
