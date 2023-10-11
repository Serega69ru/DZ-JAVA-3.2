public class BmiService {
    public int calculate(double metr, int weight) {
        double index = weight / (metr * metr);
        return (int) index;
    }
}
