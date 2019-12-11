import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      int s=in.nextInt();
      int arr[]=new int[s];
      for(int i=0;i<s;i++){
        arr[i]=in.nextInt();
      }
      int val=in.nextInt();
      per(arr,s,val);
      
    }
   public static void per(int arr[],int s,int val) {
     for(int i=0;i<s;i++){
       for(int i1=i+1;i1<s;i1++){
         int sum=arr[i]+arr[i1];
         if(sum==val){
           System.out.print(arr[i]+","+" "+arr[i1]);
            System.out.println();
         }
       }
      
     }
   }
  
  
}