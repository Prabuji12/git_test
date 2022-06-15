import java.util;
class OddOrEven{
 public static void main(String[] arg){
  Scanner sc = new Scanner(System.in);
  int input = sc.nextInt();
  if(input%2==0){
   System.out.println("Given number is Even");
  }
  else
  System.out.println("Given number is Odd");
 }
}