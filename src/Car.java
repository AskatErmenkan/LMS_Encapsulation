public class Car {
     private String brand;
     private String model;
     private int year;
     private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
     public String getcar(){
        return String.format("""
                brand: %s
                model: %s
                year: %s
                color: %s
                """, brand, model, year, color);
     }
}