public class Normalcar extends Car {
    private String name;

    public Normalcar(Engine engine){
        super(engine);
    }

   
    @Override
    public void powered() {
        System.out.println(name+" "+"is powerd by");
        engine.powered();
        
        
    }
    @Override
    public void setName(String name) {
        this.name=name;
        
    }
    
}
