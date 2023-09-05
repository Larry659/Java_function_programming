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
        System.out.println(Arrays.toString(reverseArray(myNum)));
        System.out.println(findMinimumValue(myNum));
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
}
