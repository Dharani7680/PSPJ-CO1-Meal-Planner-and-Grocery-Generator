// ConstructorOverloading {
class Student {

    String name;
    int age;

    // Constructor 1
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2
    Student(String n) {
        name = n;
        age = 0;
    }

    // Constructor 3
    Student(String n, int a) {
        name = n;
        age = a;
    }
}
