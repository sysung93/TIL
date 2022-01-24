package example;

import java.util.Scanner;

public class Multi_For_exam03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int line = n / 2 + 1;
		int i,j;
	    for(i = 1; i <= line; i++) {
	    	for(j = 1; j <= line-i; j++){
	    		System.out.print(" ");
	    		}
		  for(j = 1; j <= 2*i-1; j++){
			  	System.out.print("*");
			  }
		  System.out.println();
	    }
	    line = line-1;
	    for(i = 1; i <= line; i++) {
		  for(j = 1; j <= i; j++) {
			  System.out.print(" ");
		  }
		  for(j = 1; j <= (line-i)*2+1; j++) {
			  System.out.print("*");
  		  }
		  System.out.println();
	    }
		 
	}
}
