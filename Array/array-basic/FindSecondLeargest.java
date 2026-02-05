class FindSecondLeargest{
   public static void main(String[] args) {
    
// there have two apprach to find second largest number in array in java 
// 1. using sorting
// 2. without sorting
// using sorting 
    int[] arr = {12, 35, 1, 10, 34, 1};
    int n = arr.length;
    java.util.Arrays.sort(arr);
    System.out.println("Second largest number is: " + arr[n-2]);

    // without sorting
    int[] arr2 = {12, 35, 1, 10, 34, 1};
    int n2 = arr2.length;
    

   }
}