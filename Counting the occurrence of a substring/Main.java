import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    String str1=in.nextLine();
    String str2=in.nextLine();
    int str1_len=str1.length();
    int str2_len=str2.length();
    int occur_cnt=0;
    for(int i=0;i<str1_len-str2_len+1;i++){
      boolean is_mat=true;
      for(int j=0;j<str2_len;j++){
        if(str1.charAt(i+j)!=str2.charAt(j)){
          is_mat=false;
        }
        
      }
      if(is_mat==true){
        occur_cnt++;
      }
    }
    System.out.print(occur_cnt);
  } 
}