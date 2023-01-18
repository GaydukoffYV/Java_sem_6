import java.util.Scanner;
import java.util.Stack;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public sealed class Save extends ChoiceSave, SaveSave, DelSave permits View, calc {
    @Override
     static void static void save_operation(Stack<Integer> savebook, Integer x) {

    }
    @Override
    static void choice_operation(Stack<Integer> savebook, Integer x) throws Exception {

    }
    @Override
    static void del_operation(Stack<Integer> savebook, Integer x){

    }


      static Scanner scanner = new Scanner(System.in);
    private static final Logger logger = Logger. getLogger(calc.class.getName());
    public static void main(String[] args) throws Exception {
        Handler fileHandler = new FileHandler("log main1.xml", true);
        logger.setUseParentHandlers(false);
        logger.addHandler(fileHandler);
        int choice = 0;
        Stack<Integer> savebook = new Stack<>();
        for (; choice != 1; ) {
            int num1 = getInt();
            int num2 = getInt();
            System.out.println("Enter operation: " + System.lineSeparator());
            char operation = getOperation();
            float result = calculator(num1, num2, operation);
            System.out.println("Result of operation: " + result);
            int x = (int) result;
            System.out.println("Stec: " + savebook);
            Save(savebook, x);
            System.out.println("Выйти из программы?: 1) Да, 2) Нет");
            choice = getInt();
        }

    }}







