package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Gate {
    int gateNumber;

    ParkingAttendant parkingAttendant;

    GateType gateType;


}
