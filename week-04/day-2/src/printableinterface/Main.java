package printableinterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Domino domino = new Domino();
        Todo todo = new Todo();
        List<Domino> dominos = new ArrayList<>();
        List<Todo> todos = new ArrayList<>();
        todos.add(todo);
        dominos.add(domino);

        for (Domino d :dominos) {
            d.printAllFields();
        }
        for (Todo t : todos) {
            t.printAllFields();
        }
    }
}
