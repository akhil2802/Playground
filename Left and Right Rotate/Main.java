import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
    }
    int rot=in.nextInt();
    lre(n,arr,rot);
    rro(n,arr,rot);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  	}
  public static void lre(int n,int arr[],int rot)
  {
    int fir_even_idx=1;
    int last_even_idx;
    if(n%2==0){
      last_even_idx=n-1;
     }
    else{
      last_even_idx=n-2;
    }
    for(int r=1;r<=rot;r++){
      int temp=arr[fir_even_idx];
      for(int i=3;i<n;i+=2){
        arr[i-2]=arr[i];        
      }
      arr[last_even_idx]=temp;
    }
  }
  
   public static void rro(int n,int arr[],int rot)
   {
     int fir_odd_idx=0;
     int last_odd_idx;
     if(n%2==1){
       last_odd_idx=n-1;
     }
     else{
       last_odd_idx=n-2;
     }
     for(int r=1;r<=rot;r++){
       int temp=arr[last_odd_idx];
       for(int i=last_odd_idx-2;i>=0;i=i-2){
         arr[i+2]=arr[i];
       }
       arr[fir_odd_idx]=temp;
     }
   }
  
  
  
}