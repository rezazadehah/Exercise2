import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //es1();
        //es2();
        es3();
    }

    private static void es3()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("enter width : ");
        int width = in.nextInt();
        System.out.print("enter height : ");
        int height = in.nextInt();

        masahat(width , height);
        mohit(width,height);
    }

    private static void masahat(int width,int height){
        System.out.println("masahat : "+(width*height));
    }
    private static void mohit(int width,int height){
        System.out.println("mohit : "+((width+height)*2));
    }

    private static void es2()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your mark 1 : ");
        int mark1 = in.nextInt();
        System.out.print("enter your mark 2 : ");
        int mark2 = in.nextInt();
        System.out.print("enter your mark 3 : ");
        int mark3 = in.nextInt();
        System.out.print("enter your mark 4 : ");
        int mark4 = in.nextInt();

        amozesh(mark1,mark2,mark3,mark4);
    }

    private static void amozesh(int mark1,int mark2,int mark3,int mark4){
        int moadel = (mark1+mark2+mark3+mark4)/4;
        System.out.println("moadel: "+moadel);
        if (moadel<12){
            System.out.println("mashroot");
        }
        else{
            System.out.println("qabol");
        }
    }

    private static void es1()
    {
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
