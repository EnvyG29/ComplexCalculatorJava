package start;

import start.math087.Math087;
import start.number.CheckNumber;
import start.number.ComplexNumber;

public class ClientCode extends Input {
    public void start() {
        Commands com;
        while (true) {
            String command = input("Введите команду: ");
            try {
                com = Commands.valueOf(command.toLowerCase());
                if (com == Commands.stop) return;
                switch (com) {
                    case a -> addition();
                    case s -> subtraction();
                    case m -> multiplication();
                    case d -> division();

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void addition()throws Exception{
        Math087 math087 = new Math087();
        System.out.println(math087.addition(getNumber("Введите число A "), getNumber("Введите число B ")));
    }

    private void subtraction() throws Exception{
        Math087 math087 = new Math087();
        System.out.println(math087.subtraction(getNumber("Введите число A "), getNumber("Введите число B ")));
    }

    private void multiplication() throws Exception{
        Math087 math087 = new Math087();
        System.out.println(math087.multiplication(getNumber("Введите число A "), getNumber("Введите число B ")));
    }

    private void division() throws Exception{
        Math087 math087 = new Math087();
        System.out.println(math087.division(getNumber("Введите число A "), getNumber("Введите число B ")));
    }


    private ComplexNumber getNumber(String message)throws Exception{
        String numberA = input(message);
        double[] nums = new CheckNumber().checkNumber(numberA);
        return new ComplexNumber(nums[0],nums[1]);
    }
}
