package circular_linked_list.online_ticket_reservation_system;

public class OnlineTicketReservation_09 {
    public static void main(String[] args) {
        TicketCircularLinkList ticketSystem = new TicketCircularLinkList();
        ticketSystem.addTicket(101, "Anush", "Inception", "A1", "10:00 AM");
        ticketSystem.addTicket(102, "Om", "Avatar", "B2", "12:00 PM");
        ticketSystem.addTicket(103, "Ojas", "Inception", "A2", "10:00 AM");
        ticketSystem.addTicket(104, "Sejal", "Tiger", "C2", "10:00 AM");

        ticketSystem.displayTickets();

        ticketSystem.searchTicket("Inception");
        System.out.println("Total Tickets: " + ticketSystem.totalTickets());

        ticketSystem.removeTicket(102);
        ticketSystem.displayTickets();
    }
}
