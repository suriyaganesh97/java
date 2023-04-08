package collections;

import java.util.ArrayList;
import java.util.Collection;


public class SimpleArrayList {
    public static void main(String args[])
	{
        Collection<Integer> num=new ArrayList<Integer>();
        num.add(5);
        num.add(4);
        num.add(3);
        System.out.println(num);
        for(int i:num){
            System.out.println(i);
        }

        
    }
}
