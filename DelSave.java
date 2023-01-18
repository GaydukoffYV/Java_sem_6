import java.util.Stack;

public class DelSave {
    static void del_operation(Stack<Integer> savebook, Integer x) {
        System.out.print("В очередь");
        x = (Integer) savebook.pop();
        System.out.println(x);
        System.out.println("Stek: " + savebook);
    }

}
