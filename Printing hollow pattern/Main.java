import java.util.Scanner;
class Main{
	public static void main (String[] args){
	      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int r=1;r<=n;r++){
        for(int c=1;c<=n;c++){
          if((r==1) || (r==n) || (c==1) || (c==n)){  
            System.out.print("*");
          }
          else
            System.out.print(" ");
        }
        System.out.print("\n");
      }
      
      
      
	}
}