package Task1;
import java.util.ArrayList;
import java.util.Scanner;

public class InsElement {
    void insElement(){
        System.out.println("Enter size of Array : ");
            Scanner scr=new Scanner(System.in);
            int arysize = scr.nextInt();

        System.out.println("Enter the Array Elements: ");
            ArrayList<Integer> arylistElement = new ArrayList<>();
            for(int i=0; i<arysize; i++){
                arylistElement.add(scr.nextInt());
            }
        System.out.println("Your Array Elements "+ arylistElement);
        System.out.println("Enter the Index and Element " );
            int index=scr.nextInt();
            int element=scr.nextInt();
            arylistElement.add(index,element);
        System.out.println("After insertion : Your Array Elements "+ arylistElement);

    }
}
