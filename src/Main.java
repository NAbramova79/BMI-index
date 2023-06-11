// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 62; // Значение веса в килограммах
        double height = 1.64; // Значение роста в метрах
        double bmi = service.calculate(height, weight);
        
        System.out.println("Значение индекса массы тела:");
        System.out.println((int)bmi);
    }
}