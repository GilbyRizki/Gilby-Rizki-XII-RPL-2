import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        System.out.println("Selamat datang di Kalkulator Saya");
        System.out.println("---------------------------------");
        while(continueCalculating){
            System.out.print("Masukan angka pertama : ");
            double num1 = scanner.nextDouble();

            System.out.print("Masukan angka kedua : ");
            double num2 = scanner.nextDouble();

            System.out.println("---------------------------------");

            System.out.println("Pilih operasi : ");
            System.out.println("1. Penambahan : ");
            System.out.println("2. Pengurangan : ");
            System.out.println("3. Perkalian : ");
            System.out.println("4. Pembagian : ");
            int operationChoice = scanner.nextInt();

            double result = 0;

            switch (operationChoice){
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0){
                        result = num1 / num2;
                    }else{
                        System.out.println("Tidak bisa melakukan pembagian dengan angka 0.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operasi tidak valid.");
                    continue;        
            }
            System.out.println("---------------------------------");

            System.out.println("Hasil operasi : " + result);

            System.out.print("Apakah Anda ingin melakukan operasi yang lain? (y/t): ");
            String continueChoice = scanner.next().toLowerCase();
            if(!continueChoice.equals("y")){
                continueCalculating = false;
                System.out.println("Terimakasih sudah menggunakan Kalkulatornya!!!");
            }
        }
        scanner.close(); 
    }
} 