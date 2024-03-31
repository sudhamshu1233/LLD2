package strategies;

import projectenums.VehicleType;

public class CostCalculatingFactory {
    public CostCalculatingStrategy getCostCalculatingStrategy(VehicleType vehicleType)
    {
        if(vehicleType.equals(VehicleType.CAR))
        {
            return new CarCostCalculatingStrategy();
        }
        else if(vehicleType.equals(VehicleType.BIKE))
        {
            return new BikeCostCalculatingStrategy();
        }
        else if(vehicleType.equals(VehicleType.ELECTRIC_CAR))
        {
            return  new ElectricCarCostCalculatingStrategy();
        }
        else if(vehicleType.equals(VehicleType.TRUCK))
        {
            return  new TruckCostCalculatingStrategy();
        }
        else
        {
            return new OtherCostCalculatingStrategy();
        }
    }
}
