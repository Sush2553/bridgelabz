package com.utility;

import java.util.Random;
import java.util.Scanner;


public class Utility 
{
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
		
		
		
/****************program to reverse three names***************/	
	
	public static void reverseNameOrder()
		{  
		String name;
		System.out.println("Enter your name:");
		name=sc.nextLine();	
		String arr[] = name.split (" ");
		switch (arr.length) 
	    {
	    	
	        case 1:
	            System.out.println("Hi "+name);
	            break;
	        case 2:
	            System.out.println("Hi "+arr[1] + ", " + arr[0]);
	            break;
	        case 3:
	            System.out.println("Hi "+arr[2] + ", " + arr[1] + " and " + arr[0]); 
	            break;
	        default:
	        	System.out.println("More than three names..");
	        	reverseNameOrder();
	    }
	    	
	}
		
	    
	  

	
	
	/****************program to check operator precedence using double values as input***************/	
	
	public static void findOperator_precedence(int a,int b,int c)
	{
		int p,q,r,s;
		p=a+b*c;
		q=a*b+c;
		r=c+a/b;
		s=a%b+c;
		System.out.println("p= "+p+" q= "+q+" r= "+r+" s="+s);
	}
	
	
	
	/****************program to check operator precedence using double values as input***************/	
	public static void findOperator_precedence(double a,double b,double c)
	{
	double p,q,r,s;
	p=a+b*c;
	q=a*b+c;
	r=c+a/b;
	s=a%b+c;
	System.out.println("p= "+p+" q= "+q+" r= "+r+" s="+s);	
	}

	/****************program to check Leap Year***************/	
	public static void isLeapYear()
	 {
		int year;
		System.out.println("please enter year: ");
		year=sc.nextInt();

			if(year>=1582)
			{
				if(year%4 == 0 && year%100 != 0 || year%400 == 0) 
				{
					System.out.println(year+" is a leap year");
				}	
				else 
				{
					System.out.println(year+" is not a aleap year");;
				}
			}
			else
			{
				System.out.println("year should be greater than or equals to 1582");
				isLeapYear();
			}
	 }
	
	/****************program to check whether it is Spring Season or not***************/	
	public static void isSpringSeason()
	{
		int date,month;
		System.out.println("please enter date: ");
		date=sc.nextInt();
		System.out.println("please enter month: ");
		month=sc.nextInt();
			if(date<=0 || month<=0)	//check for negative values
			{
				System.out.println("please enter positive values for date & month");
			}
			else 
			{
				if((date >= 20 && date <= 31 && month==3) || ( date >= 1 && date <= 30 && month==4) || (date >= 1 && date <= 31 && month==5) || (date >= 1 && date <= 20 && month==6))
				{
                 System.out.println("Given date falls in the Spring season");
				}
				else
					System.out.println("Given date doesn't fall in the Spring season");
					
			}		
	}
	
	
	/***************program to calculate quadratic Roots of equation***************/	
	
	public static void rootsOfQuadraticEquation(int a,int b,int c)
	{
		double delta,root1,root2;
		delta=(b*b)-(4*a*c);
		root1=(-b+Math.sqrt(delta))/(2*a);
		root2=(-b-Math.sqrt(delta))/(2*a);
		System.out.println("Two roots are as  follows:\n"+root1+" and "+root2);
	}
	
	
/**************program to calculate Euclidean distance from point (x,y) to origin********/	
	public static void calculateEuclideanDistance(int x,int y)
	{
		double distance=Math.sqrt((Math.pow(x,x))+(Math.pow(y,y)));
		System.out.println("Euclidean distance from point "+(x+","+y)+" to the origin(0,0) is: "+distance);
	}

	
	
	/**********program to calculate sum of two dice**********/
	
