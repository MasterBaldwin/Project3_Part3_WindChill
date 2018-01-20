import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        double temp;
        int windSpeed;

        System.out.print("Enter temperature(Fahrenheit): ");
        temp = inputStream.nextDouble();

        System.out.print("Enter wind speed(mph): ");
        windSpeed = inputStream.nextInt();

        int chillIndex = (int) (35.74 + 0.6215 * temp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temp * Math.pow(windSpeed, 0.16));
        System.out.println("The wind chill index is " + chillIndex);
    }
}
