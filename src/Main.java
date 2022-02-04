import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher samantha = new Teacher(1, "Samantha", 5000);
        Teacher mala = new Teacher(2, "Mala", 9000);
        Teacher vasudev = new Teacher(3, "Vasudev", 6000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(samantha);
        teacherList.add(mala);
        teacherList.add(vasudev);

        Student tammana = new Student(1, "Tammana", 40);
        Student radha = new Student(2, "Radha", 70);
        Student jodha = new Student(3, "Jodha", 50);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tammana);
        studentList.add(jodha);
        studentList.add(radha);

        School abc = new School(teacherList, studentList);
        tammana.payFees(60000);
        radha.payFees(50000);
        Teacher mina = new Teacher(6, "Mina", 9000);
        abc.addTeacher(mina);
        System.out.println("school has earned Rs." + abc.getTotalMoneyEarned());
   
   System.out.println(" --------- School's Pay Salary ------");
   samantha.receiveSalary(samantha.getSalary());
   System.out.println(
    "School has spent for salary to " + samantha.getName() + " and now has Rs." + abc.getTotalMoneyEarned());
    vasudev.receiveSalary(vasudev.getSalary());
    System.out.println(
     "School has spent for salary to " + vasudev.getName() + " and now has Rs." + abc.getTotalMoneyEarned());
     mina.receiveSalary(mina.getSalary());

     System.out.println(
     "School has spent for salary to " + mina.getName() + " and now has Rs." + abc.getTotalMoneyEarned());
    System.out.println(radha);
    System.out.println(jodha);
    System.out.println(vasudev);
  
    }
           
}
