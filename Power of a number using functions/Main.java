import java.util.Scanner;
class Main{
	public static int power (int b,int e){
	  int mul=1;  
      for(int i=1;i<=e;i++){
           mul=mul*b;
        }
      return mul;
	}
  
  
  public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
    int base=in.nextInt();
     int expo=in.nextInt();
    int result=power(base,expo);
    System.out.println(result);
	}
}