package com.example.hellow.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "e_id")  // Maps to column 'e_id' in the database
    private Integer eId;

    @Column(name = "e_name", nullable = false, length = 100)  // Maps to 'e_name'
    private String eName;

    @Column(name = "e_sal", nullable = false)  // Maps to 'e_sal'
    private Double eSal;

    // Getters and Setters

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Double geteSal() {
        return eSal;
    }

    public void seteSal(Double eSal) {
        this.eSal = eSal;
    }
}

