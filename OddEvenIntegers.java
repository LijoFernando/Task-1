package Task1;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OddEvenIntegers {
    void findOddEven(){
        System.out.println("Enter size of Array : ");
        Scanner scr=new Scanner(System.in);
        int arysize = scr.nextInt();
        int a=0;

        System.out.println("Enter the Array Elements: ");
        ArrayList<Integer> arylistElement = new ArrayList<>(arysize);
        for(int i=0; i<arysize; i++){
            arylistElement.add(scr.nextInt());
        }

        System.out.println("Your Array Elements "+ arylistElement);
        Stream<Integer> Even= arylistElement.stream().filter(i->i.intValue()%2==0);
        Stream<Integer> odd= arylistElement.stream().filter(i->i.intValue()%2!=0);
        System.out.println("No of Odd Numbers in "+odd.count());
        System.out.println("No of Even Numbers in "+Even.count());
    }
}
