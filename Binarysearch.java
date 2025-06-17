import java.util.*;
public class Binarysearch
{
	public static void main(String[] args) {
	    int [] a = new int[5];
	    Scanner sc = new Scanner(System.in);
	    for(int i=0; i <a.length;i++)
	    {
	        a[i] = sc.nextInt();
	    }
	    int s = sc.nextInt();
	    int i = 0;
	    int j = a.length-1;
	    while (i <= j)
	    {
	        int mid = (i + j)/2;
	        if(a[mid]==s)
	        {
	            System.out.println(mid);
	            System.exit(0);
	        }
	        else if (a[mid]<s) i = mid + 1;
	        else if (a[mid]>s) j = mid-1;
	    }
		System.out.println("not found");
	}
}