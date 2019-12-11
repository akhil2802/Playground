import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int val=fact(num);
    System.out.print(val);
  }
  public static int fact(int num){
    if(num==0)
      return 1;
    else
      return num*fact(num-1);
  }
}