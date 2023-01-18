import java.util.Stack;

public class SaveSave {
    static void save_operation(Stack<Integer> savebook, Integer x) {
        savebook.push(x);
        System.out.println("Поместить (" + x + ")");
        System.out.println("Stek: " + savebook);
    }
}

}
