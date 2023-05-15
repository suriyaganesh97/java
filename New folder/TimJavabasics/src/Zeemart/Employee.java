package Zeemart;
import java.util.*;
public class Employee {
    private int id;
    private String name;
    private int age;
    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        ArrayList<Employee> emp_list= new ArrayList<Employee>();
        Employee emp=new Employee(2,"suriya",12);
        Employee emp2=new Employee(3,"siva",56);
        Employee emp3=new Employee(4,"qwer",67);
        emp_list.add(0, emp);
        emp_list.add(1, emp2);
        emp_list.add(2, emp3);
        Employee newemp=new Employee(0, null, 0);
        for(Employee employees:emp_list){
if(employees.getId()==3){
    // System.out.println(employees.getAge()+employees.getAge());
    newemp.setAge(employees.getAge());
    newemp.setId(employees.getId());
    newemp.setName(employees.getName());
}
        }
        //hashmap imple is wrong check after some time
//         HashMap<Integer, Employee> languageMap = convertArrayListToHashMap(emp_list);
//     // if()
//         // printing the HashMap
//         for (Map.Entry< Integer, Employee> entry : languageMap.entrySet()) {
  
//             System.out.println(entry.getValue() );
//         }
        

// // emp_list.stream().filter()
//     }


//     private static HashMap<Integer, Employee>
//     convertArrayListToHashMap(ArrayList<Employee> arrayList)
//     {
  
//         HashMap< Integer, Employee> hashMap = new HashMap<>();
  
//         for (Employee str : arrayList) {
  
//             hashMap.put(str.getName().length(),str );
//         }
  
//         return hashMap;
     }
}
