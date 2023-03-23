import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        int num3 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,num3,operation);
        System.out.println("Результат операции: "+result);
    }

    public static int getInt(){
        System.out.println("Введи число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Ошибка при вводе числа. Попробуй еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введи операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка при вводе операции. Попробуй еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, int num3, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2+num3;
                break;
            case '-':
                result = num1-num2-num3;
                break;
            case '*':
                result = num1*num2*num3;
                break;
            case '/':
                result = num1/num2/num3;
                break;
            default:
                System.out.println("Операция не распознана. Повтори ввод.");
                result = calc(num1, num2, num3, getOperation());//рекурсия
        }
        return result;
    }
}//
