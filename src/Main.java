import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98;
        double height = 1.87;

        double index = service.calculate(weight, height);
        System.out.println((int) index);


    }
}
