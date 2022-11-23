package string;

import java.util.Scanner;

public class PalindromeWordInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter any String : ");
     String st=sc.nextLine(); //Good morning madam
     st=st.toLowerCase()+" ";    //good morning madam_
     String word="",reverse="";
     int counter=0;
     
     for(int i=0;i<st.length();i++)
     {
         if(st.charAt(i)!=' ')
         {
         word=word+st.charAt(i);
         }
         else
         {
            // System.out.println(i);
             for(int j=word.length()-1;j>=0;j--) //good
             {
                 reverse=reverse+word.charAt(j); //doog
             }
             
             if(reverse.equals(word))
             {
                 System.out.println(i);
                 System.out.println(reverse);
                 counter=counter+1;
             }
             reverse="";
             word="";
         }
     }
     
     System.out.println("No. of Palindrome words :"+counter);
	}

}
