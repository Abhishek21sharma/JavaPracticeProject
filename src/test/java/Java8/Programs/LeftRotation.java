package Java8.Programs;

import java.util.Arrays;

public class LeftRotation {

    public static void main(String[] args) {
        int[] arr = {10,11,5,4,7,8};
        //left rotation by 2
        // means {5,4,7,11,10}
        int[] temp = new int[arr.length];
        int i=0;
        int j =0;
        int d= 2; //rotation by 2

        while(i < arr.length - d)
        {
            temp[i] = arr[i+d];
            i++;
        }

        while (j < d)
        {
          temp[i]  = arr[j];
          i++;
          j++;
        }

        Arrays.stream(temp).forEach(System.out::println);

    }
}
