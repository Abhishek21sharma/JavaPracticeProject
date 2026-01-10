package Java8.Programs;

public class NextGreInArray {

    public static void main(String[] args) {
        int[] arr = {10,11,5,4,7};
        //10 -> 11
        //11 -> -1
        //5 ->7
        //4 ->5

        //logic --> consider 5 so greater elements are 7,10,11
        //so now find out min of those which is 7, so next greater to 5 is 7
        //{10,11,5,4,7}

        int min=99999;
        for(int i =0;i< arr.length;i++){
            for (int j =0; j< arr.length ;j++) {
                    if(arr[j] > arr[i]){
                        //System.out.println("Element greater than "+arr[i] +" is: "+arr[j]);
                        //System.out.println("Current minimum is: "+min);
                        min = Math.min(min,arr[j]);
                        //System.out.println("updated minimum is: "+min);

                    }
            }
            if(min != 99999){
                System.out.println("--Element is: "+arr[i] +" Next Greater element is: "+min);
            }
            else
                System.out.println("--Element is: "+arr[i] +" Next Greater element is: "+-1);


            min=99999;
        }
    }
}
