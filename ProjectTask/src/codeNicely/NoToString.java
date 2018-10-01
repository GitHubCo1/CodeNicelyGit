package codeNicely;

import java.util.Scanner;
import java.text.NumberFormat;

class NoToString {
public static final String[] ones=

{"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

public static final String[] tens={" "," ",
			"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

public static String convert(int n){
	if(n<0){
	return"minus"+convert(-n);
	}	
	
	if(n<20){
	return ones[n];
	}
		
	if(n<100){
	return tens[n/10]+((n%10!=0)?" ":" ")+ones[n%10];
	}
	
	if(n<1000){
	return ones[n/100]+"hundred"+((n%10!=0)?" ":" ")+convert(n%100);
	}
	
	if(n<100000){
	return convert(n/1000)+"thousand"+((n%10!=0)?" ":" ")+convert(n%1000);
	}
	
	if(n<10000000){
	return convert(n/100000)+"lakh"+((n%10!=0)?" ":" ")+convert(n%100000);
	}
	
return convert(n/10000000)+"crore"+((n%10!=0)?" ":" ")+convert(n%10000000);
}
	

public static void main(String[] args){
int n;
//System.out.println("convert numbers into words ");
Scanner s=new Scanner(System.in);
System.out.println("enter a number ");
n=s.nextInt();
System.out.println(NumberFormat.getInstance().format(n)+" = "+convert(n));
}}

