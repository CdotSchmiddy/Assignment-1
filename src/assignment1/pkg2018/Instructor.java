/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1.pkg2018;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author Calum
 */

//These are instance variables for the Instructor class

public class Instructor {
    private String firstName, lastName, streetAddress, city, postalCode;
    private LocalDate dateOfBirth;
    private LocalDate dateHired;
    private int employeeNum;
    ArrayList<String> teachableCourses = new ArrayList<>();

    //This is the constructor for the Instructor class
    
    public Instructor(String firstName, String lastName, String streetAddress, String city, String postalCode,  LocalDate dateHired, LocalDate dateOfBirth, int employeeNum) {
        setFirstName(firstName);
        setLastName(lastName);
        setStreetAddress(streetAddress);
        setCity(city);
        setPostalCode(postalCode);
        setHireDate(dateHired);
        setBirthday(dateOfBirth);
        setEmployeeNum(employeeNum);
    }

    /**
     * The "setHireDate" method sets the dateHired while making sure
     * it isn't more than 1 month in the future with an IllegalArgumentException.
    **/
    public void setHireDate(LocalDate dateHired) {
          if(dateHired == (LocalDate.now().plusMonths(2))) {
             throw new IllegalArgumentException("The hire date should be no more than 1 month in the future.");}
             else
                this.dateHired = dateHired;
    }

     /**
     * The "getHireDate" method returns the dateHired.
     * @return 
     */
    public LocalDate getHireDate() {
        return dateHired;
    }
    
    
    /**
     * The "setBirthday" method sets the dateOfBirth while making sure
     * the age isn't more than 90 years old with an IllegalArgumentException.
    **/
    public void setBirthday(LocalDate dateOfBirth) {
        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        if (age>90)
             throw new IllegalArgumentException("Age must be younger than 90 years old.");
              else
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * The "setEmployeeNum" method sets the employeeNum while making sure
     * the employee number is greater than 0 with an IllegalArgumentException.
    **/
    public void setEmployeeNum(int employeeNum) {
        if (employeeNum <= 0 )
            throw new IllegalArgumentException("Employee number must be greater than 0.");
        else
        this.employeeNum = employeeNum;
    }
    
    public String toString(){
        return firstName + " " + lastName;
    }
    
     /**
     * The "getYearBorn" method returns the year born.
     * @return 
     */
    public int getYearBorn(){
        return this.dateOfBirth.getYear();  
   }
    
     /**
     * The "getAgeInYears" method returns the age.
     * @return 
     */
    public int getAgeInYears() {
        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        return age;
    }
    
    /**
     * The "getYearsAtCollege" method returns the yearsAtCollege.
     * @return 
     */
    public int getYearsAtCollege(){
      int yearsAtCollege = Period.between(dateHired, LocalDate.now()).getYears();
      return yearsAtCollege;
  }

    /**
     * The "getFirstName" method returns the firstName.
     * @return 
     */
    public String getFirstName() {
        return firstName;
    }

     /**
     * The "getLastName" method returns the lastName.
     * @return 
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * The "getStreetAddress" method returns the streetAddress.
     * @return 
     */
    public String getStreetAddress() {
        return streetAddress;
    }

     /**
     * The "getCity" method returns the city.
     * @return 
     */
    public String getCity() {
        return city;
    }

    /**
     * The "getPostalCode" method returns the postalCode.
     * @return 
     */
    public String getPostalCode() {
        return postalCode;
    }
    
    /**
     * The "getEmployeeNum" method returns the employeeNum.
     * @return 
     */
    public int getEmployeeNum() {
        return employeeNum;
    }
    
    /**
     * The "getBirthday" method returns the dateOfBirth.
     * @return 
     */
    public LocalDate getBirthday() {
        return dateOfBirth;
    }

    /**
     * The "setFirstName" method sets the firstName while making sure
     * it isn't blank with an IllegalArgumentException.
    **/
    public void setFirstName(String firstName) {
        if (firstName.isEmpty())
            throw new IllegalArgumentException("First name cannot be blank");
        else
        this.firstName = firstName;
    }
    
    /**
     * The "setLastName" method sets the lastName while making sure
     * it isn't blank with an IllegalArgumentException.
    **/
    public void setLastName(String lastName) {
        if (lastName.isEmpty())
            throw new IllegalArgumentException("Last name cannot be blank");
        else
        this.lastName = lastName;
    }
 
    /**
     * The "setStreetAddress" method sets the streetAddress while making sure
     * it isn't blank with an IllegalArgumentException.
    **/
    public void setStreetAddress(String streetAddress) {
        if (streetAddress.isEmpty())
            throw new IllegalArgumentException("Street address cannot be blank");
        else
        this.streetAddress = streetAddress;
    }

    /**
     * The "setCity" method sets the city while making sure
     * it isn't blank with an IllegalArgumentException.
    **/
    public void setCity(String city) {
        if (city.isEmpty())
            throw new IllegalArgumentException("City cannot be blank");
        else
        this.city = city;
    }

    /**
     * The "setPostalCode" method sets the postalCode while making sure
     * it isn't blank with an IllegalArgumentException.
    **/
    public void setPostalCode(String postalCode) {
        if (postalCode.isEmpty())
            throw new IllegalArgumentException("Postal Code cannot be blank");
        else
        this.postalCode = postalCode;
    }
  
    /**
     * The "addCourseToAbilities" method adds courses to list
     * of teachable courses while making sure
     * it isn't blank with an IllegalArgumentException.
    **/
    public void addCourseToAbilities(String courseCode) {
        if(courseCode.isEmpty())
            throw new IllegalArgumentException("Course code cannot be empty");
        else {
        this.teachableCourses.add(courseCode.toUpperCase());
        }
        
    }
   
     public boolean canTeach(String courseCode) {
        if(courseCode == teachableCourses)
        return true;
        else
        return false;
    }
   
    public String listOfSubjectsCertifiedToTeach() {
        System.out.println("The bikes in the collection are:");
        for (String list:teachableCourses)
        System.out.println("   " + list);
       
        System.out.println();
        return (teachableCourses);
    }

