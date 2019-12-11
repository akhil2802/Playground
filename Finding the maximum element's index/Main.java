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
    max(list,n);
  }
  public static void max(int arr[],int num)
  {
  int max_n;
    if(arr[0]>arr[1]){
      max_n=0;
    }
    else
      max_n=1;
    for(int i=2;i<num;i++){
      if(arr[max_n]<arr[i]){
        max_n=i;
      }
    }
    System.out.print(max_n);
  }
  
  
}