package week9_morning;

public class StudentClient {
    public static void main(String[] args) {
        Person person  = new Person("Batuhan",31,"Male");
        System.out.println(person);


        Student student = new Student("Aysun",24,"female","!23","IT",'A',"Cydeo");
        System.out.println(student);
    }
}
