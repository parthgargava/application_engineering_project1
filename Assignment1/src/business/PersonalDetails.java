package business;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Parth
 */
public class PersonalDetails {

    /* I have used the concept of encapsulation by making the variables private. Now no function/object can use variables unless 
   called by a getter and setter method of Personal Details class
The reason I divided business logic into education and personal details is so that the education and personal details are not
    dependednt on each other
     */
    private String fname;
    private String lname;
    private String mob;
    private String mail;
    private String address;
    private String city;
    private ImageIcon image;
    private String gender;
    private String nationality;

    /*
    Here, I have used the concept of abstraction, that using just getter and setter, we are accessing variables without
    having any concern about how the variables are, and their access modifiers
     */
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    private String state;
    private String zip;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}
