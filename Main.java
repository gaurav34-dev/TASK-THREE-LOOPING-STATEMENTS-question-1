import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    while(true)
      {
    Scanner input = new Scanner(System.in);
    System.out.println("enter a number to print its table");
    int i = input.nextInt(); 
        for(int j=1;j<11;j++)
          {
      System.out.println(i+"x"+j+"="+(i*j));
          }
      }
  }
}


