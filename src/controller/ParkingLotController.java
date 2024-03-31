package controller;
import dto.CreateParkingLotRequest;
import dto.CreateParkingLotResponse;
import dto.FloorCreatorRequest;
import models.*;
import projectenums.GateType;
import projectenums.VehicleType;
import services.FloorService;
import services.GateService;
import services.ParkingLotService;
import services.ParkingSpotService;

public class ParkingLotController {

    public CreateParkingLotResponse createParkingLot(CreateParkingLotRequest request)
    {

        ParkingLot parkingLot = new ParkingLotService().createParkingLot(request.getFloors(),
                request.getAddress(),
                request.getGates(),
                request.getId());
        return new CreateParkingLotResponse(parkingLot);
    }












}
