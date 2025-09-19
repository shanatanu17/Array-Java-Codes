import java.util.*;

public class Check_Strings_Are_Anagrams_Using_Two_pointers
{
   public static void main(String ss[])
   {
      String str1 = "mom";
	  String str2 = "mmo";
	  
	  
	  char string1[] = str1.toCharArray();
	  Arrays.sort(string1);
	  
	  char string2[] = str2.toCharArray();
	  Arrays.sort(string2);
	  
	  
	  int i=0;
	  int flag=0;
	  
	  while(i < string1.length)
	  {
	     if(string1[i] != string2[i])
		 {
		   flag = 1;
		   break;
		 }
	  }
	  
	  if(flag == 0)
	  {
	     System.out.println("Strings are anagram ");
	  }
	  else
	  {
	     System.out.println("Strings are not anagrams ");
	  }
	  
	  
	  
	  
	  
	  
	  
   }
}