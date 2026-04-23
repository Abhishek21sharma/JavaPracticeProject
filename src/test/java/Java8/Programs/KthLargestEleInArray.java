package Java8.Programs;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestEleInArray {

    public static void main(String[] args) {
        //int[] arr = {10,11,5,4,7,8};
        //find 3rd largest - 8
        //find 2nd largest - 10

        //easy solution would be sort the array, remove duplicates then based on order return the elements
        int[] arr = {10,11,5,4,7,8};

        //        Arrays.sort(arr);
        //        System.out.println("third largest: "+ arr[arr.length-3]);

        //without sorting -->
        int max = 0;
        for(int i = 0; i< arr.length;i++)
        {
           max =  Math.max(max,arr[i]);

        }
        System.out.println(max);


    }

    public static void optimalApproachForThis(){
        //For all Kth type of problems -> PriorityQueue (or HEAP) is the best solution
        //why ?> and what is it and how it is different from Set or MAP

        //Map --> not built for this type of problems
        //Set --> could work but it can not hold duplicates
        //Heap/PriorityQueue -->
        int[] arr = {10,11,5,4,7,8};
        int k =3;
        //optimal way to solve this is using
        //priority queue
        //heap
        //quick select algorithm

        //here we're using priorityqueue..
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i : arr){
            priorityQueue.add(i);
            //size should be equal to k
            if(priorityQueue.size() > k) {
                priorityQueue.poll(); //it will remove the smallest element from the priority queue
                //this way we just maintain the order and size..
            }
        }

        System.out.println("kth largest will be the root of this PQ : "+ priorityQueue.peek());

    }
}
