import java.io.*;
import java.util.*;
public class Vow
{
public static void main(String args[])
{
Scanner hike=new Scanner(System.in);
char str=hike.next();
if(str=='a' || str=='e' || str=='i' || str=='o' || str=='u')
{
System.out.println("vowel");
}
else
{
System.out.println("consonants");
}
}
}
