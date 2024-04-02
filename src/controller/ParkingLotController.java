package controller;
import dto.CreateParkingLotRequest;
import dto.CreateParkingLotResponse;
import dto.FloorCreatorRequest;
import models.*;
import projectenums.GateType;
import projectenums.VehicleType;
import services.*;

public class ParkingLotController {
    ParkingLotService parkingLotService;
    public ParkingLotController(ParkingLotService parkingLotService)
    {
        this.parkingLotService = parkingLotService;
    }

    public CreateParkingLotResponse createParkingLot(CreateParkingLotRequest request)
    {

        ParkingLot parkingLot = parkingLotService.createParkingLot(request.getFloors(),
                request.getAddress(),
                request.getGates(),
                request.getId());
        return new CreateParkingLotResponse(parkingLot);
    }












}
