package singly_linked_list.social_media_friend_connections;

import java.util.List;
import java.util.ArrayList;

public class UserNode {
    int userID;
    String userName;
    int age;
    UserNode next;
    List<Integer> friendIds;
    //list of friend ids.

    public UserNode(int userID, String userName, int age){
        this.userID=userID;
        this.userName=userName;
        this.age=age;
        this.friendIds = new ArrayList<>();
        this.next=null;
    }
}
