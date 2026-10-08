class student {

    String studentId;
    String studentName;
    String department;
    String mobile;

    public void displaystudent() {
        System.out.println("-------------student details--------------->");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Department   : " + department);
        System.out.println("Mobile       : " + mobile);
    }

    public static void main(String[] args) {

        student s1 = new student();

        s1.studentId = "401";
        s1.studentName = "rahul";
        s1.department = "CSE";
        s1.mobile = "9876543210";

        s1.displaystudent();
    }
}