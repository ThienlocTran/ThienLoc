import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void Math2Number(){
        double number1,number2;
        System.out.print("Enter the first number ");
        number1 = sc.nextDouble();

        System.out.print("Enter the second number ");
        number2 = sc.nextDouble();

        System.out.println("The result plus is: "+number1+" + "+number2+" = "+(number1 + number2));
        System.out.println("The result minus is:  " + number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println("The result multiplication is: " +number1+" * " + number2 + " = " + number1 * number2);
        if(number2 != 0) System.out.println("The result division is: " + number1 + " / " + number2 + " = " + number1 / number2);
        else System.out.println("The result is invalid");
    }

    public static void findVaribleX(){
        double numberA,numberB;
        System.out.println("Enter Ax + B = C");
        System.out.print("Enter A: ");
        numberA = sc.nextDouble();

        System.out.print("Enter B: ");
        numberB = sc.nextDouble();

//        if( numberA == 0) System.out.println("Vo so nghiem");
//        else if( numberB == 0) System.out.println("ERROR");
//        else System.out.println("Phuong trinh co nghiem la: " + (-numberA  / numberB));

        System.out.println( "Phuong trinh co nghiem: " +
                (numberA != 0 ? (numberB != 0 ? (-numberA /numberB ) : "ERROR") : "Vo so nghiem"));
    }

    public static void findNumberChinhPhuong(){
        System.out.print("Nhap so: ");
        int chinhphuong = sc.nextInt();
        int sqrt = (int) Math.sqrt(chinhphuong);
        if (sqrt * sqrt == chinhphuong) {
            System.out.println(chinhphuong + " la so chinh phuong");
        } else {
            System.out.println(chinhphuong + " khong phai la so chinh phuong");
        }
    }

    public static void checkPrimeNumber(){
        boolean isPrime = true;
        System.out.println("Enter Prime number");
        double numberPrime = sc.nextDouble();

        if( numberPrime < 2) isPrime = false; // so be hon 2 khong phai la so nguyen to
        for(int i = 2; i <= Math.sqrt(numberPrime) ; i ++){
            if(numberPrime % i == 0) isPrime = false ; // so chia het cho 2 hoac 3 hoac 5 thi khong phai la so nguyen to
            // mang chay tu 2 den so num . VD num = 49 -> chay tu 2 den 7 -> do chay nhieu lan
        }
        isPrime =  true;
        if(isPrime) System.out.println(numberPrime + " is a prime number");
        else System.out.println(numberPrime + " is not a prime number");
    }

    public static void Menu(){

        int choice  ;

        do{
            System.out.println("============Welcome to Menu ============");
            System.out.println("Press 1  Math 2 number");
            System.out.println("Press 2  find varible X ");
            System.out.println("Press 3  find number chinh phuong");
            System.out.println("Press 4  check prime number");
            System.out.println("Enter your want!");

            choice = sc.nextInt();

            switch (choice){
                case 1 -> Math2Number();
                case 2 -> findVaribleX();
                case 3 -> findNumberChinhPhuong();
                case 4 -> checkPrimeNumber();
                default -> System.out.println("Lua chon khong hop le");

            }
        }while (choice > 0 && choice < 4);
    }
    public static void main(String[] args) {
       /* System.out.println("VitaminCode03");
        String fullname = "Trần Thiên Lộc";
        byte age = 20;
        boolean gender = true; // là nam
        System.out.println("Gender: " + ((gender) ? "Nam":"Nữ"));
        short weight = 61;*/
//        Math2Number();
//        findVaribleX();
        Menu();
//        1/ Tính + - * / của 2 số nhập từ bàn phím
//        2/ Tính nghiệm của phương trình A + Bx = C
//        3/ Tính số chính phương 1 số
//        4/ Tính số nguyên tố của 1 số
    }
}