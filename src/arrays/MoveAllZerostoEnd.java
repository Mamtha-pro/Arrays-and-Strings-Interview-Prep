package arrays;

public class MoveAllZerostoEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0, 2, 3, 0,4, 0, 5, 3, 2, 0, 1,0};
        int nonzero[] = new int[arr.length];
        int zero[] = new int[arr.length];
        int t = nonzero[0];
        int k = zero[0];
        int count1 = 0;
        int count2 = 0;


        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > 0) {

                 nonzero[t]=arr[i] ;
                t++;
                count1++;

            } else if(arr[i] == 0) {
                 zero[k] =arr[i];
                k++;
                count2++;

            }
        }
            for (int z = 0; z <= count1-1; z++) {
                System.out.print(nonzero[z] + " ");

            }
            for (int r = 0; r<= count2-1; r++) {
                System.out.print(zero[r] + " ");
            }

    }
}
