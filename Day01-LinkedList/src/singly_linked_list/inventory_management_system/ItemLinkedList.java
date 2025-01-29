package singly_linked_list.inventory_management_system;

public class ItemLinkedList {
    //Creating head to work with node(ItemNode).
    ItemNode head;

    public void addAtStart(String itemName, String itemID, int quantity, int price){
        System.out.println("Adding Item");
        //(node) is the reference of object to create a node.
        ItemNode node=new ItemNode(itemName, itemID, quantity, price);
        //joining with existing node or null node.
        node.next=head;
        //then making itself the head.
        head=node;
    }

    public void addAtEnd(String itemName, String itemID, int quantity, int price){
        System.out.println("Adding Item");
        ItemNode node=new ItemNode(itemName, itemID, quantity, price);
        if(head==null){
            //because of null it works like addAtStart().
            node.next=head;
            head=node;
        }
        else{
            ItemNode temp=head;
            while(temp.next!=null){
                //reaching the end of nodes.
                temp=temp.next;
            }
            //Adding the new node after the last node(.next).
            temp.next=node;
        }
    }

    public void addAtSpecific(int position, String itemName, String itemID, int quantity, int price){
        System.out.println("Adding Item");
        ItemNode node=new ItemNode(itemName, itemID, quantity, price);
        if(position<0){
            System.out.println("Invalid input .");
            return;
        }
        if(position==0){
            addAtStart(itemName, itemID, quantity, price);
            return;
        }
        ItemNode temp=head;
        for(int i=0;temp!=null && i<position-1;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Out Of Range .");
            return;
        }
        //joining new node with the right side node first.
        node.next=temp.next;
        //then joining the current node with the new node.
        temp.next=node;

    }

    public void deleteByItemID(String itemID) {
        if (head == null) {
            System.out.println("List is empty .");
            return;
        }
        if (head.itemID.equals(itemID)) {
            head = head.next;
            System.out.println("Node with Item id " + itemID + " is deleted. ");
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) {
            if (temp.next.itemID.equals(itemID)) {
                System.out.println("Node with Item id " + itemID + " is deleted. ");
                //here we are deleting the node by standing at the node before it.
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
            }
            System.out.println("Node with Item id " + itemID + " not found. ");
    }

    public void searchRecord (String itemName){
        //Way to make temp.
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemName.equals(itemName)) {
                    System.out.println("Node with Item Name " + itemName + "found.");
                    return;
            }
            temp = temp.next;
        }
        System.out.println("Item is not present.");
    }

    public void displayTotalValue() {
        ItemNode temp = head;
        int sum=0;
        while (temp != null) {
            System.out.println("---Item Details---");
            System.out.println("Item ID  :"+temp.itemID);
            System.out.println("Item Name:"+temp.itemName);
            System.out.println("Price    :"+temp.price);
            System.out.println("Quantity :"+temp.quantity);
            sum += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total value of inventory : "+sum);
    }

    public void updateQuantity (String itemID,int quantity){
        //Way to make temp.
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemID.equals(itemID)) {
                System.out.println("Quantity of Item id " + itemID + " is " + temp.quantity);
                System.out.println("After the update...");
                System.out.println("\nUpgraded Quantity :" + quantity);
                temp.quantity = quantity;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Roll number is not present.");
    }

    // Sort the inventory by Item Name or Price
    public void sortInventory(String by) {
        head = mergeSort(head, by);
        System.out.println("Inventory sorted by " + (by.equals("name") ? "Item Name." : "Price."));
    }

    private ItemNode mergeSort(ItemNode head, String by) {
        if (head == null || head.next == null) {
            return head;
        }

        ItemNode mid = getMiddle(head);
        ItemNode nextOfMid = mid.next;
        mid.next = null;
        ItemNode left = mergeSort(head, by);
        ItemNode right = mergeSort(nextOfMid, by);

        return merge(left, right, by);
    }

    private ItemNode getMiddle(ItemNode head) {
        if (head == null) return head;
        ItemNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ItemNode merge(ItemNode left, ItemNode right, String by) {
        if (left == null) return right;
        if (right == null) return left;

        ItemNode result;
        if (by.equals("name")) {
            if (left.itemName.compareToIgnoreCase(right.itemName) <= 0) {
                result = left;
                result.next = merge(left.next, right, by);
            } else {
                result = right;
                result.next = merge(left, right.next, by);
            }
        } else {
            if (left.price <= right.price) {
                result = left;
                result.next = merge(left.next, right, by);
            } else {
                result = right;
                result.next = merge(left, right.next, by);
            }
        }
        return result;
    }
}
