//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentInfo std1 = new StudentInfo();
        StudentInfo std2 = new StudentInfo();
        StudentInfo std3 = new StudentInfo();
        StudentInfo std4 = new StudentInfo();

        std1.studentName= "Chris";
        std1.studentAge = 14;
        std1.studentGrade = 95;
        std2.studentName = "Mark";
        std2.studentAge = 13;
        std2.studentGrade = 75;
        std3.studentName ="Karina";
        std3.studentAge = 14;
        std3.studentGrade = 80;
        std1.display();
        std2.display();
        std3.display();

    }
}