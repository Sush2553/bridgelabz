package com.utility.week2;

import java.util.Arrays;
import java.util.Scanner;

import com.utility.week2.Utility;

public class Utility {

public static Scanner sc= new Scanner(System.in);

	

	/**This method takes integer input from user
	 * @return integer value
	 */
	public static int getInt() {

		int integer = sc.nextInt();
		return integer;

	}

	/**
	 * This method is used to take long input from user
	 * 
	 * @return long value
	 */
	public static long getLong() {

		long longValue = sc.nextLong();
		return longValue;

	}

	/**
	 * This method is used to take double input from user
	 * 
	 * @return double value
	 */
	public static double getDouble() {

		double doubleValue = sc.nextDouble();
		return doubleValue;
	}

	/**
	 * This method is used to take float input from user
	 * 
	 * @return float value
	 */
	public static float getFloat() {
		float floatValue = sc.nextFloat();
		return floatValue;
	}

	/**
	 * This method is used to take String input from user
	 * 
	 * @return String
	 */
	public static String getString() {

		String string = sc.nextLine();
		return string;
	}

		// TODO Auto-generated method stub
		/************************** week 2 programs***********************/
		
		
		/**********************String operations using static functions************/
			/******** 1. anagram***************/
			public static boolean checkAnagram()
			{
				System.out.println("enter first string:");
				String a=sc.next();
				System.out.println("enter second string:");
				String b=sc.next();
				String c  =  a.replaceAll("\\s", " ");
				String d  =  b.replaceAll("\\s", " ");
				System.out.println("first string:"+a+"\n"+"second string:"+b);
				
				if(c.length() != d.length()) 
					return false;
					else 
					{
					char[] s1Array = c.toLowerCase().toCharArray();
					char[] s2Array = d.toLowerCase().toCharArray();
					
		            Arrays.sort(s1Array); //sort
					Arrays.sort(s2Array);
					
					//Check if both arrays are equal

					Arrays.equals(s1Array, s2Array);
					return true;
				}
				

			}
			
			/************ 2. palindrome **********/
			
			public static boolean isPalindrome()
			{
				System.out.println("enter string");
				String s=sc.next();
				String temp=s;
				String rev="";
				int length = s.length(); 
				
				for(int i = length - 1 ;i >= 0 ; i --) 
				 {
					rev = rev + s.charAt(i);
				 } 
				System.out.println("original string:"+s+"\n"+"reversed string:"+rev);
				
				 if(temp.equals(rev)) 
				 {
					return true ;
				 }
				 else
				 {
					 return false;
				 }
				
				
		}
			
	
	/************ 3. permutations **********/
			
			public static void getPermutation(String str, int startIndex, int lastIndex)
			{
				if(startIndex>lastIndex)
					System.out.println("last index should be greater than start index");
				if(startIndex==lastIndex) 
				{
					System.out.println(str);
				}
				else 
				{
					for(int i = startIndex ; i <= lastIndex; i++) 
					{
					str = swap(str , startIndex ,i);
					getPermutation(str , startIndex+1, lastIndex);
					str = swap(str, startIndex, i);
					}
				}
			}
			
			private static String swap(String a, int i, int j) 
			{
				char temp;
				char[] charArray = a.toCharArray();
				temp = charArray[i];
				charArray[i] = charArray[j];
				charArray[j] = temp;
				
				return String.valueOf(charArray);
		}
			
			
	/**************** 5. check equality of two string**************/
			
		public static void getStringEquality(String string1, String string2)
		{
			if(string1.equals(string2))
				System.out.println("Strings are equal");
			else 
				System.out.println("Strings aren't equal");
		}

			
		/*****************program to find day of week***************/
		
		public static int dayOfWeek()
			{
			System.out.println("enter date:");
			int d=sc.nextInt();
			System.out.println("enter month:");
			int m=sc.nextInt();
			System.out.println("enter year:");
			int y=sc.nextInt();
			if(y < 0 || m < 0 && m>12 || d < 0) 
			{
				System.out.println("please enter valid inputs:");
				y = Utility.getInt();
				m = Utility.getInt();
				d = Utility.getInt();
				dayOfWeek();
			}
			
			
			int y0 = y - (14 - m) / 12;
	        
	        int x = y0 + y0/4 - y0/100 + y0/400;
	        
	        int m0 = m + 12 * ((14 - m) / 12) - 2;
	        
	        int d0 = (d + x + (31*m0)/12) % 7;
			
			return d0;	
	}
		
		/***************harmonic series*********/
		public static double findHarmonicSeries()
		{
			int n;
			System.out.println("enter value of n:");
			n=sc.nextInt();
			System.out.print("Harmonic series:\n\t\tHn=");
			double sum=0.0;
			for(int i=1;i<=n;i++)
			{
				sum=sum+1.0/i;
			}
			return sum;
		}
		
		
		/***************************trignomatric Sine*******************/
		public static double evaluateSineFunction()
		{
			double degree;
			System.out.println("enter degree :");
			degree=sc.nextDouble();
			double radian = Math.toRadians(degree);
			double sin = Math.sin(radian);
			return sin;
			
		}
		
