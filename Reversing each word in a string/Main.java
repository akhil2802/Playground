import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    rev(str);
  }
  public static void rev(String str){
    String[] words=str.split(" ");
    String rev_str="";
    for(int i=0;i<words.length;i++){
      String word=words[i];
      String rev= "";
      for(int j=word.length()-1;j>=0;j--){
        rev=rev+word.charAt(j);
      }
     
      rev_str=rev_str+rev+ " ";
    }
    System.out.println(rev_str);
  }
}