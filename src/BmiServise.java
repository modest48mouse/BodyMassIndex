public class BmiServise {
    public double calculate(double height, double weight) {
        double result = (weight / (height * height));
        return result;
    }
}
