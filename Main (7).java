import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner kbd= new Scanner(System.in);
    int x=kbd.nextInt();
    int y= kbd.nextInt();
    int n=kbd.nextInt();
 
  for (int i = 1; i <= n; i++) {
    if (i % x == 0 && i % y == 0) {
     System.out.print( "FizzBuzz" + "\n");
    }
    else if (i % x == 0) {
     System.out.print("Fizz" + "\n") ;
    } 
    else if (i % y == 0) {
      System.out.print( "Buzz" + "\n");
    }
    else 
    {
     System.out.print( i + "\n");
    }
  }
}
}
    
    