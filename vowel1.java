import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("Vowel");
		}
		else if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%')
		{
			System.out.println("Invalid");
		}
		else
		{
			System.out.println("Consonant");
		}
	}
}	
