public class Car {
    private String carModel;
    private String carSpeed;

    public Car() {
    }

    public Car(String carModel, String carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    public String getCarModel() {

        if (carModel == null) {
            return "";
        }
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarSpeed() {

        if (carSpeed == null) {
            return "";
        }
        return carSpeed;
    }

    public void setCarSpeed(String carSpeed) {
        this.carSpeed = carSpeed;
    }
}
