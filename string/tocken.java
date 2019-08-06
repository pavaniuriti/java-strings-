//string tockenizer
import  java.util.*;
class token
{
public static void main(String args[])
{
StringTokenizer ob=new StringTokenizer("pavani uriti");
String s1=ob.nextToken();
System.out.println(ob.hasMoreTokens());
System.out.println(s1);

}
}