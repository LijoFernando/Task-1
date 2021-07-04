package Task1;

import java.util.ArrayList;
import java.util.Scanner;


public class AryMinMax {
    void aryMinMax(){
        System.out.println("Enter size of Array : ");
            Scanner scr=new Scanner(System.in);
            int arysize = scr.nextInt();

        System.out.println("Enter the Array Elements: ");
            ArrayList<Integer> arylistElement = new ArrayList<>();
                for(int i=0; i<arysize; i++){
                    arylistElement.add(scr.nextInt());
                }

        System.out.println("Your Array Elements "+ arylistElement);
        Integer Min = arylistElement.stream().min(Integer::compare).get();
        Integer Max = arylistElement.stream().max(Integer::compare).get();
        System.out.println("Max value is "+Max);
        System.out.print("Min Value is "+Min);
    }
}
