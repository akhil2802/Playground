import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int dig_c=0,sum=0,copy=n,pow=1;
      while(n>0){
        dig_c++;
        n=n/10;
      }
      n=copy;
      while(n>0){
      int last=n%10;
        
        for(int i=1;i<=dig_c;i++){
          pow=pow*last;
        }
        sum=sum+pow;
        pow=1;
        n=n/10;
      }
      if(copy==sum){
        System.out.print("Armstrong Number");
      }
      else{
        System.out.print("Not a Armstrong Number");
      }
	
    
    }
}