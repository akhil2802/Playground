import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<arr_size;i++){
        arr[i]=in.nextInt();
      }
      int search_elem_1=in.nextInt();
      int search_elem_2=in.nextInt();
      int elem1_idx=-1;
      int elem2_idx=-1;
      for(int i=0;i<arr_size;i++){
        if(search_elem_1==arr[i])
          elem1_idx=i;
        if(search_elem_2==arr[i])
          elem2_idx=i;
      }
      System.out.println(elem1_idx);
      System.out.println(elem2_idx);
    }
}