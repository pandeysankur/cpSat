package DataStructureJava;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int  arr[]={-1,-2,30,50,10,70,60,40};
        System.out.println(Arrays.toString(instSort(arr)));
    }
    public static int[] instSort(int[] arr){
        for (int i =0;i<arr.length;i++){
            int temp=arr[i];
            int j =i-1;
            while (j>=0 && arr[j] >temp){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=temp;
        }


        return arr;
    }
}
