//creating a class
import java.lang.String;
class string1
{
public static void main(String args[])
{
String s1="hello";                //-----1st way
System.out.println(s1);
String s2=new String();      //2nd way
s2="hello";
System.out.println(s2);
String s3=new String("hello");   //3rd way
System.out.println("hello");        //4th way
char str[]={'h','e','l','l','o'};           //5th way
int n,i=0;
n=str.length;
for(i=0;i<n;i++)
{
System.out.println(str[i]);
}
String s5=new String(str,1,3);
System.out.println(s5);
}
}
