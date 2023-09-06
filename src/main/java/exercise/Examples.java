package exercise;

import java.util.Arrays;

public class Examples {
    public static void main(String[] args) {
// String[] names = {"wale","ade","shade","ronke","biola"};
//        int sum = 0;
//        for(int i = 1; i<=10; i++){
//                sum = sum + i;
//        }
//        System.out.println(sum);
        int[] myNum = {5,8,9,7,2};
        int[] sizes = {1,0,4,5,6,0,2};
        System.out.println(Arrays.toString(reverseArray(myNum)));
        System.out.println(findMinimumValue(myNum));
        System.out.println(Arrays.toString(movesZerosToTheEnd(sizes)));
   }
/*Algorithm to reverse an array*/
   public static int [] reverseArray(int [] arr){
        int size = arr.length;
        int rev = arr.length-1;
        int [] result = new int[size];
        for(int i=0; i<size; i++){
            result[rev] = arr[i];
            rev--;
        }
        return result;
   }

   public static int findMinimumValue(int [] arr){
       if(arr==null || arr.length ==0){
           throw new IllegalArgumentException("no supplied or input not compatible");
       }
       int min = arr[0];
       for (int i=0; i< arr.length;i++){
        if(arr[i]<min){
            min = arr[i];
        }
       }
       return min;
   }
   public static int findSecondMax(int[] arr){
       int max = Integer.MIN_VALUE;
       int secondMax = Integer.MIN_VALUE;
       for(int i=0; i<arr.length; i++) {
           if(arr[i]>max){
               secondMax=max;
               max= arr[i];
           } else if (arr[i]>secondMax && arr[i]!=max) {
               secondMax=arr[i];
           }
       }
return secondMax;
   }

   //How to move zeroes to the end of an array
    //sample {1,0,6,5,4,0,2}
    //output{1,6,5,4,2,0,0}
    public static int[] movesZerosToTheEnd(int [] arr){
       int[] newArr = new int[arr.length];
       int pos = arr.length - 1;
       int frontPos = 0;
       for(int i =0; i<arr.length; i++){
           if(arr[i]>0){
               newArr[frontPos]=arr[i];
               frontPos ++;
           }
           else{
               newArr[pos]=arr[i];
               pos --;
           }
       }
       return newArr;
    }

    //How to resize an array
    public static int[] resizeArray(int [] arr, int capacity){
       //capacity is the size you want your new array to assume
       int [] newArray = new int[capacity];
       for(int i=0; i< arr.length; i++){
           newArray[i]=arr[i];
       }
       return newArray;
    }
}
