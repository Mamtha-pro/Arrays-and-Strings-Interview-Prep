package arrays;

public class MiniumArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,6,8,4,6,9};
        int min = arr[0];

        for(int i = 1 ; i <= arr.length-1; i++ ){
            if(arr[i]<min){
                min = arr[i];

            }

        }
        System.out.println(min);

    }

}


