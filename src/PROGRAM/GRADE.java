package PROGRAM;

import java.util.Scanner;

public class GRADE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner  sc=new Scanner(System.in);
		 int  mark=sc.nextInt();
		 if(mark<=49) {
			 System.out.println("E grade");
		 }else if(mark>=50 && mark<=60) {
			 System.out.println("D grade");
		 }else if(mark>=61 &&mark<=70) {
			 System.out.println("C grade");
		 }else if(mark>=71 && mark<=80) {
			 System.out.println("B grade");
		 }else if(mark>=81 && mark<=90) {
			 System.out.println("A grade");
		 }else if(mark>=91 && mark<=100) {
			 System.out.println("A++ grade");
		 }else {
			 System.out.println("invalid");
		 }
	}

}
