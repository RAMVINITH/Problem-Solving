
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,3,4,5,2,6,9,8,10};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
				   temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
