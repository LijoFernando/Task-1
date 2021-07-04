package Task1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OddEvenOrder {
    void orderOddEven(){
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
        Stream<Integer> resultingStream = Stream.concat(Even, odd);

    }
}
