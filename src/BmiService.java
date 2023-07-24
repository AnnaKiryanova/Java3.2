public class BmiService {
    public double calculate(double weightKg, double heightM) {
        double bmiIndex = weightKg / (heightM * heightM);
        return (int) bmiIndex;
    }
}
