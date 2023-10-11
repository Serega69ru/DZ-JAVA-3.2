public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double metr = 1.87;
        int weight = 98;
        int index = service.calculate(metr, weight); // должно получиться 28
        System.out.println(index);
    }
}