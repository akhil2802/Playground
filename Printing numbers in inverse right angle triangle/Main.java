import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=n;
      for(int r=1;r<=n;r++){
        //System.out.print(num-r+1);
        for(int c=1;c<=n-r+1;c++){
          System.out.print(num);
          num=num-1;;
        }
        System.out.print("\n");
        num=n-r;
      }
	}
}