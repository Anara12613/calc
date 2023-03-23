import java.util.Scanner;
public  class calc {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String vvod = Scanner.nextLine();
        System.out.print("Результат выражения: " + vvod);
         String  operStr= " ";
         char[] symbol = new char[10];
         char oper = '+';
         for (int i=1; i < vvod.length(); i++) {
             symbol[i] = vvod.charAt(i);
             if ( symbol[i] == '+'){
                 oper = '+'; operStr = "\\+";
             }
             if ( symbol[i] == '-') {
                 oper = '-';
                 operStr = "-";
             }
             if ( symbol[i] == '*') {
                 oper = '*';
                 operStr = "\\*";
             }
             if ( symbol[i] == '/') {
                 oper = '/';
                 operStr = "/";
             }
         }
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int result =calculate(num1, num2, num3, oper);
        String[] numbers = vvod.split(operStr);
        if (numbers.length > 3) {
            System.out.println("=? \nЧто-то пошло не так...\nКалькулятор считает только 3 переменные! Попробуйте снова.");
            System.exit(0);
        }
            num1 = Integer.parseInt((numbers[0]));
            num2 = Integer.parseInt((numbers[1]));
            num3 = Integer.parseInt((numbers[0]));
             if (num1 == 0 | num2 == 0 | num3 == 0) {
                 try {
                     num1 = Integer.parseInt(numbers[0]);
                     num2 = Integer.parseInt(numbers[1]);
                     num3 = Integer.parseInt(numbers[0]);
                         if (num1 > 10 | num2 > 10 | num1 < 0 | num2 <0 | num3 < 0 | num3 > 10) {
                             System.out.println("=? \nКалькулятор умеет работать только с целыми цифрами от 1 до 10 одновременно! Попробуйте снова.");
                             System.exit(0);
                         }
                         else {
                             try {
                                 result = calculate(num1, num2, num3, oper);
                             }
                             finally {
                                 System.out.println("Результат операции: "+result);
                             }
                             }
                                      }finally {
                     System.out.println("Результат операции: "+result);}
                 }
             }
        public static int calculate(int x1, int x2,int x3, char op) {
        int result = 0;
            switch (op) {
            case '+':
                result = x1 + x2 + x3;
                break;
            case '-':
                result = x1 - x2 - x3;
                break;
            case '*':
                result = x1 * x2 - x3;
                break;
            default:
                break;
        }
        return result;
    }
        }