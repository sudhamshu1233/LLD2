import controller.*;
import dto.*;
import models.*;
import projectenums.GateType;
import projectenums.PaymentMode;
import projectenums.VehicleType;
import services.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ParkingAttendantService parkingAttendantService = new ParkingAttendantService();
        ParkingAttendant p1 = new ParkingAttendantController(parkingAttendantService).createParkingAttendant(10001,"A");
        ParkingAttendant p2 = new ParkingAttendantController(parkingAttendantService).createParkingAttendant(10002,"B");
        GateService gateService = new GateService();
        Gates entryGate = new GatesController(gateService).createGates(1, GateType.ENTRY);
        Gates exitGate = new GatesController(gateService).createGates(2, GateType.EXIT);
        new GatesController(gateService).setParkingAttendantToGate(1,p1);
        new GatesController(gateService).setParkingAttendantToGate(2,p2);
        List<Gates> gates  = new ArrayList<>();
        ParkingSpotService parkingSpotService = new ParkingSpotService();
        ParkingSpot parkingSpot1 = new ParkingSpotController(parkingSpotService).createParkingSpot(VehicleType.CAR,null);
        ParkingSpot parkingSpot2 = new ParkingSpotController(parkingSpotService).createParkingSpot(VehicleType.TRUCK,null);
        ParkingSpot parkingSpot3 = new ParkingSpotController(parkingSpotService).createParkingSpot(VehicleType.ELECTRIC_CAR,null);
        ParkingSpot parkingSpot4 = new ParkingSpotController(parkingSpotService).createParkingSpot(VehicleType.TRUCK,null);
        List<ParkingSpot>spots = new ArrayList<>();
        spots.add(parkingSpot1);
        spots.add(parkingSpot2);
        spots.add(parkingSpot3);
        spots.add(parkingSpot4);
        FloorService floorService = new FloorService();
        Floor floor1 = new FloorController(floorService).floorCreator(FloorCreatorRequest.builder().floorNumber(1).parkingSpots(spots).build());
        CreateParkingLotRequest parkingLotRequest = CreateParkingLotRequest.builder().gates(gates).name("ParkingLot1").floors(List.of(floor1)).id(1).build();
        ParkingLotService parkingLotService = new ParkingLotService();
        ParkingLot parkingLot1 = new ParkingLotController(parkingLotService).createParkingLot(parkingLotRequest).getParkingLot();
        Vehicle v1 = Vehicle.builder().type(VehicleType.CAR).registerId("KA091637").build();
        Vehicle v2 = Vehicle.builder().type(VehicleType.ELECTRIC_CAR).registerId("KA0916371").build();
        Vehicle v3 = Vehicle.builder().type(VehicleType.TRUCK).registerId("KA0916371").build();
        Vehicle v4 = Vehicle.builder().type(VehicleType.TRUCK).registerId("KA0916371").build();
        Vehicle v5 = Vehicle.builder().type(VehicleType.TRUCK).registerId("KA0916371").build();
        TicketService ticketService = new TicketService();
        TicketController ticketController = new TicketController(ticketService);
        IssueTicketResponse response =  ticketController.generateNewTicket(IssueTicketRequest.builder().vehicle(v1).gate(entryGate).parkingLotId(1).build());
        System.out.println(response.getTicket());
        IssueTicketResponse response1 =  ticketController.generateNewTicket(IssueTicketRequest.builder().vehicle(v2).gate(entryGate).parkingLotId(1).build());
        System.out.println(response1.getTicket());
        IssueTicketResponse response2 =  ticketController.generateNewTicket(IssueTicketRequest.builder().vehicle(v3).gate(entryGate).parkingLotId(1).build());
        System.out.println(response2.getTicket());
        IssueTicketResponse response3 =  ticketController.generateNewTicket(IssueTicketRequest.builder().vehicle(v4).gate(entryGate).parkingLotId(1).build());
        System.out.println(response3.getTicket());
        PaymentService paymentService = new PaymentService();
        PaymentController paymentController = new PaymentController(paymentService);
        Payment payment1 =  paymentController.makePayment(PaymentMode.UPI,response3.getTicket());
        InvoiceService invoiceService= new InvoiceService();
        InvoiceController invoiceController = new InvoiceController(invoiceService);
        Invoice inv1 =  invoiceController.generateInvoice(InvoiceControllerRequest.builder().payment(payment1).exitGate(exitGate).build());
        System.out.println(inv1.getExitGate());
        IssueTicketResponse response4 =  ticketController.generateNewTicket(IssueTicketRequest.builder().vehicle(v5).gate(entryGate).parkingLotId(1).build());
        System.out.println(response4.getTicket());
        IssueTicketResponse response5 =  ticketController.generateNewTicket(IssueTicketRequest.builder().vehicle(v5).gate(entryGate).parkingLotId(1).build());
        System.out.println(response5.getTicket());







    }
}