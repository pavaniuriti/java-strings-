//strings 3
class string3
{
public static void main(String args[])
{
String s1="hello";
int n=s1.length();
System.out.println(n);      //printing length

String s2="hai";
String s3,s4;
s3=s1+s2;                           //concat 1st way
System.out.println(s3);
s4=s1.concat(s2);         //concate 2nd way
System.out.println(s4);

int n1=s1.compareTo(s2);
System.out.println(n1);      //comparing 1st way
int n2=s1.compareToIgnoreCase(s2);   //comparing 2nd way
System.out.println(n2);
String s6="main";
String s7="jee";
boolean s8;
s8=s6.equals(s7);
System.out.println(s8);


}
}
