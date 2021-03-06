package com.stackroute;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaxDigitInString {

	public static int getMaxDigit(String alphanumeric) {
		if(alphanumeric==null || alphanumeric.equals(null)){
			return -1;
		}
		String regex="\\d";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(alphanumeric);
		int max=-1;
		while(m.find()){
			int num=Integer.parseInt(m.group());
			if(num>max){
				max=num;
			}
		}

		return max;
	}

   	//Do not print anything other than what's expected/asked in problem
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	String input=s.nextLine();
    	int result=MaxDigitInString.getMaxDigit(input);
    	if(result>=0){
    		System.out.println("Maxdigit:"+result);
    	}
    	else{
    		System.out.println("No digits in string");
    	}
 
    
    }
}
