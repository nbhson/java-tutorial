package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) {
		// 1 chiều
		int[] a = new int[3];
		a[0] = 0;
		a[1] = 1;
		a[2] = 2;
		
		System.out.println(a[0]);
		
		// nhiều chiều
		int[][] b= {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        
        // sort 
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
        Arrays.sort(arr);
        
        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
        
        // Shallow copy
        int[] src = {1,2,3,4,5};
        int[] dst = Arrays.copyOf(src, src.length);

        // Deep copy
        int[] dst2 = new int[src.length];
        for(int i = 0; i < src.length; i++){
        	dst2[i] = src[i];
        }
	}
}
