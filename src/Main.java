public class Main {
    public static void main(String[] args) {
        Pizza marguerita = PizzaDirector.makeMargueritaFine();
        Pizza reine = PizzaDirector.makeReineEpaisse();

        Pizza custom = new Pizza.PizzaBuilder("Crème", 30).garnitures("Oignon").garnitures("lardons").build();

        System.out.println(marguerita.toString());
        System.out.println(reine.toString());
        System.out.println(custom.toString());

    }
}