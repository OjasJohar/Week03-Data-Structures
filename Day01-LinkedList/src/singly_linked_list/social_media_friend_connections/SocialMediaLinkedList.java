package singly_linked_list.social_media_friend_connections;

import java.util.List;
import java.util.ArrayList;

public class SocialMediaLinkedList {
    private UserNode head;

    //method to add user at end
    public void addUser(int userID, String userName, int age){
        UserNode newNode=new UserNode(userID,userName,age);
        if(head==null){
            //newNode=head;
            head=newNode;
            return;
        }
        UserNode temp=head;
        while(temp.next!=null){
            //reaching end node.
            temp=temp.next;
        }
        //joining new node at end.
        temp.next=newNode;
    }

    //method to find user by userId
    public UserNode findByUserId(int userID){
        UserNode temp=head;
        while(temp!=null){
            if(temp.userID==userID){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    //method to add a friend connection between two users
    public void addFriendConnections(int userId1, int userId2){
        UserNode user1=findByUserId(userId1);
        UserNode user2=findByUserId(userId2);

        if(user1!=null && user2!=null){
            if(!user1.friendIds.contains(userId2)){
                user1.friendIds.add(userId2);
            }
            if(!user2.friendIds.contains(userId1)) {
                user2.friendIds.add(userId1);
            }
        }else{
            System.out.println("User not found.");
        }
    }

    //method to remove a friend connection.
    public void removeFriendConnection(int userId1, int userId2){
        UserNode user1=findByUserId(userId1);
        UserNode user2=findByUserId(userId2);

        if(user1!=null && user2!=null){
            if(user1.friendIds.contains(userId2)){
                user1.friendIds.remove((Integer)userId2);
            }
            if(user2.friendIds.contains(userId1)) {
                user2.friendIds.remove((Integer)userId1);
            }
        }else{
            System.out.println("User not found.");
        }
    }

    //method to find mutual friends between two users.
    public List<Integer> findMutualFriends(int userId1, int userId2){
        List<Integer> mutualFriends=new ArrayList<>();
        UserNode user1=findByUserId(userId1);
        UserNode user2=findByUserId(userId2);

        if(user1!=null && user2!=null){
            for(int mutualFriendId: user1.friendIds){
                if(user2.friendIds.contains(mutualFriendId)){
                    mutualFriends.add(mutualFriendId);
                }
            }
        }
        return mutualFriends;
    }

    //method to display all friends of a specific user.
    public void displayFriends(int userId){
        UserNode user1=findByUserId(userId);
        if(user1!=null){
            int count=user1.friendIds.size();
            System.out.println("Friends of " + user1.userName + " are:");
            for(int i=0;i<count;i++){
                UserNode user2=findByUserId(user1.friendIds.get(i));
                System.out.println(user2.userName);
            }
        }else{
            System.out.println("User not found.");
        }
    }

    //method to search for a user by User ID.
    public void searchUserById(int userID){
        UserNode temp=head;
        while(temp!=null){
            if(temp.userID==userID){
                System.out.println("User Found: user name = " + temp.userName + ", user id = " + temp.userID + " age = "
                        + temp.age);
                return;
            }
            temp=temp.next;
        }
        System.out.println("User with id " + userID + " not found.");
    }

    //method to search for a user by Name.
    public void searchUserByName(String userName){
        UserNode temp=head;
        while(temp!=null){
            if(temp.userName.equals(userName)){
                System.out.println("User Found: user name = " + temp.userName + ", user id = " + temp.userID + " age = "
                        + temp.age);
                return;
            }
            temp=temp.next;
        }
        System.out.println("User with name " + userName + " not found.");
    }

    //method to count the number of friends for each user
    public void countFriends(){
        UserNode temp=head;
        while(temp!=null){
            System.out.println(temp.userName + " has " + temp.friendIds.size() + " friends.");
            temp=temp.next;
        }
    }
}