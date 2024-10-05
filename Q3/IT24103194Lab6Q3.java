import java.util.Scanner;
public class IT24103194Lab6Q3
{
 public static void main(String[] args)
 {


int n,total,i;
double RMS;

 n=1;
 total=0;
 i=0;

while (i!=-99)
 {
if(i>=0)

 {
 Scanner input=new Scanner(System.in);
 System.out.print("Enter a number : ");
 i=input.nextInt();
   

 n++;
 total=total+i;



  }
 else if(i<0)

 {

 System.out.print("Invalid input.Please enter a positive integer or -99 to terminate");

 }

 }


 RMS=total/n;
 System.out.println("The Root Mean Square (RMS) is:" +RMS);
 }
}