import java.util.*;
public class Upperandlowercases
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b=sc.nextLine();
	for(int i=0;i<a.length();i++)
	{
	    char ch=a.charAt(i);
	    if(Character.isUpperCase(ch))
	    {
	        char c=Character.toLowerCase(ch);
	        b=b+c;
	    }
	    else
	    {
	        char c=Character.toUpperCase(ch);
	        b=b+c;
	    }
	}
	System.out.println(b);
	
	}
}