package Task1;
import java.lang.*;
import java.util.*;
import java.util.Scanner;

public class  FindIndex {
    public void  findIndex (){

     System.out.println("Enter size of Array : ");
     Scanner scr = new Scanner(System.in);
     int arysize = scr.nextInt(); //array size

     System.out.println("Enter the Array Elements: ");
     ArrayList<Integer> arraylistElement = new ArrayList<>();
        for(int i=0;i<arysize; i++){
            arraylistElement.add(scr.nextInt()); //iterate and insert the array value to arraylist
        }

     System.out.println("Your Array Elements "+ arraylistElement); //print inserted array value

     System.out.print("Enter the Number to find index ");
     int aryVal = scr.nextInt(); // array value to find

     System.out.println("The inex of "+aryVal+" is "+arraylistElement.indexOf(aryVal));
  }
}
