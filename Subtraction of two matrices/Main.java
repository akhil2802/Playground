import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in=new Scanner(System.in);
    int r_size=in.nextInt();
    int c_size=in.nextInt();
    int m1[][]=new int[r_size][c_size];
    for(int i=0;i<r_size;i++){
      for(int j=0;j<c_size;j++){
         m1[i][j]=in.nextInt();   
      }
    }
    int m2[][]=new int[r_size][c_size];
    for(int i=0;i<r_size;i++){
      for(int j=0;j<c_size;j++){
        m2[i][j]=in.nextInt();
      }
    }
    int sum[][]=new int[r_size][c_size];
    sub(m1,m2,sum);
    disp(sum);
  }
  public static void sub(int m1[][],int m2[][],int sum[][]){
    for(int i=0;i<=sum.length-1;i++){
      for(int j=0;j<=sum[i].length-1;j++){
        sum[i][j]=m1[i][j]-m2[i][j];
      }
    }
  }
  public static void disp(int m[][]){
    for(int i=0;i<=m.length-1;i++){
      for(int j=0;j<=m[i].length-1;j++){
        System.out.print(m[i][j]+ " ");
      }
      System.out.println();
    }
  }
}