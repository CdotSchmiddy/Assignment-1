/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1.pkg2018;

import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Calum
 */

//These are instance variables for the Student class

class Student 
{
    private String firstName, lastName, streetAddress, city, postalCode;
    private int studentNum;
    private LocalDate dateOfBirth;
    private LocalDate dateEnrolled;
    private boolean inGoodStanding;
    

    //This is the constructor for the Student class

    public Student(String firstName, String lastName, String streetAddress, String city, String postalCode, LocalDate dateOfBirth, LocalDate dateEnrolled, int studentNum)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setStreetAddress(streetAddress);
        setCity(city);
        setPostalCode(postalCode);
        setDateOfBirth(dateOfBirth);
        setDateEnrolled(dateEnrolled);
        inGoodStanding = true;
        setStudentNum(studentNum);  
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
     * The "setLastName" method sets the lastName while making sure
     * it isn't blank with an IllegalArgumentException.
    **/
    public void setLastName(String lastName) {
        if (lastName.isEmpty())
            throw new IllegalArgumentException("Last Name cannot be blank");
        else
        this.lastName = lastName;
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
     * The "studentNum" method sets the studentNum while making sure
     * it isn't blank with an IllegalArgumentException.
    **/
    public void setStudentNum(int studentNum) {
        if (studentNum == -1 )
            throw new IllegalArgumentException("Student number cannot be blank");
        else
        this.studentNum = studentNum;
    }

    /**
     * The "setDateOFBirth" method sets the dateOfBith 
     * while making sure the age isn't over 100 years old
     * with an IllegalArgumentException.
    **/
    public void setDateOfBirth(LocalDate dateOfBirth) {
        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        if (age>100)
             throw new IllegalArgumentException("Age must be younger than 100 years old");
              else
        this.dateOfBirth = dateOfBirth;
    }
    
    /**
     * The "getStreetAddress" method returns the streetAddress.
     * @return 
     */
    public String getStreetAddress() {
        return streetAddress;
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
     * The "getDateOfBirth" method returns the dateOfBirth.
     * @return 
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    
    /**
     * The "getStudentNum" method returns the studentNum.
     * @return 
     */
    public int getStudentNum() {
            return studentNum;
    }
    
     /**
     * The "getDateEnrolled" method returns the dateEnrolled.
     * @return 
     */
    public LocalDate getDateEnrolled() {
        return dateEnrolled;
    }

    /**
     * The "setDateEnrolled" method sets the dateEnrolled 
     * while making sure the enrollment date is prior to the current date
     * with an IllegalArgumentException.
    **/
    public void setDateEnrolled(LocalDate dateEnrolled) {  
       if(dateEnrolled.isAfter(LocalDate.now())) {
             throw new IllegalArgumentException("The enrollment date should be prior to the current date");}
             else
                this.dateEnrolled = dateEnrolled;
    }

    public boolean isInGoodStanding() {
        return inGoodStanding;
    }

    public void setInGoodStanding(boolean inGoodStanding) {
        this.inGoodStanding = inGoodStanding;
    }
    
   public void suspendStudent()
   {
       inGoodStanding = false; 
   }
   
   public void reinstateStudent()
   {
       inGoodStanding = true;
   }
   
    /**
    * The "toString" method displays the variables 
    * firstName, lastName and studentNum.
    **/ 
   public String toString()
{
    return firstName + " " + lastName + ", student number: " + studentNum;
}
 
    /**
    * The "getAge" method returns the age..
    * @return 
    */
   public int getAge()
   {
        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        return age;
   }
   
    /**
    * The "getYearBorn" method returns the year born..
    * @return 
    */
   public int getYearBorn()
   {
     return this.dateOfBirth.getYear();  
   }
}