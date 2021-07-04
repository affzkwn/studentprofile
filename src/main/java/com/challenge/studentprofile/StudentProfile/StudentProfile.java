package com.challenge.studentprofile.StudentProfile;

public class StudentProfile {
    String firstName;
    String lastName;
    String declareMajor;
    double gpa;
    public int expectedYearToGraduate;

    public StudentProfile(String firstName, String lastName, String declareMajor, double gpa, int expectedYearToGraduate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.declareMajor = declareMajor;
        this.gpa = gpa;
        this.expectedYearToGraduate = expectedYearToGraduate;
    
    }

    public void incrementExpectedGraduationYear() {

        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
 
    }

    


}
