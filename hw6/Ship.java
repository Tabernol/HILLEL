package hw6;

public class Ship extends Transport {
    double netCarryingCapacity;
    double volumeOfCargoSpace;

    @Override
    double carryingCapacity() {
        return volumeOfCargoSpace / netCarryingCapacity;
    }
}
