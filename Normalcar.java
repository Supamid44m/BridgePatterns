public class Normalcar extends Car {
    private String name;

    public Normalcar(Engine engine){
        super(engine);
    }

    public void setName(String name){
        this.name=name;
    }

    @Override
    public void powered() {
        System.out.println(name+" "+"is powerd by");
        engine.powered();
        
        
    }
    
}
