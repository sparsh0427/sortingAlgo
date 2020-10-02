package sortingAlgorithm;
import java.util.Scanner;

public class BubbleSort {
	static void bubbleSort(int[] arr) { 
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] < arr[j]){  
                              
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int a = sc.nextInt();
		int[] ar = new int[a];
		for(int i=0;i<a;i++) {
			System.out.println("Enter the element of an array");
			ar[i]=sc.nextInt();
		}
		bubbleSort(ar);
		System.out.println("Sorted array is");
		for(int i=0;i<a;i++) {
			System.out.print(ar[i]+" ");
			
		}
		
		
		
	}

}
