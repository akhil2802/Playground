import java.util.Scanner;
class Main{
  public static boolean is_prime (int m){
	    boolean isprime=true;
    for(int a=2;a<=m/2;a++){
      if(m%a==0){
        isprime=false;
        //break;
      }
      
    }
    return isprime;
	}
  
  
  
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=2;i<=n;i++){
        if(is_prime(i)){
          System.out.println(i);
        }
      }
	    
	}
}