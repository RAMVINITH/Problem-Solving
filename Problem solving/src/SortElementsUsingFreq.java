
public class SortElementsUsingFreq {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
          int arr[]= new int[]{1,1,2,4,3,3,4,5,5};
//          int arr[]=new int[] {3,4,5,2,3,6,7,8,1,9,10,5};
//          for(int i=0;i<a.length;i++)
//          System.out.println(a[i]);
            int uniqueElements[]=new int[arr.length];
            
            int temp=0,flag=0;
            for(int i=0;i<arr.length;i++)
            {
               flag=0;
               for(int j=i-1;j>=0;j--)
               {
            	    if(arr[i]==arr[j])
            	    {
            	    	flag=1;
            	    }
               }
               if(flag==0)
            	   uniqueElements[temp++]=arr[i];
            }
//            display(uniqueElements);
            int freqOfElements[]=new int[temp];
            int freqCount=0;
            for(int i=0;i<temp;i++)
            {
            	freqCount=0;
            	for(int j=0;j<arr.length;j++)
            	{
            		if(uniqueElements[i]==arr[j])
            		   freqCount++;
            	}
            	freqOfElements[i]=freqCount;
            }
            
            for(int i=0;i<freqOfElements.length;i++)
            {
            	for(int j=i+1;j<freqOfElements.length;j++)
            	{
            		if(freqOfElements[i]<freqOfElements[j])
            		{
            			temp=freqOfElements[i];
            			freqOfElements[i]=freqOfElements[j];
            			freqOfElements[j]=temp;
            		}
            	}
            }
            
//            display(freqOfElements);
            for(int i=0;i<freqOfElements.length;i++)
            {
            	for(int j=i+1;j<freqOfElements.length;j++)
            	{
            		if(freqOfElements[i]<freqOfElements[j])
            		{
            			temp=freqOfElements[i];
            			freqOfElements[i]=freqOfElements[j];
            			freqOfElements[j]=temp;
            			
            			temp=uniqueElements[i];
            			uniqueElements[i]=uniqueElements[j];
            			uniqueElements[j]=temp;
            		}
            	}
            }
            display(uniqueElements);
            display(freqOfElements);
            System.out.println();
            for(int i=0;i<uniqueElements.length;i++)
            {
            	if(uniqueElements[i]!=0)
            	{
            	for(int j=0;j<freqOfElements[i];j++)
            	{
            		System.out.print(uniqueElements[i]+" ");
            	}
            	}
            }
            	
          
          
	}
	public static void display(int arr[])
	{
		System.out.println();
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	

}
