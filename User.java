/*
* File: User.java
* Author: Melissa von der Lippe
* Date: 04/25/2022
* Course: CMSC 495
* Purpose: This class creates User objects to be used in the LibraryManager
*/

// import classes
import java.util.*;

public class User {

    // variables 
    private String name = null;
    private String address = null;
    private String email = null;
    private String phoneNum = null;
    private Integer userID = 0;
    // private UserInventory userInv; // UserInventory class still to be created

    // constructor
    public User(String name, String address, String email, String phoneNum){
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNum = phoneNum;
        this.userID = nextInt(10000);
    }

    // getter methods
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getEmail(){
        return email;
    }

    public Date getPhoneNum(){
        return phoneNum;
    }

    public Integer getUserID(){
        return userID;
    }

    // setter methods
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNum(Date phoneNum){
        this.phoneNum = phoneNum;
    }

    public void setUserID(){
        this.userID = nextInt(10000);
    }
}