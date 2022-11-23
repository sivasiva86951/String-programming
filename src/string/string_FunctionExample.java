package string;


public class string_FunctionExample {

    public static void main(String[] args) {
        
        String st="We,love,Java,programming,We";
        System.out.println(st.charAt(0));
        System.out.println(st.charAt(1));
        
        //int ar[]=new int[12];
        //String st3[]=new String[12];
        
        
        System.out.println(st.length());
        System.out.println(st.charAt(0));
        System.out.println(st.toLowerCase());
        System.out.println(st.toUpperCase());
        System.out.println(st.substring(4,7));
        System.out.println(st.indexOf("love",2));
        System.out.println(st.lastIndexOf('a',13));
        System.out.println(st.replace('l', 'L'));
        System.out.println(st.replace("love", "LiKe"));
        System.out.println(st.replaceAll("We", "I"));
        
        String st1[]=st.split("v");
        
        System.out.println(st1[0]);
        System.out.println(st1[1]);
        System.out.println(st1[2]);
        
        String s1="  ABC   ",s2="abc";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    
        System.out.println(s1.strip());
        System.out.println(s1.stripLeading());
        System.out.println(s1.stripTrailing());
        
        String s="",p=" ";
        
        System.out.println(p.isBlank());//content is whitespace or empty then true otherwise false
        System.out.println(p.isEmpty());//true -> length 0 otherwise false
        st="Welcome to Java";
        
        //converting string to character array
        char ch[]=st.toCharArray();
        System.out.println(st);
        /*
         * for(int i=0;i<ch.length;i++) { System.out.print(ch[i]+","); }
         */
        System.out.println(ch[0]);
        
        //Converting character array to String
        String myString=new String(ch);
        
        System.out.println(myString);
        
        
        
        

    }

}
