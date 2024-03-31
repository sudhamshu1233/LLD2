import controller.*;
import dto.*;
import models.*;
import projectenums.GateType;
import projectenums.PaymentMode;
import projectenums.VehicleType;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ParkingAttendant p1 = new ParkingAttendantController().createParkingAttendant(10001,"A");
        ParkingAttendant p2 = new ParkingAttendantController().createParkingAttendant(10002,"B");
        Gates entryGate = new GatesController().createGates(1, GateType.ENTRY);
        Gates exitGate = new GatesController().createGates(2, GateType.EXIT);
        new GatesController().setParkingAttendantToGate(1,p1);
        new GatesController().setParkingAttendantToGate(2,p2);
        List<Gates> gates  = new ArrayList<>();
        ParkingSpot parkingSpot1 = new ParkingSpotController().createParkingSpot(VehicleType.CAR,null);
        ParkingSpot parkingSpot2 = new ParkingSpotController().createParkingSpot(VehicleType.TRUCK,null);
        ParkingSpot parkingSpot3 = new ParkingSpotController().createParkingSpot(VehicleType.ELECTRIC_CAR,null);
        ParkingSpot parkingSpot4 = new ParkingSpotController().createParkingSpot(VehicleType.TRUCK,null);
        List<ParkingSpot>spots = new ArrayList<>();
        spots.add(parkingSpot1);
        spots.add(parkingSpot2);
        spots.add(parkingSpot3);
        spots.add(parkingSpot4);
        Floor floor1 = new FloorController().floorCreator(FloorCreatorRequest.builder().floorNumber(1).parkingSpots(spots).build());
        CreateParkingLotRequest parkingLotRequest = CreateParkingLotRequest.builder().gates(gates).name("ParkingLot1").floors(List.of(floor1)).id(1).build();
        ParkingLot parkingLot1 = new ParkingLotController().createParkingLot(parkingLotRequest).getParkingLot();
        Vehicle v1 = Vehicle.builder().type(VehicleType.CAR).registerId("KA091637").build();
        Vehicle v2 = Vehicle.builder().type(VehicleType.ELECTRIC_CAR).registerId("KA0916371").build();
        Vehicle v3 = Vehicle.builder().type(VehicleType.TRUCK).registerId("KA0916371").build();
        Vehicle v4 = Vehicle.builder().type(VehicleType.TRUCK).registerId("KA0916371").build();
        Vehicle v5 = Vehicle.builder().type(VehicleType.TRUCK).registerId("KA0916371").build();
        TicketController ticketController = new TicketController();
        IssueTicketResponse response =  ticketController.generateNewTicket(IssueTicketRequest.builder().vehicle(v1).gate(entryGate).parkingLotId(1).build());
        System.out.println(response.getTicket());
        IssueTicketResponse response1 =  ticketController.generateNewTicket(IssueTicketRequest.builder().vehicle(v2).gate(entryGate).parkingLotId(1).build());
        System.out.println(response1.getTicket());
        IssueTicketResponse response2 =  ticketController.generateNewTicket(IssueTicketRequest.builder().vehicle(v3).gate(entryGate).parkingLotId(1).build());
        System.out.println(response2.getTicket());
        IssueTicketResponse response3 =  ticketController.generateNewTicket(IssueTicketRequest.builder().vehicle(v4).gate(entryGate).parkingLotId(1).build());
        System.out.println(response3.getTicket());

        PaymentController paymentController = new PaymentController();
        Payment payment1 =  paymentController.makePayment(PaymentMode.UPI,response3.getTicket());
        InvoiceController invoiceController = new InvoiceController();
        Invoice inv1 =  invoiceController.generateInvoice(InvoiceControllerRequest.builder().payment(payment1).exitGate(exitGate).build());
        System.out.println(inv1.getExitGate());
        IssueTicketResponse response4 =  ticketController.generateNewTicket(IssueTicketRequest.builder().vehicle(v5).gate(entryGate).parkingLotId(1).build());
        System.out.println(response4.getTicket());
        IssueTicketResponse response5 =  ticketController.generateNewTicket(IssueTicketRequest.builder().vehicle(v5).gate(entryGate).parkingLotId(1).build());
        System.out.println(response5.getTicket());







    }
}