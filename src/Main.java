public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double weight;
        double height;
        double result = service.calculate(weight = 65.7, height = 1.76);
        System.out.println("Ваш индекс массы тела: " + result);

    }
}
