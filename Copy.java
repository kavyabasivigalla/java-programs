/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Copy
{
    public static void main(String[] args)
    {
         int [ ] a = new int[5];
         Scanner sc=new Scanner(System.in);
              for(int i=0;i<a.length;i++)
              {
                  a[i] = sc.nextInt();
              }
              int [ ] b=new int [a.length];
              for(int i=0;i<a.length;i++)
              {
                  b[i]=a[i];
              }
              for(int i=0;i<a.length;i++)
              System.out.println(b[i]);
    }
}

