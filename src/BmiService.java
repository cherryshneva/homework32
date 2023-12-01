public class BmiService {
    public double calculate(int kilograms, double meters) {

        int weight = kilograms;
        double height = meters;

        double index = (kilograms / (meters * meters));

        return index;


    }

}
