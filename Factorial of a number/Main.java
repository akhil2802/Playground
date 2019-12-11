import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int fac=1;
      for(int i=1;i<=n;i++){
      fac=fac*i;
      }
      System.out.print(fac);
	}
}