package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumValues {
    void sumvalues(){

        System.out.println("Enter size of Array : ");
            Scanner scr=new Scanner(System.in);
            int arysize = scr.nextInt();

        System.out.println("Enter the Array Elements: ");
            ArrayList<Integer> arylistElement = new ArrayList<>();
            for(int i=0;i<arysize; i++){
                arylistElement.add(scr.nextInt());
            }
        System.out.println(arylistElement);

            int sum = arylistElement.stream().collect(Collectors.summingInt(Integer::intValue));

        System.out.println("Sum of Array Value is "+sum);
    }
}
