package controller;

import dto.FloorCreatorRequest;
import models.Floor;
import services.FloorService;

public class FloorController {
    public Floor floorCreator(FloorCreatorRequest request)
    {
        return new FloorService().createFloor(request.getParkingSpots(),request.getFloorNumber());
    }
}
