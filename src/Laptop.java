public record Laptop(String brand, String model, int ram, int ssd, String OS, String color) {

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", OS='" + OS + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}