import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year,result;
        String message = "Çin Zodyağı Burcunuz: ";
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılı: ");
        year = input.nextInt();

        result = year % 12;

        switch (result){
            case 0:
                System.out.println(message+ "Maymun");
                break;
            case 1:
                System.out.println(message+ "Horoz");
                break;
            case 2:
                System.out.println(message+ "Köpek" );
                break;
            case 3:
                System.out.println(message+ "Domuz" );
                break;
            case 4:
                System.out.println(message+"Fare" );
                break;
            case 5:
                System.out.println(message+ "Öküz");
                break;
            case 6:
                System.out.println(message+ "Kaplan");
                break;
            case 7:
                System.out.println(message+ "Tavşan");
                break;
            case 8:
                System.out.println(message+"Ejderha" );
                break;
            case 9:
                System.out.println(message+"Yılan" );
                break;
            case 10:
                System.out.println(message+ "At");
                break;
            case 11:
                System.out.println(message + "Koyun");
                break;
            default:
                System.out.println("Bir Problem Oluştu. Tekrar deneyiniz.");
                break;
        }
    }
}