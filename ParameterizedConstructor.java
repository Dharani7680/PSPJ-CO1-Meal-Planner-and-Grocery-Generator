class Student {

    String name;
    int age;

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {

        // Creating objects and passing values
        Student s1 = new Student("Dharani", 18);
        Student s2 = new Student("Bhavya", 19);

        // Printing values
        System.out.println("Student 1:");
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

        System.out.println();

        System.out.println("Student 2:");
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
    }
}