	public static void calculateSumOfTwoDice()
	{
	Random dice = new Random();
	 
	int first_num = 1+dice.nextInt(6); //1 is added to avoid 0 random number
	System.out.println("First random number: "+first_num);
	
	int second_num= 1+dice.nextInt(6);
	System.out.println("Second random number: "+second_num);
	
	int sum = first_num+second_num;
	System.out.println("sum is:"+sum);;
	
}
	
	
	/*************program to print average,min,max value from 5 random numbers**********/
	public static void findSumOfRandomNumbersOnDice()
	{
		double average=0;
		float rand[]=new float[5];
		Random num=new Random();
			for(int i=0;i<5;i++)
			{								//store 5 random values in array
				rand[i]=num.nextFloat();	//nextFloat gives random numbers between 0 to 1
			}
			
		//print random numbers
			System.out.println("random numbers are:");
			for(int j=0;j<rand.length;j++)
			{
				System.out.println(rand[j]); 
			}
			
		//calculate average
			for(int k=0;k<rand.length;k++)
			{
				average=average+rand[k];
			}
			double averageOf5=average/5;
			System.out.println("average is: "+averageOf5);
		
		//find out minimum
			
			for(int l=1;l<rand.length;l++)
			{
				rand[0]=Math.min(rand[0],rand[l]);
			}
			System.out.println("minimum is: "+rand[0]);
			
		//find out minimum
		
			for(int m=1;m<rand.length;m++)
			{
				rand[0]=Math.max(rand[0],rand[m]);
			}
			System.out.println("maximum is: "+rand[0]);
	}
	
	
	/***************windchill*************/
	
	public static void calculateWindchill(double t,double v)
	{
		if(t>50 || v>120 || v<3) 
			{
				System.out.println("enter value for v between 3-120 and less than 50 for t: ");
				t = Utility.getDouble();
				v= Utility.getDouble();
				calculateWindchill(t,v);
			}
	
			else
			{
				double w = 35.74 + 0.6215*t + ((0.4275*t) - 35.75) * Math.pow(v, 0.16);
				System.out.println("wind-chill: "+w);
			}
	}
	
/****************program to print day of week*****************/
	public static void getWeekDay(int d,int m,int y)
	{
		int y0=y-(14-m)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=m+12*((14-m)/12)-2;
		int d0=(d+x+31*m0/12)%7;
		
		System.out.print(d+"/"+m+"/"+y+":");
		
		switch (d0)
		{
		
		case 0:
        	System.out.print("Sunday");
        	break;
		case 1:
        	System.out.print("Monday");
        	break;
		case 2:
        	System.out.print("Tuesday");
        	break;
		case 3:
        	System.out.print("Wednesday");
        	break;
		case 4:
        	System.out.print("Thursday");
        	break;
		case 5:
        	System.out.print("Friday");
        	break;
		case 6:
        	System.out.print("Saturday");
        	break;
		default:
			break;
		}
}
	
	
/*****************Temperature conversion**************/
	
public static void tempConversion()
{
	double temperature = 0.0;
	double result = 0.0;
	int choice;
	System.out.println("Enter your choice for temperature conversion :\n 1. From celcius to fahrenheit. \n 2. From fahrenheit to celcius \n");
	choice=sc.nextInt();
	 // condition for choice 1 and 2
	 
	switch(choice)
	{
	case 1:
			System.out.println("Enter temperature in celcius: ");
			temperature = Utility.getDouble();
			result = (temperature*9/5)+32;
			System.out.println(temperature+"C in fahrenheit: "+result+"F");
			break;
	
	case 2:
			
			System.out.println("Enter the temperature in fahrenheit: ");
			temperature = Utility.getDouble();
			result = (temperature-32)*5/9;
			System.out.println(temperature+"F in celcius: "+result+"C");
			break;
			
	default:
			System.out.println("invalid choice");
			tempConversion();
		}
	}

/******************program to calculate interest on car loan******************/

	public static void calculateInterestOnCarLoan(double P,int Y,double R)
	{
	int n=12*Y;
	double r=R/(12*100);
	double l=1+r;
	double payment=(P*r)/(1-Math.pow(l,-n));
	System.out.println("Payment is:"+payment);
	}
	
	
/***************************trignomatric*******************/
	public static void evaluateTrignometricFunctions()
	{
		double degree;
		System.out.println("enter degree :");
		degree=sc.nextDouble();
		double radian = Math.toRadians(degree);
		System.out.println(degree+" degree= "+radian+" radians");
		
		double sin = Math.sin(radian);
		System.out.println("sin("+radian+")="+sin);

		double cos= Math.cos(radian);
		System.out.println("cos("+radian+")="+cos);
	
	}
	
/************program to flip coin and print percentages of head and tail*********/
	
