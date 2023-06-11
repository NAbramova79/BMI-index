public class BmiService {
    public double calculate(double height, int weight) {
        double result;
        result = weight / (height * height);
        return result;
    }
}
