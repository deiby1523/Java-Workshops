public class RandomRange {
    public static void main(String[] args) {
        
        double x1 = 10;
        double x2 = 20;

        double f = Math.random()/Math.nextDown(1.0);
        double x = x1*(1.0 - f) + x2*f;

        System.out.println("x = " + x);

        
    }
}
