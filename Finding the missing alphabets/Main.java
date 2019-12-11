import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int str_len=sb.length();
      int frq[]=new int[26];
      for(int i=0;i<16;i++){
        frq[i]=0;
      }
      for(int i=0;i<str_len;i++){
        if(sb.charAt(i)>='A' && sb.charAt(i)<='Z'){
          frq[sb.charAt(i)-'A']++;
        }
        if(sb.charAt(i)>='a'&&sb.charAt(i)<='z'){
          frq[sb.charAt(i)-'a']++;
        }
      }
      for(int i=0;i<26;i++){
        if(frq[i]==0){
          char missing=(char)(i+'a');
          System.out.print(missing+" " );
        }
      }
    }
}