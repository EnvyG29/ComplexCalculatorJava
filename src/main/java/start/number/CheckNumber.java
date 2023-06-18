package start.number;

public class CheckNumber {
    public double[] checkNumber(String number) throws Exception {
        double[] result = new double[2];
        if (number.contains("+") && number.endsWith("i")) { // 7+7i  -7+5i
            String[] n = number.split("\\+");
            result[0] = Double.parseDouble(n[0]);
            result[1] = Double.parseDouble(n[1].replace("i", ""));
        } else if (number.contains("-") && number.endsWith("i")) {
            if (countChars(number, '-') == 2) {
                number = number.replaceFirst("-", "");
                String[] n = number.split("-");
                result[0] = -Double.parseDouble(n[0]);
                result[1] = -Double.parseDouble(n[1].replace("i", ""));
            } else if (isFirstNumber(number)) {
                String[] n = number.split("-");
                result[0] = Double.parseDouble(n[0]);
                result[1] = Double.parseDouble(n[1].replace("i", ""));
            } else {
                result[1] = Double.parseDouble(number.replace("i", ""));
            }
        } else if (!(number.endsWith("i"))) {
            result[0] = Double.parseDouble(number.replace("i", ""));
        } else if (number.endsWith("i")) {
            result[1] = Double.parseDouble(number.replace("i", ""));
        } else {
            throw new Exception("Число введено не по образцу");
        }
        return result;
    }

    public static boolean isFirstNumber(String str) {
        char firstChar = str.charAt(0);
        return Character.isDigit(firstChar);
    }

    public static int countChars(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
