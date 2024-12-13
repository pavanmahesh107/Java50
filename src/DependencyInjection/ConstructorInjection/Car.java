package DependencyInjection.ConstructorInjection;

// Dependent Class
public class Car {
    private Engine engine;

    Car(Engine engine){
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("Car is driving");
    }
}
