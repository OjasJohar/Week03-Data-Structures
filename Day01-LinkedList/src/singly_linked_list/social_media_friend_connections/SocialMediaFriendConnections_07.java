package singly_linked_list.social_media_friend_connections;

public class SocialMediaFriendConnections_07 {

    public static void main(String[] args){
        SocialMediaLinkedList list = new SocialMediaLinkedList();
        list.addUser(1,"Anush Tenguriya",21);
        list.addUser(2,"Ojas Johar",21);
        list.addUser(3,"Om Tamrakar",21);
        list.addUser(4,"Sejal Chouhan",21);

        list.addFriendConnections(1,2);
        list.addFriendConnections(1,3);
        list.addFriendConnections(2,3);
        list.addFriendConnections(3,4);

        list.displayFriends(1);

        list.countFriends();

        System.out.println("Mutual friends between Anush and Om: " + list.findMutualFriends(1,3));

        list.removeFriendConnection(1,3);

        list.searchUserById(1);
        list.searchUserByName("Ojas Johar");
        list.displayFriends(1);
    }
}