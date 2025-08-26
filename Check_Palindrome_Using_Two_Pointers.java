public class Check_Palindrome_Using_Two_Pointers
{
    public static void main(String ss[])
	{
	    String str[] = new String[]{"r","a","c","e","c","a","r"};
		
		
		int i=0;
		int j = str.length-1;
		
		int flag = 0;
		
		
		while(i <= j)
		{
		    if(str[i] != str[j])
			{
			    flag = 1;
				break;
			}
			
			i++;
			j--;
		}
		
		
		if(flag == 1)
		{
		    System.out.println("Not palindrome string ");
		}
		else
		{
		    System.out.println("Palindrome string ");
		}
	}

}
