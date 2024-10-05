import java.util.Scanner;
public class IT24103194Lab6Q1
{
 public static void main(String[] args)
 {

  double x,num,sqr,sqrt;


  Scanner input=new Scanner(System.in);
  System.out.print("Enter a number :");
  num=input.nextDouble();

  
  sqr=num*num;
  sqrt=Math.sqrt(num);

  System.out.println("The square of "   + num      +" is : "   + sqr);
  System.out.println("The square root of "   + num   +" is : "  + sqrt);
  
 }
}