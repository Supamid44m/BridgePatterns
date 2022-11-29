public class Evcar extends Car {

    
    
    private String name;

    public Evcar(Engine engine){
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
