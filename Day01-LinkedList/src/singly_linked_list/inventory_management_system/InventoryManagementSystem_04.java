package singly_linked_list.inventory_management_system;

public class InventoryManagementSystem_04 {

    public static void main(String[] args){
        //Calling methods:
        ItemLinkedList list=new ItemLinkedList();
        list.addAtStart("Sugar packet", "S11", 2, 120);
        list.addAtStart("Wheat packet", "W07", 1, 220);
        list.addAtEnd("Soap", "S28", 5, 60);
        list.addAtSpecific(1,"Salt packet", "S35", 3, 87);

        list.displayTotalValue();

        list.deleteByItemID("S28");
        list.displayTotalValue();

        list.updateQuantity("W07", 5);
        list.searchRecord("Sugar packet");
        list.displayTotalValue();

        list.sortInventory("price");
        list.displayTotalValue();
    }
}
