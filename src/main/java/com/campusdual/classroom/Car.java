package com.campusdual.classroom;

public class Car {

    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {}

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("El vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("No se puede apagar el vehículo, primero debe estar detenido");
        }
    }

    public void accelerate() {
        if (tachometer > 0 && speedometer < MAX_SPEED) {
            speedometer += 5;
            if (speedometer > MAX_SPEED) {
                speedometer = MAX_SPEED;
            }
        } else {
            System.out.println("No se puede acelerar más allá de la velocidad máxima");
        }
    }

    public void brake() {
        if (speedometer > 0) {
            speedometer -= 5;
            if (speedometer < 0) {
                speedometer = 0;
            }
        } else {
            System.out.println("El coche ya está detenido");
        }
    }

    public void turnAngleOfWheels(int angle) {
        if (angle + wheelsAngle > 45) {
            wheelsAngle = 45;
        } else if (angle + wheelsAngle < -45) {
            wheelsAngle = -45;
        } else {
            wheelsAngle += angle;
        }
    }

    public String showSteeringWheelDetail() {
        return "Steering wheel angle: " + this.wheelsAngle;
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if (speedometer == 0) {
            this.reverse = reverse;
            this.gear = reverse ? "R" : "N";
        } else {
            System.out.println("No se puede poner marcha atrás mientras el coche está en movimiento");
        }
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public void showDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Fuel: " + this.fuel);
    }
}
