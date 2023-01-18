import java.util.Stack;

public class ChoiceSave {
    static void choice_operation(Stack<Integer> savebook, Integer x) throws Exception {
        System.out.println("Сохранить или удалить информацию об операции?: 1) Сохранить 2) Удалить");
        int choice = getInt();
        if (choice == 1) {
            save_operation(savebook, x);
        }
        if (choice == 2) {
            del_operation(savebook, x);
        }
    }
}
