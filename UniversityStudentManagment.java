// UniversityStudentManagment 
class Student {
    String name;
    int age;
    int studentId;

    Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
    }
}

class BTechStudent extends Student {
    String branch;
    int semester;

    BTechStudent(String name, int age, int studentId,
            String branch, int semester) {
        super(name, age, studentId);
        this.branch = branch;
        this.semester = semester;
    }

    void displayDetails() {
        displayStudent();
        System.out.println("Branch: " + branch);
        System.out.println("Semester: " + semester);
    }
}

public class UniversityStudentManagment {
    public static void main(String[] args) {

        BTechStudent s = new BTechStudent(
                "Dharani", 18, 101, "CSE", 3);

        s.displayDetails();
    }
}
