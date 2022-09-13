package aula04Interface;

public interface OperateCar {
    //Constantes, se houver


    //Assinaturas dos metodos

    int turn(Direction direction, int radius, int startSpeed, int endSpeed);
    int changeLanes(Direction direction, int startSpeed, int endSpeed);
    int signalTurn(Direction direction, boolean signalOn);
    int getRadarFront(double distanceToCar, int speedOfCar);
    int getRadarRear(double distanceToCar, int speedOfCar);


}
