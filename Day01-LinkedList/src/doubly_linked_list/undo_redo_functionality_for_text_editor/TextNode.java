package doubly_linked_list.undo_redo_functionality_for_text_editor;

public class TextNode {
    String state;
    TextNode next,prev;

    public TextNode(String state){
        this.state=state;
        this.next=null;
        this.prev=null;
    }
}
