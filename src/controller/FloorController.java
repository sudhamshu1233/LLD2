package controller;

import dto.FloorCreatorRequest;
import models.Floor;
import services.FloorService;

public class FloorController {

    // here we should not initialize  service object we need to DI to improve this...
    FloorService floorService;
    public FloorController(FloorService floorService)
    {
            this.floorService = floorService;
    }
    public Floor floorCreator(FloorCreatorRequest request)
    {
        return floorService.createFloor(request.getParkingSpots(),request.getFloorNumber());
    }
}
