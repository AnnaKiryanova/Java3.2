public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 50;
        double heightM = 1.69;
        double bmiIndex = service.calculate(weightKg, heightM);

        System.out.println("Ваш индекс массы тела: " + bmiIndex);
    }
}