import java.util.Scanner;
public class IT24103194Lab6Q2C
 {
  public static void main(String[] args)
  {



  int i,num,total;
  double avg;
  i=1;
  total=0;
  int[] a=new int[11];

  System.out.println("Please enter 10 numbers:");


  



  while (i!=11)
   {
   
   Scanner input=new Scanner(System.in);
   System.out.print("Enter number " +i +":");
   num=input.nextInt();
   a[i]=num;


   i++;
   total=total+num;
   
  

   }



   i=1;
   System.out.println("The numbers you entered are: " );
  

   while (i!=11)
   {
  
   System.out.print(a[i] +" ");
   i++;

   }
 avg=total/10;
 System.out.println( );
 System.out.println("Sum of the numbers:" +total);
 System.out.println("Average of the numbers:"+avg);
  }
}