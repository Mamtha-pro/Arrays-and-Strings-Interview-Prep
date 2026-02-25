package arrays;

public class MoveAllZerostoEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 0, 5, 3, 2, 0, 1};
        int nonzero[] = new int[arr.length];
        int zero[] = new int[arr.length];
        int t = nonzero[0];
        int k = zero[0];


        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > 0) {

                 nonzero[t]=arr[i] ;
                t++;



            } else if(arr[i] == 0) {
                 zero[k] =arr[i];
                k++;

            }
        }
            for (int z = 0; z <= 7; z++) {
                System.out.print(nonzero[z] + " ");

            }
            for (int r = 0; r<= 1; r++) {
                System.out.print(zero[r] + " ");
            }

    }
}
