import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 98;
        double heightMeter = 1.87;

        double index = service.calculate(weightKg, heightMeter);
        System.out.println((int) index);


    }
}
