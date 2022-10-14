import java.util.Scanner;
public  class Square{
   
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What are the last Number of Square Number ");
        int x = sc.nextInt();
        
        for(int i=1;i<=x;i++){
            System.out.println("Square number is "+i*i);
        }
        

    }
}