		/***************************trignomatric Cosine*******************/
		public static double evaluateCosineFunction()
		{
			double degree;
			System.out.println("enter degree :");
			degree=sc.nextDouble();
			double radian = Math.toRadians(degree);
			double cos = Math.cos(radian);
			return cos;
			
		}
		
		
		/*****************Binary presentation of decimal numbers***********/
		 public static String getBinary()
		 {
			
				System.out.println("enter decimal number:");
				int d=sc.nextInt();
				int n = d;
				String binary="";
				String reverse= "";
				
				//getting remainder
				
				while(n >=1) {
					binary=binary+(n%2);
					n = n/2;
				}
				
				//padding
				int z=binary.length();
				String padding="";
				for(int i =z; i <8 ;i++)
				{
				padding=padding+0;
				}
				
				System.out.println("binary of "+d+":");
					for(int i = binary.length() - 1 ;i >= 0 ; i--) 
					{
					reverse = reverse + binary.charAt(i);
					}
				String result=padding+reverse;
				return result;
		 }
		 
		
		 /**************factorial******/
		 public static int printFactorial()
		 {
			 int fact=1;
			 System.out.println("enter number:");
			 int n=sc.nextInt();
			 System.out.println("factorial of "+n+" :");
			 for(int i=1;i<=n;i++)
			 {
				 fact=fact*i;
			 }
			 return fact;
		 }

/************maxvalue*************/
		 public static int findLargestFromArray()
			{
				System.out.println("enter no. of elements");
				int n=sc.nextInt();
				int a[]= new int[n];
				System.out.println("enter array element");
				
				for(int k=0;k<a.length;k++)
				{
					a[k]=sc.nextInt();
				}
				
				int temp=a[0];
				
				for(int i = 1; i < a.length ; i++) 
				{
					if(a[i]>temp) 
						{
							
							temp= a[i];
							
						}
					
				}
				
				
				return temp;
			}	


			
		 /*************minValue***********/
			
		 public static int findSmallestFromArray()
			{
				System.out.println("enter no. of elements");
				int n=sc.nextInt();
				int a[]= new int[n];
				System.out.println("enter array element");
				
				for(int k=0;k<a.length;k++)
				{
					a[k]=sc.nextInt();
				}
				
				int temp=a[0];
				for(int i = 1; i < a.length ; i++) 
				{
					if(a[i]<temp) 
						{
							
							temp= a[i];
							
						}
					
				}
				
				
				return temp;
			}
		 
		 
		/**********program to calculate future value on invest*******/
		 
		 public static double getFutureValueOnInvestment()
		 {
			System.out.println("Enter dollars to be invested:");
			float c= Utility.getFloat();
			System.out.println("Enter interest rate:");
			float r= Utility.getFloat();
			System.out.println("Enter time:");
			float t= Utility.getFloat();
			double value = 0;
				if(c<=0)
				{
					System.out.println("investment is zero");
					getFutureValueOnInvestment();
				}
				if(r<0 || t<0) 
					getFutureValueOnInvestment();
				else 
					{
					value = c*Math.pow((1+r), t);
					return value;
					}
				return value;
		 }
		 
		 
		 /*************present value***************/
		 
		 public static double getCurrentValueToBeInvestment()
		 {
			System.out.println("Enter how much future value you want:");
			float C= Utility.getFloat();
			System.out.println("Enter interest rate:");
			float r= Utility.getFloat();
			System.out.println("Enter time:");
			float t= Utility.getFloat();
			double value = 0;
		 if(C<0 || r<0 || t<0)
		 	{
				System.out.println("please enter positive value: ");
				getCurrentValueToBeInvestment();
			}
		 else 
			{
			 value = (C/Math.pow((1+r), t));
			}
		 return value;
		 }

		 
	/****************program to check whether given points are colinear or not using slope********/

		 public static  boolean checkSlope(int x1, int x2, int x3, int y1, int y2, int y3) {
				int slopAB = 0;
				int slopBC = 0;
				int slopAC = 0;
				try
				{
					 slopAB = (y2 - y1)/(x2 - x1);
					 slopBC = (y3 - y2)/(x3 - x2);
					 slopAC = (y1 - y3)/(x1 - x3);

				} 
				catch (Exception e) 
				{
					
				}
				
				if(slopAB == slopBC && slopBC  == slopAC) 
				
					return true;
					
					else 

					return false;
		 	}
		 
		 
		 /**************program to check whether given points are collinear or not using area***********/

		 public static  boolean checkCollinearUsingArea(int x1, int x2, int x3, int y1, int y2, int y3)
		 {
				int a = (x1 - x2);
				int b = (x2 - x3);
				int c = (y1 - y2);
				int d = (y2 - y3);
				
				int value = (a*d) - (b*c);
				int triangle = (1/2)*value;
				
				if(triangle == 0)
					return true;
				else 
					return false;
			}
}

