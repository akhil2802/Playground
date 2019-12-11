import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=0,copy=n;
      while(n>0){
        int last=n%10;
        int fac=1;
      for(int i=1;i<=last;i++){
        fac=fac*i;
      }
        sum=sum+fac;
        n=n/10;
      
      }
	if(copy==sum){
      System.out.print("Yes");
    }
      else
        System.out.print("No");
    
    }
}