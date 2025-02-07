import java.util.Scanner;

class Fareena{
  public static void main(String[]args){
      Scanner input=new Scanner(System.in);
      while (true) { 
         int size=input.nextInt();
         if(size==0){
          break;
         }
         int table[]=new int[10];
         for(int i=0;i<10;i++){
          table[i]=size*(i+1);
         }
         for (int i = 0; i < 10; i++) {
          System.out.println(i+1+"x"+size+"="+table[i]);
         }
      }
      input.close();
  }
}