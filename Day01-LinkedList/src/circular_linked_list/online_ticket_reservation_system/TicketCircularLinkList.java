package circular_linked_list.online_ticket_reservation_system;

public class TicketCircularLinkList {
    private Ticket head,tail;

    TicketCircularLinkList(){
        this.head=null;
        this.tail=null;
    }

    //1.method to add a new Ticket node in circular link list
    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime){
        Ticket newNode=new Ticket(ticketID,customerName,movieName,seatNumber,bookingTime);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.next=head;
        tail=newNode;
    }

    //2.method to remove a ticket
    public void removeTicket(int ticketID) {
        if (head == null) return;
        Ticket current = head, prev = null;
        do {
            if (current.ticketID == ticketID) {
                if (current == head) {
                    tail.next = head.next;
                    head = head.next;
                } else if (current == tail) {
                    prev.next = head;
                    tail = prev;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    //3.method to display the tickets in the list
    public void displayTickets(){
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Ticket current = head;
        System.out.println("Booked Tickets:");
        do {
            System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName + ", Movie: " +
                    current.movieName + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    //4.method to search ticket by customer name or movie name
    public void searchTicket(String searchKey) {
        if (head == null) return;
        Ticket current = head;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(searchKey) || current.movieName.equalsIgnoreCase(searchKey)) {
                System.out.println("Ticket Found - ID: " + current.ticketID + ", Customer: " + current.customerName +
                        ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);
        if (!found) {
            System.out.println("No tickets found for the given search key.");
        }
    }

    //5.method to count total tickets
    public int totalTickets() {
        if (head == null) return 0;
        int count = 0;
        Ticket current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }

}
