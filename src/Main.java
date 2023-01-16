public class Main {
    public static void main(String[] args) {
        BmiServise service = new BmiServise();
        double myBmiService = service.calculate(1.60, 58);
        System.out.println( "Индекс массы тела:" + myBmiService);
    }
}