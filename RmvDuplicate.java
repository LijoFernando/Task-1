package Task1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RmvDuplicate {
    void rmvduplicate(){
        System.out.println("Enter size of Array : ");
        Scanner scr=new Scanner(System.in);
        int arysize = scr.nextInt();

        System.out.println("Enter the Array Elements: ");
        List<Integer> arraylistElement = new ArrayList<>(arysize);
        for(int i=0;i<arysize; i++){
            arraylistElement.add(scr.nextInt());
        }
        System.out.println("Your Array Elements "+ arraylistElement);
        arraylistElement= arraylistElement.stream().distinct().collect(Collectors.toList());
        System.out.println("Your After Removed Duplicates : Array Elements "+ arraylistElement);
    }
}
