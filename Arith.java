class Arith
{
public static void main(String args[])
{
 int a=10;
 int b=0;
try
{
 int c=a/b;
 System.out.println(c);
}catch(ArithmeticException e)
{
 System.out.println("You cannot divide any number by zero");
}
 System.out.println("Rest of the code in the Arithmetic exception");

}
}
