import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int opt=in.nextInt();
      switch(opt)
      {
      case 1:
         int side=in.nextInt();
         System.out.print(side*side);
          break;
      case 2:
         int len=in.nextInt();
         int bre=in.nextInt();
         System.out.println(len*bre);
          break;
      case 3:
         int base=in.nextInt();
         int hei=in.nextInt();
         System.out.println((base*hei)/2);
          break;
      case 4:
         int rad=in.nextInt();
         System.out.println(3.14*rad*rad);
          break;
      default:
         System.out.println("Invalid input");
      }
      }
}