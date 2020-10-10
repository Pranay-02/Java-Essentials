public class Employee {
    String name ,city;
    int age;
    void display () {
        System.out.println("\n The name of employee is " + name);
        System.out.println(" The age of employee is " + age);
        System.out.println(" The city of employee is " + city);
    }
    public static void main(String args[]) {
        Employee e = new Employee();
        Employee e1 = new Employee();
        
        e.name = "Pranay";
        e.age = 20;
        e.city = "Delhi";
        e.display();
        
        e1.name = "Ram";
        e1.age = 18;
        e1.city = "Mumbai";
        e1.display();
    }
}