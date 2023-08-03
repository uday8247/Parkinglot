package models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingLot {
    List<ParkingFloor> parkingFloors;
    List<Gate> entryGates;
    List<Gate> exitGates;
    private String name;
    private String address;
}
