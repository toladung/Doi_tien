import java.util.Scanner;

public class DOI_TIEN {
    public static void usd (
    ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền bạn muốn đổi:");
        int a = scanner.nextInt();
        int b = 23000;
        int c = a*b;
        System.out.println("Số tiền bạn nhận được là:" + c + "VND");
    };
    public static void japan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền bạn muốn đổi:");
        int a = scanner.nextInt();
        int b = 230;
        int c = a*b;
        System.out.println("Số tiền bạn nhận được là:" + c + "VND");
    };
    public static void won(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền bạn muốn đổi:");
        int a = scanner.nextInt();
        double b = 19.3;
        double c = a*b;
        System.out.println("Số tiền bạn nhận được là:" + c + "VND");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn đổi sang tiền gì:");
        System.out.println("1. USD -> VND");
        System.out.println("2. JPY -> VND");
        System.out.println("3. WON -> VND");
        System.out.println("4. thoát chương trình");
        int a = scanner.nextInt();
        switch (a){
            case 1 :
                usd();
                break;
            case 2 :
                japan();
                break;
            case 3 :
                won();
                break;
            default: System.exit(4);



        }


    }
}
