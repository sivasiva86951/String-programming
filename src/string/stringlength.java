package string;

public class stringlength {

	public static void main(String[] args) {
		 String str = new String("My name is Sivasubramanian");
		 System.out.println("String: "+str);
	     System.out.print("String Length :" );
	     System.out.println(str.length());
	     
	     
	     String str1 = "Java full stack";
	     int count = 0;
	     System.out.println("String: "+str1);
	     for (int i = 0; i < str1.length(); i++)
	     {
	         if (Character.isLetter(str1.charAt(i)))
	         count++;
	      }
	      System.out.println("Letters: "+count);
	      
	}

}
