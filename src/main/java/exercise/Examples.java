package exercise;

import java.util.Arrays;
import java.util.List;


public class Examples {
    public static void main(String[] args) {


//        int val = 2;
//        for(int i = 0; i<=6; i++){
//            val -=2;
//           // System.out.println("This is "+ i);
//            System.out.println("this is " + val);
//        }
//      List<Student> students =   List.of(
//              new Student("lanre",26,"chemical"),
//              new Student("kunle",24,"electrical"),
//              new Student("jide",23,"biology"),
//              new Student("sam",25,"computer")
//      );
//
//        for (Student student:students
//             ) {
//            System.out.println("The students department is \n" + student.getName() + ":" + student.getDepartment());
//        }

// String[] names = {"wale","ade","shade","ronke","biola"};
//        int sum = 0;
//        for(int i = 1; i<=10; i++){
//                sum = sum + i;
//        }
//        System.out.println(sum);
        int[] myNum = {5, 8, 9, 7, 2};
        int[] sizes = {1, 0, 4, 5, 6, 0, 2};
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] check = {3, 2, 2, 3};
        int val = 3;
        int[] test = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        //System.out.println(Arrays.toString(reverseArray(myNum)));

        //System.out.println(findMinimumValue(myNum));
        //System.out.println(Arrays.toString(movesZerosToTheEnd(sizes)));
        // System.out.println(Arrays.toString("lanre".split("")));
        //System.out.println(checkPalindrome("Hannah"));
        // System.out.println(Arrays.toString(mergeSortedArray(nums1,3)));
        System.out.println(Arrays.toString(removeElement(check, 3)));
        System.out.println(Arrays.toString(removeDuplicate(test)));
    }

    /*Algorithm to reverse an array*/
    public static int[] reverseArray(int[] arr) {
        int size = arr.length;
        int rev = arr.length - 1;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[rev] = arr[i];
            rev--;
        }
        return result;
    }

    public static int findMinimumValue(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("no supplied or input not compatible");
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    //How to move zeroes to the end of an array
    //sample {1,0,6,5,4,0,2}
    //output{1,6,5,4,2,0,0}
    public static int[] movesZerosToTheEnd(int[] arr) {
        int[] newArr = new int[arr.length];
        int pos = arr.length - 1;
        int frontPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newArr[frontPos] = arr[i];
                frontPos++;
            } else {
                newArr[pos] = arr[i];
                pos--;
            }
        }
        return newArr;
    }

    //How to resize an array
    public static int[] resizeArray(int[] arr, int capacity) {
        //capacity is the size you want your new array to assume
        int[] newArray = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    //How to find the missing number in an array
    public int findMissingValue(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum = sum - i;
        }
        return sum;
    }

    //How to check if a string is palindrome
    public static Boolean checkPalindrome(String word) {
        String[] splittedWord = word.toLowerCase().split("");
        String[] newWord = new String[splittedWord.length];
        int newPos = 0;
        for (int i = splittedWord.length - 1; i >= 0; i--) {
            newWord[newPos] = splittedWord[i];
            newPos = newPos + 1;
        }
        if (Arrays.equals(newWord, splittedWord)) {
            return true;
        }
        return false;
    }

    //    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//    Output: [1,2,2,3,5,6]
//    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    public static int[] mergeSortedArray(int[] nums1, int cap) {
        //int[] answer = {};
        int[] newNums1 = new int[cap];
        int newPos = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != 0)
                newNums1[newPos] = nums1[i];
            newPos += 1;
        }
        return newNums1;

    }


    /*Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).*/
    public static int[] removeElement(int[] nums, int val) {
        int[] newArr = new int[nums.length];
        int newPos = 0;
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                newArr[newPos] = nums[i];
                size += 1;
                newPos += 1;
            }
        }
        return newArr;
    }

    /*Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/
// int [] test ={0,0,1,1,1,2,2,3,3,4};
    public static int[] removeDuplicate(int[] nums) {
        int[] newArray = new int[nums.length];
        int newPos = 0;
        newArray[newPos] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != newArray[i - 1]) {
                newPos += 1;
                newArray[newPos] = nums[i];
            }

        }
        return newArray;
    }

}
