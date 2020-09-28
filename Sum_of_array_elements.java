package gfg;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Sum_of_array_elements {

	public static void main(String[] args) {
        Scanner num = new Scanner(System.in) ;
		

		int number = num.nextInt(); 
		for(int a=1;a<=number;++a){
		int n = num.nextInt();
		int t=0;
		int[] A=new int[n];
		for(int i=0;i<n;++i){
		     A[i]=num.nextInt();
		    t+= A[i];
		}
		System.out.println(""+t);
		}
	
	}

}
