package DefiningClasses;

public class Car {
    private String make;
    private String model;
    private int horsePower;


    public void getInfo(){
        System.out.printf("The car is: %s %s - %d HP.%n", make, model, horsePower);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
