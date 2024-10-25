class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
        Arrays.sort(arr);   //sorti the Array
       int left_idx=0;  //taking first index of array
       ArrayList<Integer>new_arr=new ArrayList<>(); //initialize new arraylist to store result
       int right_idx=arr.length-1; //taking last index of array
       
       while( left_idx <= right_idx ){
           if( right_idx >= left_idx ){     //first compare last to fisrt
               new_arr.add(arr[right_idx]);
               right_idx--;
           }
           if(left_idx <= right_idx){   //then compare first to last
               new_arr.add(arr[left_idx]);
               left_idx++;
           }
       }
       return new_arr;
    }
