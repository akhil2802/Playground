import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int r=1;r<=n;r++){
        for(int c=1;c<=n;c++){
          if((r%2==0) && (c==1) || (r%2==1)&&(c==n) ){  
            System.out.print(r+1);
          }
          else
            System.out.print(r);
        }
        System.out.print("\n");
      }
      
      
	}
}