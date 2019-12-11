import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    int i,j;
    for(i=0;i<n;i++){
      arr[i]=in.nextInt();  
    }
    System.out.print(sum_subseq(arr,n));
  }
  public static int sum_subseq(int arr[],int n){
    int running_sum,max_sum_sub,i;
    running_sum=arr[0];
    max_sum_sub=arr[0];
    for(i=1;i<n;i++){
      if(arr[i]>arr[i-1]){
        running_sum+=arr[i];
      }
      else{
        running_sum=arr[i];
      }
      if(running_sum>max_sum_sub){
        max_sum_sub=running_sum;
      }
    }
    return max_sum_sub;
  }
}