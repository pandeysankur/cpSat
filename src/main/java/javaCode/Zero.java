package javaCode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static void plusMinus(List<Integer> arr) {
        float positiveCount=0;
        float negariveCount=0;
        float zeroCount=0;
        int len=arr.size();
        for(int i =0;i<len;i++){
            int element= arr.get(i);
            if(element>0){
                positiveCount++;

            }
            if(element<0){
                negariveCount++;
            }if(element==0){
                zeroCount++;
            }

        }
        System.out.println("%1.6f"+positiveCount/len);
        System.out.println("%1.6f"+negariveCount/len);
        System.out.println("%1.6f"+zeroCount/len);


    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);
            }

            Result.plusMinus(arr);

            bufferedReader.close();
        }
    }


}
