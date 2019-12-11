import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int f_dig = n/100;
      int l_dig = n %10;
      int res = f_dig + l_dig;
      System.out.println(res);
	}
}