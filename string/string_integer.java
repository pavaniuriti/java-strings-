//comand line arguments
class string_integer
{
public static void main(String[] args)
{
int n=args.length;
int sum=0;
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
sum=a+b+c;
System.out.println(sum);
System.out.println(a+b+c);
}
}