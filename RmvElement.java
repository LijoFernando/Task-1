package Task1;


import java.lang.*;
import java.util.Arrays;
import  java.util.ArrayList;
import java.util.Scanner;
public class RmvElement{

    public void rmvelement(){
        Scanner scr=new Scanner(System.in);


        System.out.println("Enter size of Array : ");
        int arysize = scr.nextInt();

        System.out.println("Enter the Array Elements: ");
            ArrayList<Integer> arylistElement = new ArrayList<>();
            for(int i=0;i<arysize; i++){
                    arylistElement.add(scr.nextInt());
                }

        System.out.println("Your Array Elements "+ arylistElement);
        System.out.println("Enter the Element to remove :");
        int number = scr.nextInt();
            arylistElement.remove(new Integer(number));

        System.out.println("Your Array Elements "+ arylistElement);
    }
}

