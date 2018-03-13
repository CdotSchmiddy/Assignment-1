/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1.pkg2018;

import java.util.ArrayList;

/**
 *
 * @author Calum
 */
class Course {
    private Instructor instructor;
    private String courseCode, courseName, room;
    private int maxStudents;

    public ArrayList<Student> students;
    
public Course(Instructor instructor, String courseCode, String courseName, String room, int maxStudents)
    {      
        //setInstructor(instructor);
        setCourseCode(courseCode);
        setCourseName(courseName);
        setRoom(room);
        setMaxStudents(maxStudents);
        this.students = new ArrayList<Student>();
    }
    
    public void setCourseName(String courseName) {
        if (courseName.isEmpty())
            throw new IllegalArgumentException("Course name cannot be blank");
        else
        this.courseName = courseName;
    }

     public void setCourseCode(String courseCode) {
        if (courseCode.isEmpty())
            throw new IllegalArgumentException("Course code cannot be blank");
        else
        this.courseName = courseCode;
    }
    
    public void setRoom(String room) {
        if (room.isEmpty())
            throw new IllegalArgumentException("Room name cannot be blank");
        else
        this.room = room;
    }

    public String getCourseName() {
        return courseName;
    }
    
    public String getCourseCode() {
        return courseCode;
    }
    
    public String getRoom() {
        return room;
    }
    
    public String getInstructor() {
        return instructor;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setInstructor(String instructor) {
        if(courseCode == listOfSubjectsCertifiedToTeach)
        this.instructor = instructor;
    }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents > 45 && maxStudents < 0)
             throw new IllegalArgumentException("Max number of students must be less than or equal to 45 and above 0");
              else
        this.maxStudents = maxStudents;
    }
    
    @Override
    public String toString(){
    return courseName + " " + courseCode;
}
    
}


