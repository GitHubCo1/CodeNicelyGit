package codeNicely;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NoToFormate {
	public static void main(String[] args){
		int n;
		//System.out.println("convert numbers into words ");
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number ");
		n=s.nextInt();
		
		System.out.println(NumberFormat.getInstance(Locale.US).format(n));
		System.out.println(NumberFormat.getCurrencyInstance().getInstance(Locale.US).format(n));
		
	}
}