	public static void findPercentageOfHeadNTailByCoinflip()
	{
		int f;
		System.out.println("enter number of flips:");
		f=sc.nextInt();
		int tail = 0;
		int head = 0;
		
		if(f>0) 
		{
			double d[]=new double[f];
			for(int i=0;i<f;i++) 
			{
				d[i]= Math.random();
				System.out.println(d[i]);
				if(d[i]<0.5) 
				{
					System.out.println("Head");
					head++;
				}
				else 
				{
					System.out.println("Tail");
					tail++;
				}
			}
		float Heads  = (head*100)/f;
		System.out.println("head  %= "+Heads);
		float Tails  = (tail*100)/f;
		System.out.println("tail %= "+Tails);
		}	
			
		else 
		{
			System.out.println("flips should be greater than 0");
			findPercentageOfHeadNTailByCoinflip();
		}	
	}

/***********program to display series of power of 2****************/
	public static void powerOfTwo()
	{
		System.out.println("enter +ve number");
		int n=sc.nextInt();
		int power=0;
		if(n<0) 
			{
			powerOfTwo();
			}
		else 
			if(n<=31)
			{
			System.out.println("power of 2: ");
			for(int i=0;i<=n;i++) 
				{
				power = (int) Math.pow(2, i);
				System.out.println("2 ^ "+i+" = "+power);
				}
			}
			else
				System.out.println("integer value should be less than or equal to 31");
	}
	
/*********************program to print harmonic series upto n*******************/
	public static void findHarmonicSeries()
	{
		int n;
		System.out.println("enter value of n:");
		n=sc.nextInt();
		System.out.print("Harmonic series:\n\t\tHn=");
		for(int i=1;i<=n;i++)
		{
			System.out.print("1/"+i);
			if(i==n)
				break;
			System.out.print(" +");
		}
	}

/******************program to find square root of non negative number****************/
	public static void findSqrtOfNumber()
	{
		System.out.println("Please enter positive number: ");
		int c=sc.nextInt();
		double e = 1e-15;
		double t = c;
		if(c<0)
		{
		findSqrtOfNumber();	
		}
		else 
		{
			while (Math.abs(t - c/t) > e*t) 
			{
				t = (c/t + t) / 2;
			}
			System.out.println("sqrt="+Math.sqrt(t));
		}
	}
	
	
/**********************program to display prime numbers in given range****************/
	public static void findPrimeNumbersInBetween()
	{
	
	System.out.println("please enter starting point:");
	int a=sc.nextInt();
	System.out.println("please enter ending point:");
	int n=sc.nextInt();
	if(a==1)
		a++;
	if(a>0 && n>0) 		//check for negative intervals
	{
		for(int i=a;i<=n;i++)
		{
			int flag=0;
				for(int j=2;j<i;j++)
					{
						if(i%j==0)
						flag=1;
					}
		
					if(flag==0)
						System.out.print(i+" ");
		}
	}
	else
	{
		System.out.println("please enter +ve intervals only..");
		findPrimeNumbersInBetween();
	}
}
	
	
/*************************program to find maximum rolled number on dice***********/
	public static void findMaximumRolledNumberOnDice()
	{
		int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0;
		System.out.println("enter number of dice rolls:");
		int n=sc.nextInt();
		Random dice = new Random();
		
		int a[]=new int[n];
		
		System.out.println("Random numbers are as follows:");
		for(int i = 0 ; i < n ; i++) 
		{
			int num=1+dice.nextInt(6);
			System.out.print(num+" ");
			for(int k = 0 ; k < n ; k++) 
				{
				a[k]=num;
				}
			
			if (num==1) 
					count1++;
	
			if (num==2) 
					count2++;
			if (num==3)
					count3++;
			if (num==4)
					count4++;
			if (num==5)
					count5++;
			if (num==6) 
					count6++;
			}
		System.out.print("\n");
	if(count1>count2 & count1>count3 &count1>count4 &count1>count5 & count1>count6)
		System.out.println("1 rolled : "+count1+" times");
    else if(count2>count1 & count2>count3 &count2>count4 &count2>count5 & count2>count6) 
		System.out.println("2 rolled : "+count2+" times");
	else if(count3>count1 & count3>count2 &count3>count4 &count3>count5 & count3>count6) 
		System.out.println("3 rolled : "+count3+" times");
	else if(count4>count1 & count4>count2 &count4>count3 &count4>count5 & count4>count6) 
		System.out.println("4 rolled : "+count4+" times");
	else if(count5>count1 & count5>count2 &count5>count3 &count5>count4 & count5>count6) 
		System.out.println("5 rolled : "+count5+" times");
	else if(count6>count1 & count6>count2 &count6>count3 &count6>count4 & count6>count5) 
		System.out.println("6 rolled : "+count6+" times");
	else System.out.println("multiple repeated values");
}	
	
