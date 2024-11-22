package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", "Gasoline");

        myCar.showDetails();

        myCar.start();
        System.out.println("¿Tacómetro mayor que 0?: " + myCar.isTachometerGreaterThanZero());

        myCar.start();

        myCar.accelerate();
        System.out.println("Velocidad actual: " + myCar.speedometer);

        myCar.brake();
        System.out.println("Velocidad actual después de frenar: " + myCar.speedometer);

        myCar.brake();
        System.out.println("Velocidad actual después de intentar frenar más: " + myCar.speedometer);

        myCar.turnAngleOfWheels(20);
        System.out.println("Ángulo de las ruedas: " + myCar.wheelsAngle);

        myCar.turnAngleOfWheels(30);
        System.out.println("Ángulo de las ruedas después de exceder el rango: " + myCar.wheelsAngle);

        myCar.accelerate();
        myCar.setReverse(true);
        System.out.println("Engranaje actual: " + myCar.gear);

        while (myCar.speedometer > 0) {
            myCar.brake();
        }
        myCar.setReverse(true);
        System.out.println("Engranaje actual después de detenerse: " + myCar.gear);

        myCar.stop();
        System.out.println("¿Tacómetro igual a 0?: " + myCar.isTachometerEqualToZero());

        myCar.stop();
    }
}
