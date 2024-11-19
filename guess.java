import java.util.*;
public class guess
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println();
    int guess,random,f=0;
    random=(int)(Math.random()*100 +1);
    int maxGuess=(int)(Math.random()*10+1);
    int t=maxGuess;
    System.out.println("Guess your number betwen 1 and 100: ");
  System.out.println("You have "+maxGuess+" attempts only.");
   while(maxGuess>0){
  guess=sc.nextInt();
    maxGuess--;
  if(guess<random)
  {
  System.out.println("wrong guess! Please Guess larger number !!"); 
  System.out.println(maxGuess+" attempts are left"); 
  }
  else if(guess>random)
  {
   System.out.println("wrong guess! Please Guess smaller number !!");
   System.out.println(maxGuess+" attempts are left"); 
  }
  else
  {
  System.out.println("Congratulations !!! You have successfully quessed the number.");
  System.out.println("You have taken "+(t-maxGuess)+"attempt to guess the number");
  f++;
  break;
  }
 }
 if(f==0){
     System.out.println("Better luck next time");
 }
    sc.close();
}
}