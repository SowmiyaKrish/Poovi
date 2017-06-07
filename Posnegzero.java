import java.io.*;
import java.util.*;
public class Posnegzero
{
public static void main(String args[])
{
Scanner can=new Scanner(System.in);
int num=can.nextInt();
if(num==0)
{
System.out.println("zero");
}
else
{
if(num>0)
{
System.out.println("positive");
}
else
{
System.out.println("Negative");
}
}
}
}
