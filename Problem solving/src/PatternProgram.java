
import java.util.*;
public class PatternProgram {
	
	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   
	   String str=sc.nextLine();
	   int l=str.length();
	   int a[][]=new int[l][l];
	   for(int i=0;i<l;i++)
	   {
		   for(int j=0;j<l;j++)
		   {
			   if(j==i)
				   System.out.print(str.charAt(j));
			   else if((l-1-i)==j)
				   System.out.print(str.charAt(l-1-i));
			   else
				   System.out.print(" ");
		   }
		   System.out.println();
	   }
	   
	   
	}

}
