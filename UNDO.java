package academy.learnprogramming;
import java.util.Stack;

public class UNDO {
    static Stack<Character> Undo = new Stack<Character>();

        static Stack<Character> Redo = new Stack<Character>();

    static void WRITE(Stack<Character> Undo, char X)
    {
        Undo.push(X);
    }

    static void UNDO(Stack<Character> Undo, Stack<Character> Redo) {
        Character X = (Character)Undo.peek();
        Undo.pop();
        Redo.push(X);
    }

    static void REDO(Stack<Character> Undo, Stack<Character> Redo) {
        Character X = (Character) Redo.peek();
        Redo.pop();
        Undo.push(X);
    }

    static void READ(Stack<Character> Undo) {
        Stack<Character> revOrder = new Stack<Character>();

        while (Undo.size() > 0) {
            revOrder.push(Undo.peek());
            Undo.pop();
        }

        while (revOrder.size() > 0) {
            System.out.print(revOrder.peek());
            Undo.push(revOrder.peek());
            revOrder.pop();
        }
        System.out.print(" ");
    }

    static void QUERY(String[] Q) {
        int N = Q.length;
        for (int i = 0; i < N; i++)
        {
            if(Q[i] == "UNDO")
            {
                UNDO(Undo, Redo);
            }
            else if(Q[i] == "REDO")
            {
                REDO(Undo, Redo);
            }
            else if(Q[i] == "READ")
            {
                READ(Undo);
            }
            else
            {
                WRITE(Undo, Q[i].charAt(6));
            }
        }
    }

    public static void main(String[] args) {
        String[] Q = { "WRITE V", "WRITE I", "WRITE C","WRITE K","WRITE Y", "UNDO", "READ", "REDO", "READ" };
        QUERY(Q);
    }
}


