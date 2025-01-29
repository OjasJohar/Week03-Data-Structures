package singly_linked_list.inventory_management_system;

public class ItemNode {
    String itemName;
    String itemID;
    int quantity;
    int price;
    ItemNode next;

    //Imagine it as a node that carries below-mentioned attributes.
    public ItemNode(String itemName, String itemID, int quantity, int price){
        this.itemName=itemName;
        this.itemID=itemID;
        this.quantity=quantity;
        this.price=price;
        this.next=null;//Meaning it is not pointing to anyone.
    }
}
