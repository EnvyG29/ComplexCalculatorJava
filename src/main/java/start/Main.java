package start;
public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Калькулятор комплексных чисел(beta).
                Как пользоваться
                Выберите одну из доступных команд
                a -> addition(сложение)
                s -> subtraction(вычитание)
                m -> multiplication(умножение)
                d -> division(деление)
                stop -> завершить программу
              
                Комплексные числа можно вводить в формате
                7.0+3.0i
                7.0-3.0i
                -7.0+3.0i
                -7-3.0i
                7.0+3i
                7+3.0i
                7+3i
                -7.0
                3.0i
                7
                -3i
                В случае ввода числа в ином виде программа может его не принять, или произвести неверный расчет""");

        ClientCode code = new ClientCode();
        code.start();
    }
}