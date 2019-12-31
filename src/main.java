import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter your salary : ");
        int salary = in.nextInt();
        System.out.print("enter your qest : ");
        int qest = in.nextInt();

        income(salary , qest);


    }
    private static void income(int slary,int qest){
        System.out.println("your net : "+(slary-qest));
    }
}
