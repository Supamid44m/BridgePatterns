public class BridgeDemo {
    public static void main(String[] args) {
        Normalcar car1 = new Normalcar(new Fuel());
        car1.setName("Honda Jazz");
        car1.powered();

        Evcar car2 = new  Evcar(new Electric());
        car2.setName("Tesla Model E");
        car2.powered();

    }
    
}
