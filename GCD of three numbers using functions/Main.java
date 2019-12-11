import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
  int n1=in.nextInt();
  int n2=in.nextInt();
  int n3=in.nextInt();
System.out.println(gcd(n1,n2,n3));
}


public static int gcd(int a,int b,int c){
int min,min1,gcd1=0,gcd2=0;
  if(a<b){
   min=a;
  }
  else{
    min=b;
  }
  while(min>=1){
  if((a%min==0)&&(b%min==0)){
    gcd1=min;
    break;
     }
    min--;
  }
  //return gcd1;
if(gcd1<c){
   min1=gcd1;
  }
  else{
    min1=c;
  }
  while(min1>=1){
  if((gcd1%min1==0)&&(c%min1==0)){
    gcd2=min1;
    break;
     }
    min1--;
  }
return gcd2;


}
}
	