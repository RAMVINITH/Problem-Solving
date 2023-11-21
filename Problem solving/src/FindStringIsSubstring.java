import java.util.*;
public class FindStringIsSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		int len1=str1.length();
		String str2=sc.nextLine();
		int len2=str2.length();
		int count=0,flag=0,index=-1;
		for(int i=0;i<len1;i++)
		{
			count=0;
			if(i+len2<=len1)
			{
				for(int j=0;j<len2;j++)
				{
					if((str1.charAt(i+j)) ==(str2.charAt(j)))
					{
						count++;
					}
				}
				if(count==len2)
				{
					index=i;
				}
			}
		}
		System.out.print(index);
		
		

	}

}
