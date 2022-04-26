/*
* File: Material.java
* Author: Melissa von der Lippe
* Date: 04/25/2022
* Course: CMSC 495
* Purpose: This class creates Material objects to be used in the LibraryManager
*/

// import classes
import java.util.*;

public class Material {

    // variables 
    private String title = null;
    private String author = null;
    private String subject = "non-fiction";
    private Date pubDate = null;
    private Boolean circAvail = true;
    private Date dueDate = null;
    private Integer materialID = 0;

    // constructor
    public Material(String title, String author, String subject, Date pubDate){
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.pubDate = pubDate;
        this.materialID = nextInt(10000);
    }

    // getter methods
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getSubject(){
        return subject;
    }

    public Date getPubDate(){
        return pubDate;
    }

    public Integer getMaterialID(){
        return materialID;
    }

    public Boolean getCircAvail(){
        return circAvail;
    }

    public Date getDueDate(){
        return dueDate;
    }

    // setter methods
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public void setPubDate(Date pubDate){
        this.pubDate = pubDate;
    }

    public void setMaterialID(){
        this.materialID = nextInt(10000);
    }

    public void setCircAvail(Boolean circAvail){
        this.circAvail = circAvail;
    }

    public void setDueDate(Date dueDate){
        this.dueDate = dueDate;
    }
}