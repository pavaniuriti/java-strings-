//token with delimeter
import java.util.*;
class tokendel
{
public static void main(String args[])
{
StringTokenizer ob=new StringTokenizer("pavani,uriti pammaru machilipatnam",",");
System.out.println(ob.hasMoreTokens());
int n;
n=ob.countTokens();
System.out.println(n);
}
}