package arrays;

public class SecondMaxElemnet {
    public static void main(String[] args) {
        int [] arr =  {9,2,3,4,6,7,8,10};
        int max1 = arr[0];
        int max2 = arr[0];

        for(int i =0; i<= arr.length-1;i++){
            if(arr[i]>max1) {
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2){
                 max2 = arr[i];
        }

            }
        System.out.println("The Maximum Element in the array is : " + max2);

        }


    }

