package Week8.Tues.Question2;

public class SchoolReportSystem {
    public static void main(String[] args) {
        ReportCard r1 = new ReportCard();
        r1.studentName = "Asha";
        r1.marks[0] = 85;
        r1.marks[1] = 92;
        r1.marks[2] = 78;
        r1.marks[3] = 88;
        r1.marks[4] = 95;
        r1.generateReportCard();

        ReportCard r2 = new ReportCard();
        r2.studentName = "Bibek";
        r2.marks[0] = 55;
        r2.marks[1] = 60;
        r2.marks[2] = 48;
        r2.marks[3] = 65;
        r2.marks[4] = 50;
        r2.generateReportCard();

        System.out.println("Total report cards generated: " + ReportCard.reportCardsGenerated);
    }
}