	/**********************repeated number******************/
	public static void findRepeatedNumberFromArray()
	{
		System.out.println("enter no. of elements");
		int n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("enter array element");
		
		for(int k=0;k<a.length;k++)
		{
			a[k]=sc.nextInt();
		}
		
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = i+1 ; j <a.length ; j++) 
			{
				if(a[i] == a[j]) 
					System.out.println("Repeated value is: "+a[j]);
			}
		}
	}
	
	
	/***********program to print second largest and second smallest number*******/
	
	public static void findSecondLargestAndSmallestFromArray()
	{
		System.out.println("enter no. of elements");
		int n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("enter array element");
		
		for(int k=0;k<a.length;k++)
		{
			a[k]=sc.nextInt();
		}
		
		int temp;
		for(int i = 0 ; i < a.length ; i++) 
		{
			for(int j = i+1 ; j < a.length ; j++) 
			{
				if(a[i] > a[j]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		int sec=a.length-2;//it returns second last index
		
		System.out.println("second largest number:"+a[sec]);
		System.out.println("second smallest number:"+a[1]);
		

	}
	
	/**********k pattern**********/
	public static void pattern()
	{//logic for half K(upto 4 rows)              
		for(int i=9;i>=1;i=i-2)
		{
			
			if(i==1)
			{
				for(int m=1;m<4;m++)
				{							//logic for 5th line
				System.out.print("*");
				
				}
			}
			
			for(int j=1;j<=i;j++)
				
			{
				{
				if(j==1) 
				
					System.out.print("**");
			
				else if(j==i) 
					System.out.print("***");
				}
				System.out.print(" ");
				
			}
			System.out.println();
		}
		
		//logic for next half
		for(int i=1;i<=9;i=i+2)
		{if(i==1)
			continue;
			for(int j=1;j<=i;j++)
			{
				{
			
				if(j==1) 
					System.out.print("**");
				else if(j==i) 
					System.out.print("***");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	
	
	/**********pattern D*************/
	
	public static void pattern2()
	{
		//logic for half D (for first 4 rows,that's why initial value of i is 6)
		//6,7,8,9 first four rows
		//blank spaces starting from 6
		for(int i=6;i<=9;i++)
			{
				//logic for first line
				if(i==6)
				{
					for(int m=1;m<9;m++)
					{
					System.out.print("*");
					
					}
				}
				else
				for(int j=1;j<=i;j++)
				{
					{
					
					if(j==1 || j==i) 
						System.out.print("**");
					
					}
					System.out.print(" ");	//logic for space
					
				}
				System.out.println();
				
				//logic to print 5th line
				if(i>=9)
				{
					for(int k=1;k<=10;k++)
					{
						if(k==1 || k==10)
						{
							System.out.print("**");	
						}
						else
							System.out.print(" ");
					}
					System.out.println();
					
				}
				
			}
			
			//logic for next half D (from 7th to 9th line)
			for(int i=9;i>=6;i--)
			{
				
				for(int j=1;j<=i;j++)
				{

					//logic for last line
					if(i==6)
					{
						for(int m=1;m<9;m++)
						{
						System.out.print("*");
						}break;
					}
					{
				
					if(j==1 || j==i) 
						System.out.print("**");
					
					}
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	
	/***************prime factorization***********/
	public static void getPrimeFactors()
	{
		int i, j, number, isPrime;
		System.out.println("enter number to find prime factors:");
		number=sc.nextInt();
	   
	    System.out.println("prime factors of "+number+" are:");
	    for(i=2; i<=number; i++)
	    {
	         isPrime = 1;
	            for(j=2; j*j<=i-1; j++)
	            {
	                if(i%j==0)
	                {
	                    isPrime = 0;
	                    break;
	                }
	            }
	            if(isPrime==1)
	            {
	            	if(number%i==0)
	                System.out.println(i);
	            }
	
	        
	    }
	}
	
/**************Gambling game**********/
	public static void gambling()
	{
		int stake,goal,trails;
		System.out.println("enter amount:");
		stake=sc.nextInt();
		System.out.println("enter goal:");
		goal=sc.nextInt();
		System.out.println("enter number of trails:");
		trails=sc.nextInt();
		int wins=0;
		int loss=0;
		
			int cash = stake;
			{
				if(goal<=cash)
				System.out.println("goal is less than or equal to cash");
			
				else 
				{
						for(int m=1;m<=trails;m++)
						{
							double v=Math.random();
							if(v< 0.5) 
							{
								loss++;	
								cash=cash-100; //100 win amount
							}	
							else 
							{
								wins++;
								cash=cash+100;
							}
						}
					
				
			if(cash==goal)
				System.out.println("reached goal...");
			else
				System.out.println("can't reach the goal...");
			double pw= (wins*100)/trails;
			System.out.println(" win percentage="+pw);
			double pl= (loss*100)/trails;
			System.out.println(" loss percentage="+pl);
			
			}
			}
			
	}
	

	 
		/*****************Binary presentation of decimal numbers***********/
		 public static void getBinary()
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
				System.out.println(padding+reverse);

		 }
		 
	/***********program to swap nibbles of binary numbers***********/
		 public static void SwapNibblesOfBinary()
		 {
			 System.out.println("enter decimal number:");
			 int d=sc.nextInt();
			 String binary="";
			 int n = d;
			 String reverse= "";
				while(n >=1) 
						{
							binary=binary+(n%2);
							n = n/2;
						}
							
						for(int i = binary.length() - 1 ;i >= 0 ; i--) 
						{
							reverse = reverse + binary.charAt(i);
						}
						
						//logic to add padding(0's to complete lenth 8 )
						int z=binary.length();
						String padding="";
						for(int i =z; i <8 ;i++)
						{
						padding=padding+0;
						}
						
						System.out.println("binary: "+padding+reverse);
						String nibble1 = padding+reverse;
						String first="";
						String second="";
						String last = "";
						for(int i = 0 ; i < 4 ;i++) 
						{
							first = first + nibble1.charAt(i);
						}
						System.out.println("1st nibble: "+first);
						
						for(int i = 4 ; i <8 ; i++) 
						{
							second = second + nibble1.charAt(i);
						}
						System.out.println("2nd nibble: "+second);
						
						last = last+second+first;
						System.out.println("Swapped Nibble: "+last);
						int swappedDecimal = Integer.parseInt(last,2);
						System.out.println("Binary to decimal: "+swappedDecimal);
					}
		 
		 
	/******************KD********************/
		 public static void pattern11()
			{//logic for half K(upto 4 rows)
			
				for(int i=9;i>=1;i=i-2)
				{
					
					if(i==1)
					{
						for(int m=1;m<4;m++)
						{							//logic for 5th line
						System.out.print("*");
						
						}
					}
					
					for(int j=1;j<=i;j++)
						
					{
						{
						if(j==1) 
						
							System.out.print("**");
					
						else if(j==i) 
							System.out.print("***");
						}
						System.out.print(" ");
						
					}
					System.out.println();
				}
				
				
				
				//logic for next half
				for(int i=1;i<=9;i=i+2)
				{if(i==1)
					continue;
					for(int j=1;j<=i;j++)
					{
						{
					
						if(j==1) 
							System.out.print("**");
						else if(j==i) 
							System.out.print("***");
						}
						System.out.print(" ");
					}
					System.out.println();
				}
				
			}
			
			
			

	/**********pattern D*************/
		 
		 
			
			public static void pattern22()
			{
				//logic for half D (for first 4 rows,that's why initial value of i is 6)
				//6,7,8,9 first four rows
				//blank spaces starting from 6
				for(int i=6;i<=9;i++)
					{	 
					 for(int q=1;q<=20;q++)
					 {
						 System.out.print(" ");
					 }
						//logic for first line
						if(i==6)
						{
							for(int m=1;m<9;m++)
							{
							System.out.print("*");
							
							}
						}
						else
						for(int j=1;j<=i;j++)
						{
							{
							
							if(j==1 || j==i) 
								System.out.print("**");
							
							}
							System.out.print(" ");	//logic for space
							
						}
						System.out.println();
						
						//logic to print 5th line
						if(i>=9)
						{for(int q=1;q<=20;q++)
						 {
							 System.out.print(" ");
						 }
							for(int k=1;k<=10;k++)
							{
								if(k==1 || k==10)
								{
									System.out.print("**");	
								}
								else
									System.out.print(" ");
							}
							System.out.println();
							
						}
						
					}
					
					//logic for next half D (from 7th to 9th line)
					for(int i=9;i>=6;i--)
					{
						for(int q=1;q<=20;q++)
						 {
							 System.out.print(" ");
						 }
						
						for(int j=1;j<=i;j++)
						{

							//logic for last line
							if(i==6)
							{
								for(int m=1;m<9;m++)
								{
								System.out.print("*");
								}break;
							}
							{
						
							if(j==1 || j==i) 
								System.out.print("**");
							
							}
							System.out.print(" ");
						}
						System.out.println();
					}
				}

			

	
}