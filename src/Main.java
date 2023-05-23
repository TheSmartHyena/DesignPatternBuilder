public class Main {
    public static void main(String[] args) {
        Pizza marguerita = PizzaDirector.makeMargueritaFine();
        Pizza reine = PizzaDirector.makeReineEpaisse();

        System.out.println(marguerita.toString());
        System.out.println(reine.toString());
    }
}