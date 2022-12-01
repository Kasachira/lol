package calculator;

import java.util.Scanner;

public class CalculatorDeno {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int x = scr.nextInt();
        String sign = scr.next();
        int y = scr.nextInt();
        String sign2 = scr.nextLine();

        if (x <= 10 && x > 0 && y <= 10 && y > 0) {
            switch (sign) {
                case "+":
                    if (sign2.equals("")) {
                        System.out.println(x + y);
                        break;
                    } else {
                        String Sign3 = sign2.substring(1, 2);
                        String a = sign2.substring(3);
                        Integer z = Integer.valueOf(a);
                        if (Sign3.equals("+") && z <= 10 && z > 0) {
                            System.out.println(x + y + z);
                            break;
                        } else if (Sign3.equals("-") && z <= 10 && z > 0) {
                            System.out.println(x + y - z);
                            break;
                        } else if (Sign3.equals("*") && z <= 10 && z > 0) {
                            System.out.println(x + y * z);
                            break;
                        } else if (Sign3.equals("/") && z <= 10 && z > 0) {
                            System.out.println(x + y / z);
                            break;
                        }

                    }

                case "-":
                    if (sign2.equals("")) {
                        System.out.println(x - y);
                        break;
                    } else {
                        String Sign3 = sign2.substring(1, 2);
                        String a = sign2.substring(3);
                        Integer z = Integer.valueOf(a);
                        if (Sign3.equals("+") && z <= 10 && z > 0) {
                            System.out.println(x - y + z);
                            break;
                        } else if (Sign3.equals("-") && z <= 10 && z > 0) {
                            System.out.println(x - y - z);
                            break;
                        } else if (Sign3.equals("*") && z <= 10 && z > 0) {
                            System.out.println(x - y * z);
                            break;
                        } else if (Sign3.equals("/") && z <= 10 && z > 0) {
                            System.out.println(x - y / z);
                            break;
                        }
                    }

                case "*":
                    if (sign2.equals("")) {
                        System.out.println(x * y);
                        break;
                    } else {
                        String Sign3 = sign2.substring(1, 2);
                        String a = sign2.substring(3);
                        Integer z = Integer.valueOf(a);
                        if (Sign3.equals("+") && z <= 10 && z > 0) {
                            System.out.println(x * y + z);
                            break;
                        } else if (Sign3.equals("-") && z <= 10 && z > 0) {
                            System.out.println(x * y - z);
                            break;
                        } else if (Sign3.equals("*") && z <= 10 && z > 0) {
                            System.out.println(x * y * z);
                            break;
                        } else if (Sign3.equals("/") && z <= 10 && z > 0) {
                            System.out.println(x * y / z);
                            break;
                        }
                    }
                case "/":
                    if (sign2.equals("")) {
                        System.out.println(x / y);
                        break;
                    } else {
                        String Sign3 = sign2.substring(1, 2);
                        String a = sign2.substring(3);
                        Integer z = Integer.valueOf(a);
                        if (Sign3.equals("+") && z <= 10 && z > 0) {
                            System.out.println(x / y + z);
                            break;
                        } else if (Sign3.equals("-") && z <= 10 && z > 0) {
                            System.out.println(x / y - z);
                            break;
                        } else if (Sign3.equals("*") && z <= 10 && z > 0) {
                            System.out.println(x / y * z);
                            break;
                        } else if (Sign3.equals("/") && z <= 10 && z > 0) {
                            System.out.println(x / y / z);
                            break;
                        }
                    }

                default:
                    System.out.println("error");
                    break;
            }
        }
    }

}



