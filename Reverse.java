/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Reverse
{
    public static void main(String[] args)
    {
         int [ ] a = new int[5];
         Scanner sc=new Scanner(System.in);
              for(int i=0;i<a.length;i++)
              {
                  a[i] = sc.nextInt();
              }
              int i=0;
              int j=a.length-1;
              while(i<j)
              {
                  int temp=0;
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
                  i+=1;
                  j-=1;
              }
                  for(int k=0;k<a.length;k++)
                  {
                   System.out.println(a[k]);
                   }
               
    }
}

