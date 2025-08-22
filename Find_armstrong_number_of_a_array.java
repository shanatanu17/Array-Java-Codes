import java.util.*;


public class Find_armstrong_number_of_a_array
{
    public static void main(String ss[])
    {
        int arr[] = new int[]{153,22,67,234,370,371, 1634, 8208 , 9474};
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
			int currele = arr[i];
			int cpcurrele = currele;
			int cpcurrele2 = currele;
			int count = 0;
			
			
			// 1.
			while(cpcurrele > 0)
			{
				count++;
				cpcurrele = cpcurrele/10;
			}
			
			
			//2.
			int currsum = 0;
			
			while(cpcurrele2 > 0)
			{
				int ld = cpcurrele2 % 10;
				int val = (int)(Math.pow(ld,count));
				
				currsum = currsum + val;
				cpcurrele2 = cpcurrele2/10;
			}
			
			
			if(currsum == currele)
			{
				System.out.println(currele);
			}
		}

		
    }
}