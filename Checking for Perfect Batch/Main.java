import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int list[]=new int[n];
    for(int i=0;i<n;i++){
      list[i]=in.nextInt();
    }
    per(list,n);
  }
   public static void per(int list[],int num)
   {
   boolean is_per=true;
     int fir_sum=list[0]+list[1]+list[2];
     for(int i=3;i<num;i=i+3){
       int curr_sum=list[i]+list[i+1]+list[i+2];
       if(curr_sum!=fir_sum){
         is_per=false;
         break;
       }
     }
     if(is_per==true)
       System.out.print("Perfect Batch");
     else
       System.out.print("Not a Perfect Batch");
   }
  
  
}