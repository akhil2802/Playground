import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int r=in.nextInt();
      int c=in.nextInt();
      for(int i=1;i<=r;i++){
        for(int i1=c;i1>c-i;i1--){
          System.out.print(i1);
        }
        for(int i1=1;i1<=c-i;i1++){
          System.out.print(r-i+1);
        }
        System.out.println();
      }
      
    }
}