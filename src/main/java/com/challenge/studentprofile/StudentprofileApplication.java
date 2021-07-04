package com.challenge.studentprofile;

import com.challenge.studentprofile.StudentProfile.StudentProfile;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentprofileApplication {

	public static void main(String[] args) {
		//SpringApplication.run(StudentprofileApplication.class, args);
		StudentProfile profileOne = new StudentProfile("Sally","Salmon","Film",3.75,2022);
		StudentProfile profileTwo = new StudentProfile("Samad","Karim","Computer Science",3.00,2025);

		profileTwo.incrementExpectedGraduationYear();
		System.out.println(profileTwo.expectedYearToGraduate);
	}

}
