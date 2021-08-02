package Task1;

import java.util.Scanner;

public class Task1Runner {
    public static void main (String args[]){

      Scanner scr = new Scanner (System.in);
      System.out.println ("Choose the Task number to Execute(1 to 15):");
      int prgnumber = scr.nextInt(); //get program number

      switch (prgnumber) {
      case 1:
           //Program1 Find Index of Array Value
           FindIndex fi = new FindIndex();
           fi.findIndex();
           return;
      case 2:
           //program2 Find Sum of Array Value
           SumValues sv = new SumValues();
           sv.sumvalues();
           return;
      case 3:
           //program3 Remove particular Array element
           RmvElement re = new RmvElement();
           re.rmvelement();
           return;
      case 4:
           //program 4 Insert Element at Specific index
           InsElement ie = new InsElement();
           ie.insElement();
           return;
      case 5:
            //program 5 Array Contain Specific Value
            AryContain ac = new AryContain();
            ac.aryContain();
            return;
      case 6:
            //program 6 Find MIN and MAX value
            AryMinMax aMinMax = new AryMinMax();
            aMinMax.aryMinMax();
            return;
      case 7:
           //program 7 Common Element between two String Array and Common Element between two Integer Array
           AryCommon aryc = new AryCommon();
           aryc.commonString();
           aryc.CommonIntegers();
           return;
      case 8:
           //program 8 Remove Duplicate from the Array
           RmvDuplicate rmveDup = new RmvDuplicate();
           rmveDup.rmvduplicate();
      case 9:
           //program 9 Number of Odd and Even Number in the array
           OddEvenIntegers oddeven = new OddEvenIntegers();
           oddeven.findOddEven();
      case 10:
           //program 10 Find Average value of an Array of Integer : Except first and Last integer
           IntegerAvg avgin = new IntegerAvg();
           avgin.averageInteger();
      case 11:
          /*Program 11 find the sum of the two elements of a given array which is equal to a
          given integer
          */
      case 12:
           //Program 12
      case 13:
           //Program 13 split even and odd value in array and add odd first elements and then even elements
           OddEvenOrder oeo = new OddEvenOrder();
           oeo.orderOddEven();
      case 14:
          //Program 14
      case 15:
          //Program 15
      default:
          //Streamex s=new Streamex();
          //s.steamEx();
      }
    }
}