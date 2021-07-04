package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerAvg {
    void averageInteger(){
        //getting Array size form user
        System.out.println("Enter size of Array : ");
        Scanner scr=new Scanner(System.in);
        int arysize = scr.nextInt();

        //getting Array elements form user
        System.out.println("Enter the Array Elements: ");
        List<Integer> arraylistElement = new ArrayList<>(arysize);
        for(int i=0;i<arysize; i++){
            arraylistElement.add(scr.nextInt());
        }
        System.out.println("Your Array Elements "+ arraylistElement);

        //create arraylist except first and last element
        List<Integer> filterdarrayList = arraylistElement.stream()
                .skip(arraylistElement.get(0))
                .limit(arysize-2)
                .collect(Collectors.toList());;
        System.out.println("Your Array Elements : Except First and last Elements "+ filterdarrayList);

        //Sum of array of integers
        Integer sum=filterdarrayList.stream().collect(Collectors.summingInt(Integer::intValue));

        //getting average value of integer array
        float avg=sum/filterdarrayList.size();

        System.out.println("Average of Array of integers is "+avg);
    }
}
