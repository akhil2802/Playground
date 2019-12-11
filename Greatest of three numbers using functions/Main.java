import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.println(gre(n1,n2,n3));
      
	}
  
  public static int gre (int a,int b,int c){
int res,result;
    if(a<b)
      res=b;
    else
      res=a;
    if(res<c)
      result=c;
    else
      result=res;
  return result;
  }



}