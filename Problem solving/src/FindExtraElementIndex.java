import java.util.*;
public class FindExtraElementIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[4];
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<4;i++)
			b[i]=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			int flag=0,extraElement=0,index=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
					flag=1;
				else
				{
					extraElement=a[i];
					index=i;
				}	
			}
			if(flag==0)
			{
				System.out.println("extra element ="+extraElement);
			    System.out.println("index = "+index);
			}	
		}
		

	}

}

