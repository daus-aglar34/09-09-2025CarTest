public class Car {
    int numDoors;
    boolean isElectric;

    // Constructor Default
    public Car() {
        numDoors = 4;
        isElectric = false;
    }
    // Counstructor with parameter
    public Car(int numDoors, boolean isElectric) {
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }

    public void displayInfo() {
        System.out.println("Number of doors: " + numDoors);
        System.out.println("Is electric: " + isElectric);
    }
}
