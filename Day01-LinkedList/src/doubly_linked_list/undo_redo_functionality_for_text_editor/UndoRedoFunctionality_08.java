package doubly_linked_list.undo_redo_functionality_for_text_editor;

public class UndoRedoFunctionality_08 {

    public static void main(String[] args){
        TextEditor editor = new TextEditor(5);

        editor.addState("State 1: Hello");
        editor.addState("State 2: Hello, World");
        editor.addState("State 3: Hello, World!");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("State 4: Hello, World Again!");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();
        editor.addState("State 4: Hello, World Again!!");
        editor.addState("State 4: Hello, World Again!!!");
        editor.addState("State 4: Hello, World Again!!!!");
        editor.undo();
        editor.addState("State 4: Hello, World Again!!!!!");
        editor.displayCurrentState();
        editor.undo();
        editor.undo();
    }
}
