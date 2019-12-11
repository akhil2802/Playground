import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in=new Scanner(System.in);
      int s=in.nextInt();
      int arr[]=new int[s];
      for(int i=0;i<s;i++){
        arr[i]=in.nextInt();
      }
      sub(arr,s);
    }
  
  public static void sub(int arr[],int s) {
    for(int i1=0;i1<s-1;i1++){
      for(int i2=i1+1;i2<s;i2++){
        for(int i3=i2+1;i3<s;i3++){
          System.out.print("("+arr[i1]+","+" "+arr[i2]+","+" "+arr[i3]+")"+" ");
        }
      }
      System.out.println();
    }
  }
  
}