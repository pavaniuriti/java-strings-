//token with delimeter specification and true
//true=consider spaces as tokens     ex =how are you    ouput for count is 5
import java.util.*;
class tokendeltrue
{
public static void main(String args[])
{
StringTokenizer ob=new StringTokenizer("pavani>uriti>nimmakuru",">",true);
int n;
n=ob.countTokens();
System.out.println(n);
System.out.println(ob.hasMoreTokens());
}
}