package arrays;

public class MaximumArray {
    public static void main(String[] args) {
        int [] arr =  {1,4,76,89,23,56,24,321,43};
        int max = arr[0];

        for(int i =0; i<= arr.length-1;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The Maximum Element in the array is : " + max);

    }
}
