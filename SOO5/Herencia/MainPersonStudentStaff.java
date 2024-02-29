package SOO5.Herencia;
import SOO5.Herencia.Clases.Person;
import SOO5.Herencia.Clases.Student;
import SOO5.Herencia.Clases.Staff;

public class MainPersonStudentStaff {
    public static void main(String args[]) {
        //Información
        Person p1 = new Person("Ana", "Calle Toledo");
        Student s1 = new Student("Ana", "Calle Toledo", "Informática", 3, 500);
        Staff st1 = new Staff("Ana", "Calle Toledo", "Alto Jarama", 200);
        //Mostrar los datos
        System.out.println(p1.toString());
        System.out.println(s1.toString());
        System.out.println(st1.toString());
    }
}
