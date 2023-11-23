public class BmiService {
    public double calculate(double heightM, int weightKg) {
        return weightKg / (heightM * heightM);
    }
}

