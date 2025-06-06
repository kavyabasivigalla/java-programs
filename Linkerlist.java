/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Node 
{
    int data;
    Node next;
    Node (int n)
    {
        this.data=n;
        this.next=null;
    }
}
public class Linkedlist
{
	public static void main(String[] args)
	{
	    Node a = new Node(1);
	    Node b = new Node(2);
	    Node c = new Node(3);
	    a.next = b;
	    b.next = c;
		System.out.println(a.data);
		System.out.println(a.next.data);
		System.out.println(a.next.next.data);
	}
}
