import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
      }
      end_zero(arr,n);
      for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
      }
    }
   public static void end_zero(int list[],int s) {
     int count=0;
     for(int i=0;i<s;i++){
       if(list[i]!=0){
         int temp=list[i];
         list[i]=list[count];
         list[count]=temp;
         count++;
       }
     }
   
   }
  
  
}