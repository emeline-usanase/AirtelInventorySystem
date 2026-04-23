package com.usanase.AirtelInventorySystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="full_name")
    private String fullName;

    private String phone;

    @Column(name="is_airtel_client")
    private boolean isAirtelClient;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department department;

    public User(){}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public boolean isAirtelClient() { return isAirtelClient; }
    public void setAirtelClient(boolean airtelClient) { isAirtelClient = airtelClient; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }
}
