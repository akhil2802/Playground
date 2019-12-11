import java.util.Scanner;
class Main{
    public static void main(String args[]){
            Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt(),max=0,res=0;
      int arr[]=new int[arr_size];
      for(int i=0;i<arr_size;i++){
        arr[i]=in.nextInt();
      }
      if(arr[0]<arr[1])
        max=arr[1];
      else
        max=arr[0];
      for(int i=2;i<arr_size;i++){
        if(max>arr[i])
          res=max;
        else
          res=arr[i];
      }
      System.out.println(res);
    }
}