package oopsCoffeeMachine;

import java.util.*;

public class MainClass {
    public static List<Menu> itemList = new ArrayList<Menu>();
    public static void main(String[] args) {
        boolean is_machine_running=true;
        initialiseMenu();
        Scanner sc =new Scanner(System.in);
        //this below code is to make the machine running
        while(is_machine_running){
            System.out.println("Do you want a cup of coffee. Y/N");
            String decision=sc.nextLine();
            decision.toLowerCase();
            if(decision.equals("y")){
                System.out.println("what do you want ");
                String userChoiceOfDrink=sc.nextLine();
                getItems();
                if(findItems(userChoiceOfDrink)){
                    System.out.println("this drink is present");
                } else{
                    System.out.println("please enter a valid drink");
                }

            } else{
                is_machine_running=false;
            }

        }
        sc.close();

    }
    public static void initialiseMenu(){
        //we can add new Menu items in this which will get added to the list
        itemList.add(new Menu("latte", 200, 150, 24,  2.5));
        itemList.add(new Menu("espresso", 50, 0, 80,  1.5));
        itemList.add(new Menu("capaccino", 250, 50, 24,  3));
    }
    public static void getItems(){
        for(Menu item:itemList){
            System.out.println(item.getNameOfDrink());
        }
    }
    public static boolean findItems(String userChoiceOfDrink){
        boolean isItemPresent=false;
        for(Menu item:itemList){
            if(item.getNameOfDrink().equalsIgnoreCase(userChoiceOfDrink)){
                isItemPresent=true;
            }
        }
        return isItemPresent;
    }
}
