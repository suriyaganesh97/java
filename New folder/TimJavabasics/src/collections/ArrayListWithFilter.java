package collections;

import java.util.*;

public class ArrayListWithFilter {
    public static void main(String[] args) {
    //creating Employee objects and adding them to arrayList
    Employee emp1=new Employee("suriya", "Male", 1);
    Employee emp2=new Employee("shiva", "Male", 2);
    Employee emp3=new Employee("Amitha", "FeMale", 3);
    ArrayList<Employee> employeelist=new ArrayList<Employee>();
    employeelist.add(emp1);
    employeelist.add(emp2);
    employeelist.add(emp3);
    
    //using Simple loop and if condition to filter Male Employees
    for(Employee employee:employeelist){
        System.out.println("Male Employees");
        if(employee.getGender().equals("Male")){
            System.out.println("name "+employee.getName()+" ID "+employee.getId());
        }
        System.out.println("\nFeMale Employees");
        if(employee.getGender().equals("FeMale")){
            System.out.println("name "+employee.getName()+" ID "+employee.getId());
        }
    }
    }

}
