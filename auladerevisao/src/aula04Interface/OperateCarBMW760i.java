package aula04Interface;

public class OperateCarBMW760i implements OperateCar{

    @Override
    public int turn(Direction direction, int radius, int startSpeed, int endSpeed) {
        return 0;
    }

    @Override
    public int changeLanes(Direction direction, int startSpeed, int endSpeed) {
        return 0;
    }

    @Override
    public int signalTurn(Direction direction, boolean signalOn) {
        return 0;
    }

    @Override
    public int getRadarFront(double distanceToCar, int speedOfCar) {
        return 0;
    }

    @Override
    public int getRadarRear(double distanceToCar, int speedOfCar) {
        return 0;
    }
}
