package src.HILLEL.homeWork6;

import src.HILLEL.homeWork6.Transport;

public class Ship extends Transport {
    double netCarryingCapacity;
    double volumeOfCargoSpace;

    @Override
    double carryingCapacity() {
        return volumeOfCargoSpace / netCarryingCapacity;
    }
}
