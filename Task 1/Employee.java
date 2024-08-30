package com.example.Task.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Employee_DB")
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private int id;

    @Column(name="Name")
    private String name;

    @Column(name="Department")
    private String department;

    @Column(name = "HireYear")
    private int hireYear;
}
