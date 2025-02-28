

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // medianTaskLeetCode();
        // reverseInteger();
        //stringToInteger();
        // palindromeNumber();
        // matrixTask();
//        Scanner scanner = new Scanner(System.in);
//        String value = scanner.next();
//        String deyer = scanner.next();
//        boolean tru = regularExpression(value, deyer);
//        System.out.println(tru);
//        //linkedListTask();
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        Integer number = 0;
//        Integer secondNumber = 0;
//        double result = 0;
//        while (true) {
//            int randomNumber = random.nextInt(0, 4);
//            for (int i = 0; i < 1; i++) {
//                number = scanner.nextInt();
//                System.out.println("Enter first number :" + number);
//                secondNumber = scanner.nextInt();
//                System.out.println("Enter second number : " + secondNumber);
//            }
//            for (int i = 0; i < Operator.values().length; i++) {
//                if (i == randomNumber) {
//                    Operator simvol = Operator.values()[i];
//                    System.out.println(simvol);
//                    result = Operator.operatorProcess(number, secondNumber, simvol);
//                }
//            }
//            System.out.println(result);
//
//        }
        int[] array = {1, 2, 3, 4, 5};
        int counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 4) {
                continue;
            }
            array[counter++] = array[i];
        }
        for (int i = 0; i < array.length ; i++) {
            
        }
    }

    public static void medianTaskLeetCode() {
        //ededin medianini tapilamsi
        int[] num1 = {4, 2, 10}; //1 ,2,2,4,5,7,8,10
        int[] num2 = {1, 7, 2, 5, 8};
        int[] num3 = new int[num1.length + num2.length];
        int counter = 0;
        int number;
        int tempt;
        for (int i = 0; i < num1.length; i++) {
            a:
            for (int j = 0; j < num2.length; j++) {
                for (int k = 0; k < num2.length; k++) {
                    for (int m = k + 1; m < num2.length; m++) {
                        if (num2[k] > num2[m]) {
                            tempt = num2[k];
                            num2[k] = num2[m];
                            num2[m] = tempt;
                            break;
                        }
                    }
                }
                if (num1[i] > num2[j]) {
                    number = num1[i];
                    num1[i] = num2[j];
                    num2[j] = number;
                    num3[counter] = num1[i];
                    counter++;
                    break;
                }
                for (int s = 0; s < num2.length; s++) {
                    if (num1[i] < num2[s]) {
                        for (int t = 0; t < num3.length; t++) {
                            if (num1[i] != num3[t]) {
                                num3[counter] = num1[i];
                                counter++;
                                break a;
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num3.length; j++) {
                if (num2[i] != num3[j] && j == num3.length - 1) {
                    num3[counter] = num2[i];
                    counter++;
                }
                a:
                for (int k = 0; k < num2.length; k++) {
                    for (int m = k + 1; m < num2.length; m++) {
                        if (num2[k] > num2[m]) {
                            tempt = num2[k];
                            num2[k] = num2[m];
                            num2[m] = tempt;
                            break a;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(num3));
        double temp = 0;
        double count = 0;
        if (num3.length % 2 == 1) {
            for (int i = 0; i <= num3.length / 2; i++) {
                if (i == num3.length / 2) {
                    System.out.println(num3[i]);
                }
            }
        } else {
            for (int i = 0; i <= num3.length / 2; i++) {
                if (i == (num3.length / 2) - 1) {
                    temp = num3[i];
                } else if (i == num3.length / 2) {
                    count = num3[i];
                }
            }
            System.out.println((temp + count) / 2);
        }
    }

    public static void reverseInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  number :");
        int number = scanner.nextInt(); // 123
        String sameNumber = Integer.toString(number);
        int num = number;
        int tempt = 1;
        for (int i = 0; i < sameNumber.length() - 1; i++) {
            tempt *= 10;
        }
        List<Integer> list = new ArrayList<>();
        while (number != 0) {
            number %= 10;
            list.add(number);
            num /= 10;
            number = num;
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count += list.get(i) * tempt;
            tempt /= 10;
        }
        System.out.println(count);
    }

    public static void stringToInteger() {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next(); // 42
        char[] arr = new char[number.length()];
        for (int i = 0; i < number.length(); i++) {
            char[] charArray = number.toCharArray();
            arr[i] = charArray[i];
        }
        int tempt = 1;
        for (int i = 0; i < number.length() - 1; i++) {
            tempt *= 10;
        }
        List<Character> list = new ArrayList<>();
        list.add('0');
        list.add('1');
        list.add('2');
        list.add('3');
        list.add('4');
        list.add('5');
        list.add('6');
        list.add('7');
        list.add('8');
        list.add('9');
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == arr[i] && list.get(j) != '0') {
                    char digitChar = list.get(j);
                    int digitValue = digitChar - '0';
                    counter += digitValue * tempt;
                    tempt /= 10;
                }
            }
        }
        System.out.println(counter);
    }

    public static void palindromeNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int temp = number;
        String tempString = Integer.toString(temp);
        int[] arr = new int[tempString.length()];
        int counter = 0;
        while (number != 0) {
            number %= 10;
            arr[counter++] = number;
            temp /= 10;
            number = temp;
        }
        boolean check = false;
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = arr.length - 1; j >= arr.length / 2; j--) {
                if (arr[i] == arr[j]) {
                    check = true;
                }
                ;
            }
        }
        if (check) {
            System.out.println("this number is polindrome");
        } else System.out.println("This number is not polindrome");
    }

    public static void matrixTask() {
        Random random = new Random();
        int[][] array = new int[3][3];
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp++;
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(9);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        int[] arr = new int[temp];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    arr[i] = array[i][j];
                }
            }
        }
        int[] number = new int[temp];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) == array[i].length - 1) {
                    number[i] = array[i][j];
                }
            }
        }
        int counter;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (i == j) {
                    counter = arr[i];
                    arr[i] = number[j];
                    number[j] = counter;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = arr[i];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) == array[i].length - 1) {
                    array[i][j] = number[i];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean regularExpression(String s, String p) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Character> map = new HashMap<>();
        map.put(0, '*');
        map.put(1, '.');
        for (int i = 0; i < s.length(); i++) {
            char[] arr = p.toCharArray();
            for (int j = 0; j < p.length(); j++) {
                if (s.length() == p.length()) {
                    for (int k = 0; k < p.length(); k++) {
                        if (map.get(j) == arr[k]) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            }
        }
        return false;
    }


    public static void linkedListTask() {


    }


}





