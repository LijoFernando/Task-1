package Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class AryContain {
    void aryContain(){
        Scanner scr=new Scanner(System.in);

        System.out.println("Enter size of Array : ");
        int arysize = scr.nextInt();

        System.out.println("Enter the Array Elements: ");
        ArrayList<Integer> arylistElement = new ArrayList<>();
            for(int i=0; i<arysize; i++){
              arylistElement.add(scr.nextInt());
            }

        System.out.println("Your Array Elements "+ arylistElement);
        int val=scr.nextInt();
        boolean test = arylistElement.contains(val);
        System.out.println(test);
    }
}
