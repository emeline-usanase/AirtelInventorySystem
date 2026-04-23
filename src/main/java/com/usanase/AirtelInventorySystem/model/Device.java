package com.usanase.AirtelInventorySystem.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="devices")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="serial_number")
    private String serialNumber;

    private String type;
    private String brand;
    private String model;

    @Column(name="condition_status")
    private String conditionStatus;

    private String status;

    @Column(name="purchase_date")
    private LocalDate purchaseDate;

    public Device(){}

    public int getId(){ return id; }
    public void setId(int id){ this.id=id; }

    public String getSerialNumber(){ return serialNumber; }
    public void setSerialNumber(String serialNumber){ this.serialNumber=serialNumber; }

    public String getType(){ return type; }
    public void setType(String type){ this.type=type; }

    public String getBrand(){ return brand; }
    public void setBrand(String brand){ this.brand=brand; }

    public String getModel(){ return model; }
    public void setModel(String model){ this.model=model; }

    public String getConditionStatus(){ return conditionStatus; }
    public void setConditionStatus(String conditionStatus){ this.conditionStatus=conditionStatus; }

    public String getStatus(){ return status; }
    public void setStatus(String status){ this.status=status; }

    public LocalDate getPurchaseDate(){ return purchaseDate; }
    public void setPurchaseDate(LocalDate purchaseDate){ this.purchaseDate=purchaseDate; }
}