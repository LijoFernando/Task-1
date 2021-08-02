package Task1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AryCommon {

    Scanner scr=new Scanner(System.in);
    //Find common Element between two String Array
    void commonString() {

        System.out.println ("Compare Between two String Array ");
        System.out.println ("Enter size of Array : ");

        int arysize = scr.nextInt();

        ArrayList<String> arylist1 = new ArrayList<>();
        ArrayList<String> arylist2 = new ArrayList<>();
        System.out.println("Enter the FirstArray Elements: ");
        for(int i=0; i<arysize; i++){
            arylist1.add(scr.next());
        }
        System.out.println("Enter the SecondArray Elements: ");
        for (int i=0; i<arysize; i++){
            arylist2.add(scr.next());
        }

        System.out.println("Your First Array Elements "+ arylist1+" and Second Array Elements "+arylist2);

        System.out.println(arylist1.stream().filter(arylist2::contains).collect(Collectors.toList()));
    }

    //Find common Element between two Integer Array
    void CommonIntegers(){
      System.out.println("Compare Between two Integer Array ");
      System.out.println("Enter size of Array : ");
        int arysize = scr.nextInt();


        ArrayList<Integer> arylist1 = new ArrayList<>();
        ArrayList<Integer> arylist2 = new ArrayList<>();

        System.out.println("Enter the FirstArray Elements: ");
        for(int i=0; i<arysize; i++){
            arylist1.add(scr.nextInt());
        }

        System.out.println("Enter the SecondArray Elements: ");
        for(int i=0; i<arysize; i++){
            arylist2.add(scr.nextInt());
        }

        System.out.println("Your First Array Elements "+ arylist1+" and Second Array Elements "+arylist2);

        System.out.println(arylist1.stream().filter(arylist2::contains).collect(Collectors.toList()));
    }

}