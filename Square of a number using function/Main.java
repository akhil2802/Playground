import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.println(sq(n));
	} 
  public static int sq (int num)
  {
    return (num*num);
  }
  
  
}