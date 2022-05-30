package with_ide;

class Employee{
    double salary = 5000;

    void displaySalary(){
        System.out.println("Employee Salary: Dollor :"+ salary);
    }
}
 class Fulltime extends Employee {

    double hike = 1;

    void increase(){
        salary = salary + (salary * hike);
    }

}
class PartTime extends Employee{
    double hike = 0.25;

    void increase(){
        salary = salary + (salary * hike);
    }

}
public class Q18HierarchicalDemo{
    public static void main(String[] args) {
        Fulltime obj = new Fulltime();
        PartTime obj1 = new PartTime();

        System.out.println("Salary of a full-time:");
        obj.displaySalary();

        System.out.println("Salary of a Part-time:");
        obj1.displaySalary();

        obj.increase();
        obj1.increase();

        System.out.println("Full-time increasement");
        obj.displaySalary();

        System.out.println("Part-time increasement");
        obj1.displaySalary();
    }
}

