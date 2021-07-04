package Task1;
import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class  FindIndex {
    public void  findIndex (){

     System.out.println("Enter size of Array : ");
        Scanner scr=new Scanner(System.in);
        int arysize = scr.nextInt();

     System.out.println("Enter the Array Elements: ");
        ArrayList<Integer> arraylistElement = new ArrayList<>();
            for(int i=0;i<arysize; i++){
                 arraylistElement.add(scr.nextInt());
            }
     System.out.println("Your Array Elements "+ arraylistElement);
     System.out.print("Enter the Number to find index ");

        int aryVal = scr.nextInt();

     System.out.println("The inex of "+aryVal+" is "+arraylistElement.indexOf(aryVal));


  }
}
