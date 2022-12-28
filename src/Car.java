public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, float engineVolume, String color, int year, String country) {
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        this.brand = brand;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5F;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "White";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        this.country = country;
    }

    Car(String brand, String model, int year) {
        if (model == null) {          //Helping Constructor here(im a bit lazy today )
            this.model = "default";
        } else {
            this.model = model;
        }
        this.brand = brand;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5F;
        } else if (engineVolume == 0.0F) {
            this.engineVolume = 3.0F;
        } else {
            this.engineVolume = engineVolume;
        }
        this.color = "Black";
        this.year = year;
        this.country = "Germany";
    }

    @Override
    public String toString() {
        return "Brand is " + brand + " model " + model + ", engineVolume " + engineVolume + ", color " + color + ", year " + year + ", country " + country + '\'';
    }
}
