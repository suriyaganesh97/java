package oops;

public class Employee {
    public static void main(String[] args) {
        User user1=new User(1, "suriya", "Presales consultant");
        User user2=new User(2, "sudharshan", "Presales consultant");
        System.out.println(user1.getId());
        System.out.println(user2.getName());
        user1.setId(7);
        System.out.println("after changing "+user1.getId());
    }
}

