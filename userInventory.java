/*
* File: userInventory.java
* Author: Zuh, Francis
* Date: 01 May 2022
* Course: CMSC 495
* Purpose: To creates userInventory class to be used in Library Management System
*/


public class userInventory {

// create fields
    private final String checkOutMaterial;
    private String returnMaterial;
    private String renewMaterial;
    private String assessFine;
    private final String payFine;


    //constructor
    public userInventory(String checkOutMaterial, String returnMaterial, String renewMaterial, String assessFine, String payFine) {
        this.checkOutMaterial = checkOutMaterial;
        this.returnMaterial = returnMaterial;
        this.renewMaterial = renewMaterial;
        this.assessFine = assessFine;
        this.payFine = payFine;
    }

    //Setters and Getters
    public String getCheckOutMaterial() {
        return checkOutMaterial;
    }

    public String getReturnMaterial() {
        return returnMaterial;
    }

    public void setReturnMaterial(String returnMaterial) {
        this.returnMaterial = returnMaterial;
    }

    public String getRenewMaterial() {
        return renewMaterial;
    }

    public void setRenewMaterial(String renewMaterial) {
        this.renewMaterial = renewMaterial;
    }

    public String getAssessFine() {
        return assessFine;
    }

    public void setAssessFine(String assessFine) {
        this.assessFine = assessFine;
    }

    public String getPayFine() {
        return payFine;
    }
