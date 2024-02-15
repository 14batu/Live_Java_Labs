package week9_morning;

import java.time.LocalDate;

public class GraduateStudent extends Student{
    private LocalDate graduateDate;

    public GraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName, LocalDate graduateDate) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        this.graduateDate = graduateDate;
    }

    public LocalDate getGraduateDate() {
        return graduateDate;
    }

    public void setGraduateDate(LocalDate graduateDate) {
        this.graduateDate = graduateDate;
    }

    @Override
    public void study() {
        System.out.println("go on studying after graduating");
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "graduateDate=" + graduateDate +
                '}';
    }
}
