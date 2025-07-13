//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentInfo std1 = new StudentInfo();
        StudentInfo std2 = new StudentInfo();
        StudentInfo std3 = new StudentInfo();
        StudentInfo std4 = new StudentInfo();

        std1.StuName = "Chris";
        std1.StuAge = 14;
        std1.StuGrade = 95;
        std2.StuName = "Mark";
        std2.StuAge = 13;
        std2.StuGrade = 75;
        std3.StuName ="Karina";
        std3.StuAge = 14;
        std3.StuGrade = 80;
        std1.display();
        std2.display();
        std3.display();

    }
}