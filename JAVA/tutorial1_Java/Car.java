package tutorial1_Java;

        // - Interface
public class Car implements Vehicule{

    private int gear = 1;
    private int speed = 0;

    public void changeGear(int gear) {
        this.gear = gear;
    }

    public void speedUp(int change) {
        this.speed += change;
    }

    public void slowDown(int change) {
        this.speed -= change;
    }

    public void display(){
        System.out.println("I am a car, going " + this.speed + "km/h and I am in gear " + this.gear);
        out();
    }
    
}
