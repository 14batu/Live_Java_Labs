package week9_morning;

import java.time.LocalDate;

public class UnderGraduate extends Student{
    private LocalDate underGraduateDate;

    public UnderGraduate(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName, LocalDate underGraduateDate) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        this.underGraduateDate = underGraduateDate;
    }

    public LocalDate getUnderGraduateDate() {
        return underGraduateDate;
    }

    public void setUnderGraduateDate(LocalDate underGraduateDate) {
        this.underGraduateDate = underGraduateDate;
    }

    @Override
    public void study() {
        System.out.println("i am underGraduate");
    }

    @Override
    public String toString() {
        return super.toString() +"{" +
                "underGraduateDate=" + underGraduateDate +
                '}';
    }
}
