import java.util.*;
public class CSARR
{  public static void main(String x[])
   {  Scanner xyz  = new Scanner(System.in);
       int a[]=new int[6];
	   System.out.println("Enter values in array");
	   for(int i=0; i<a.length;i++)
	   { a[i]=xyz.nextInt();
	   }
	   int start=0,sum=0,target=7;
	   int ml=Integer.MAX_VALUE;
	   for(int end=0;end<a.length;end++)
	   {
		   
		   
		     sum = sum + a[end];
			 while(sum>=target)
			 { 
		       int cl=end-start+1;
			   if(cl<ml)
			   { ml=cl;
			   }
			   sum = sum-a[start];
			   start++;
			 } 
	   }
	   if(ml!=Integer.MAX_VALUE)
	   {        System.out.printf("{");
          for(int i=(start-1); i<((start-1)+ml); i++)
		  {   System.out.printf(" %d , ",a[i]);
		  }
	   System.out.printf(" } ");
	   }
	    
	   
   }
}
