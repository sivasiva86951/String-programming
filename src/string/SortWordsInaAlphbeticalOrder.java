package string;
import java.io.*;
import java.util.*;
import java.util.Arrays;

import java.util.Scanner;

public class SortWordsInaAlphbeticalOrder {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter any String:");
        String st=scan.nextLine();
        
        //Xyz Abc Uvt
        String array[]=st.split("\\s");
        
        Arrays.sort(array);
        
        for(String s:array)
        {
            System.out.print(s+ " ");
        }
       
	}

}
