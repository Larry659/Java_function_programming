package exercise;

import java.util.*;

public class ArrayTest {
    public static void main(String[] args) {
//      int [] arr1 = generateRandomArray(5);
//        int [] newArray = Arrays.copyOf(arr1,arr1.length);
//        System.out.println(Arrays.toString(newArray));
//        Arrays.sort(newArray);
//        System.out.println(Arrays.toString(newArray));
//        int [] score = new int[10];
//        Arrays.fill(score,6);
//

//        int[][] score =new int[3][3];
//        Random ran = new Random();
//        for(int i=0;i< score.length;i++){
//            for(int j=0; j< score.length; j++){
//                score[i][j]= ran.nextInt(100);
//            }
//        }
//        System.out.println(Arrays.deepToString(score));//  for printing multi-dimensional array.
//

        //ArrayList
        String [] originalArray = new String[]{"lanre","kunle","Shade"};
        List<String> names = Arrays.asList(originalArray);
        //NOTE: returned list i.e names is not resizable but mutable;

        String [] days = new String[]{"monday","tuesday","wednesday"};
        List<String> dayList = List.of(originalArray);
        //NOTE: returned list i.e dayList is immutable;
        //System.out.println(Arrays.toString(score));
        ArrayList<String> namesList= new ArrayList<>();
        namesList.add("lanre");
        namesList.add("kunle");
        namesList.add("laide");
        namesList.add("shola");
        namesList.add("michael");
        namesList.sort(Comparator.naturalOrder());
        namesList.sort(Comparator.reverseOrder());
        System.out.println(namesList);
        //Converting ArrayList to primitive array
      // Object[] arr = namesList.toArray();
     //  Arrays.sort(arr);
     // String firstName = (String)arr[0];
      //  System.out.println(Arrays.toString(arr));
    }
    public static int[] generateRandomArray(int value){
        int [] myArray = new int[value];
        Random rand = new Random();
        for (int i=0; i<value; i++){
           myArray[i]= rand.nextInt(100);
        }
        return myArray;
    }
}
