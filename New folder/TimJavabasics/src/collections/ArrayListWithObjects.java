package collections;
import java.util.*;

public class ArrayListWithObjects {

    public static void main(String[] args) {
        //creating objects and arrayList of Objects
        Employee emp1=new Employee("suriya", "Male", 1);
        Employee emp2=new Employee("shiva", "Male", 2);
        Employee emp3=new Employee("Amitha", "FeMale", 3);
        ArrayList<Employee> employeelist=new ArrayList<Employee>();
        employeelist.add(emp1);
        employeelist.add(emp2);
        employeelist.add(emp3);
        System.out.println("Before Sorting");
        for(Employee employee:employeelist){
            System.out.println(employee.getName());
                }  
        //Using Collections API  to sort based on name field 
        Collections.sort(employeelist,new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("After Sorting");
        // Dont forget to specify the type, same like normal loop 
        //where we use int we are using Employee Object here
        for(Employee employee:employeelist){
    System.out.println(employee.getName());
        }   
    }

}

