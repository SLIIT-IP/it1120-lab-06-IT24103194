import java.util.Scanner;
public class IT24103194Lab6Q2A
{
  public static void main(String[] args)
  {
  
 

  Scanner input=new Scanner(System.in);
  //open a new scanner to user to input numbers
 
  System.out.println("Please enter 10 numbers:");

  int[] a=new int[10];
  //open a new integer array called a to save 10 intergers






  for (int i=0 ; i<10;i++)
  // new variable called i to take wanted amount of integers by above function
  {
  
  System.out.print("Enter number " +(i+1) +":");
 //
 
  a[i]=input.nextInt();
 //take inputs to array a as there one array out of 10

  }





  for (int i=0 ;i<10;i++)
  {

 System.out.print(a[i] +" ");
 //print all arraies one after another

  }
 }
}