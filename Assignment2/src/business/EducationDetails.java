package business;

/**
 *
 * @author Parth
 */
public class EducationDetails {

// I have used the concept of encapsulation by making the variables private. Now no function/object can use variables unless 
    //called by a getter and setter method of Personal Details class
//The reason I divided business logic into education and personal details is so that the education and personal details are not
    //dependednt on each other
    private String numberdegrees;
    private String affiliation;

    private String degree1;
    private String college1;
    private String major1;
    private String year1;

    private String degree2;
    private String college2;
    private String major2;
    private String year2;
    private String programming;
            
            
    private String projects;
    private String careerobjective;
    private String signature;
    
    //Here, I have used the concept of abstraction, that using just getter and setter, we are accessing variables without
    //having any concern about how the variables are, and their access modifiers
    public String getNumberdegrees() {
        return numberdegrees;
    }

    public void setNumberdegrees(String numberdegrees) {
        this.numberdegrees = numberdegrees;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getDegree1() {
        return degree1;
    }

    public void setDegree1(String degree1) {
        this.degree1 = degree1;
    }

    public String getCollege1() {
        return college1;
    }

    public void setCollege1(String college1) {
        this.college1 = college1;
    }

    public String getMajor1() {
        return major1;
    }

    public void setMajor1(String major1) {
        this.major1 = major1;
    }

    public String getYear1() {
        return year1;
    }

    public void setYear1(String year1) {
        this.year1 = year1;
    }

    public String getDegree2() {
        return degree2;
    }

    public void setDegree2(String degree2) {
        this.degree2 = degree2;
    }

    public String getCollege2() {
        return college2;
    }

    public void setCollege2(String college2) {
        this.college2 = college2;
    }

    public String getMajor2() {
        return major2;
    }

    public void setMajor2(String major2) {
        this.major2 = major2;
    }

    public String getYear2() {
        return year2;
    }

    public void setYear2(String year2) {
        this.year2 = year2;
    }

    public String getProjects() {
        return projects;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }

    public String getCareerobjective() {
        return careerobjective;
    }

    public void setCareerobjective(String careerobjective) {
        this.careerobjective = careerobjective;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getProgramming() {
        return programming;
    }

    public void setProgramming(String programming) {
        this.programming = programming;
    }

    

}
