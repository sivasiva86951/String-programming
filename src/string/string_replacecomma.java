package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string_replacecomma {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a string:");
        String st=br.readLine();
        System.out.println(st.replace(' ', ','));
	}
        
}
