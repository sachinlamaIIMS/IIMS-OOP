package Week8.Tues.Question2;

class ReportCard {
    String studentName;
    int[] marks = new int[5];

    static int reportCardsGenerated = 0;

    int calculateTotal() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }
        return total;
    }

    double calculateAverage() {
        return calculateTotal() / 5.0;
    }

    String getGrade() {
        double avg = calculateAverage();
        String grade;
        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 75) {
            grade = "B";
        } else if (avg >= 60) {
            grade = "C";
        } else {
            grade = "D";
        }
        return grade;
    }

    void generateReportCard() {
        reportCardsGenerated++;
        System.out.println("Student: " + studentName);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + getGrade());
        System.out.println("------------------------");
    }
}

