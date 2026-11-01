package practice;

import java.util.Scanner;

public class Q20 {
       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Enter the number of elements");
           int n = sc.nextInt();
           
           int[] arr = new int[n];
           
           System.out.println("Enter the elements:");
           for(int i=0;i<n;i++){
               arr[i] = sc.nextInt();
           }
           
           int sum = 0;
           for(int i=0;i<n;i++){
               System.out.println(arr[i]+" ");
       }
       System.out.println();
       for(int i=0;i<n;i++){
           sum+=arr[i];
       }
       System.out.println("Sum of the elements of the array:"+sum);
       
       int max = arr[0];
       int min = arr[0];
       
       for(int i=0;i<n;i++){
           if(arr[i]<min){
               min = arr[i];
           }
           if(arr[i]>max){
               max = arr[i];
           }
       }
       System.out.println("Maximum:"+max);
       System.out.println("Minimum:"+min);
       
       System.out.println("Enter the element to search:");
       int x = sc.nextInt();
       boolean found = false;
       
       for(int i=0;i<n;i++){
           if(arr[i]==x){
               System.out.println("Element found at index:"+i);
               found = true;
               break;
           }
       }
       if(!found){
           System.out.println("Element not found");
       }
       }
}