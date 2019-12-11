import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in=new Scanner(System.in);
    int arr_size=in.nextInt();
    int arr[]=new int[arr_size];
    for(int i=0;i<arr_size;i++){
      arr[i]=in.nextInt();
    }
    int sum_arr[]=new int[3*arr_size];
    increasing_sub_arr(arr_size,arr,sum_arr);
  }
  public static void increasing_sub_arr(int arr_size,int arr[],int sum_arr[]){
    for(int i1=0;i1<=arr_size-1;i1++){
      int key=arr[i1];
      for(int i2=i1+1;i2<=arr_size-1;i2++){
        if(arr[i2]>key)
          System.out.println(key+","+arr[i2]+" ");
      }
    }
  }
}