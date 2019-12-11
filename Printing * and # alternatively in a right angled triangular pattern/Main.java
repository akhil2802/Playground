import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		
      int n=in.nextInt();
      int turn=0;
      for(int r=1;r<=n;r++){
        for(int c=1;c<=r;c++){
          if(turn==0){
            System.out.print("*");
            turn=1;
          }
          else{
            System.out.print("#");
            turn=0;
          }
        }
        System.out.print("\n");
      }
    }
}