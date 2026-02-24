package com.mycompany.schoolrecord;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        DatabaseHandler db = new DatabaseHandler();

        // Insert sample students
        db.insertStudent(new Student.StudentBuilder()
                .withGivenName("Lance Errol")
                .withMiddleName("N/A")
                .withSurname("Cuaton")
                .withAge(18)
                .withYear(1)
                .withMajor("BSIT")
                .withSection(15)
                .withStudentID(1)
                .withPhone("09123456789")
                .withDob("2007-03-20")
                .build());

        db.insertStudent(new Student.StudentBuilder()
                .withGivenName("Gavrie")
                .withMiddleName("N/A")
                .withSurname("Espiritu")
                .withAge(18)
                .withYear(1)
                .withMajor("BSIT")
                .withSection(15)
                .withStudentID(2)
                .withPhone("09987654321")
                .withDob("2007-01-01")
                .build());
        
         db.insertStudent(new Student.StudentBuilder()
                .withGivenName("Stephen")
                .withMiddleName("N/A")
                .withSurname("Umayam")
                .withAge(18)
                .withYear(1)
                .withMajor("BSIT")
                .withSection(15)
                .withStudentID(3)
                .withPhone("09987654321")
                .withDob("2003-01-01")
                .build());

        List<Student> students = db.fetchAllStudents();

        System.out.println("\nMASTER LIST OF STUDENTS");
        System.out.println("============================");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}