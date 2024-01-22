package web.model;

public class Car {
    private Integer series;
    private String model;

    public Car(Integer series, String model){
        this.series = series;
        this.model = model;
    }

    public Integer getSeries() {
        return series;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car series - "+ series +", model - " + model;
    }
}
