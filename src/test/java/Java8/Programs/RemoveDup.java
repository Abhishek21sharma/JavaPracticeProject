package Java8.Programs;

import org.testng.annotations.Test;

import java.util.Arrays;

public class RemoveDup {

    public static void main(String[] args) {
            //assume array is sorted
           //input --> {1,2,2,3,3,3,4,5,6,6,7}

          //output --> {1,2,3,4,5,6,7}

        int arr[] = {1,1,2,2,3,3,3,4,5,6,6,7};
        int temp[] = new int[arr.length];
        int j= 0;
        for(int i = 0; i<(arr.length)-1; i++){
            if(arr[i] != arr[i+1])
            {
                temp[j] = arr[i];
                j++;
            }

        }
        Arrays.stream(temp).forEach(System.out::println);
    }

    @Test
    public void removeDup(){

        int arr[] = {1,1,2,2,3,3,3,4,5,6,6,7};
        System.out.println("length before: "+arr.length);
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(index ==0 || arr[index-1] != arr[i])
            {
                arr[index]=arr[i];
                index++;
            }
        }
        System.out.println("length after: "+arr.length);
        Arrays.stream(arr).forEach(System.out::println);

    }

    @Test
    public int remDup(){
        //https://www.youtube.com/watch?v=JHzdGAh_6mk
        //just we are worried about first few unique elements..
        //once we have the unique elements we don't care what is left behind in the array
        //also we return the kth ele which tells us upto which index it's unique in the array

        int nums[] = {1,1,2,2,3,3,3,4,5,6,6,7};
        int  j = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[j])
            {   j++;
                nums[j]=nums[i];
            }
        }
        return j;
    }
}
