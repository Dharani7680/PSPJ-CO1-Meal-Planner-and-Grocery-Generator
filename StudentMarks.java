public class StudentMarks {
    public static void main(String[] args) {
        int[] marks = { 70, 45, 80, 35, 90 };
        // 1. traversal-print all marks
        System.out.println("Marks of the students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        // 2.search-find 80
        int searchMark = 80;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == searchMark) {
                System.out.println("Found mark " + searchMark + " at index " + i);
                break;
            }
        }
        // 3.couting-count students who passed the exam
        int count = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 50) {
                count++;
            }
        }
        System.out.println("Number of students who passed the exam: " + count);
        // 4.extemes-find highest and lowest
        int highest = marks[0];
        int lowest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

    }
}