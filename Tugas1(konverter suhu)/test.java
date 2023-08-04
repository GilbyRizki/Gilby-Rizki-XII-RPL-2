import java.util.Scanner;

public class Temperatur{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Inpu suhu dalam Celcius
        System.out.print("Masukkan suhu dalam Celcius : ");
        double celcius = scanner.nextDouble();

        //Konversi ke Kelvin dan Fahrenheit
        double kelvin = celciusToKelvin(celcius);
        double fahrenheit = celciusToFahrenheit(celcius);

        //Output hasil konversi
        System.out.println("Hasil Konversiny Adalah :");
        System.out.println("Celcius :" + celcius);
        System.out.println("Kelvin :" + kelvin);
        System.out.println("Fahrenheit :" +fahrenheit);

        scanner.close();
    }

    //Konversi dari Celcius ke Kelvin
    public static double celciusToKelvin(double celcius){
        return celcius + 273.15;
    }

    //Konversi dari Celcius ke Fahrenheit
    public static double celciusToFahrenheit(double celcius){
        return (celcius * 9 / 5 +32);
    }
}