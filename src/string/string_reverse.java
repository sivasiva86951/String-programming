package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string_reverse {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a string:");
        String st=br.readLine();
        String str1="";
        
        for(int i=0;i<st.length();i++)
        {
        	str1=st.charAt(i)+str1;
        }
     	System.out.println("Reversed string = "+str1);
	}

}
