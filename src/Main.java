public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM = 1.87;
        int weightKg = 98;
        double bmi = service.calculate(heightM, weightKg);
        System.out.println(bmi);
    }
}
