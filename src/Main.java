
import java.lang.module.FindException;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.min;
import static java.lang.Integer.sum;
import static java.lang.Math.max;
import java.lang.reflect.Array;
import java.util.*;
import java.util.zip.CheckedOutputStream;

public class Main {
    static boolean continueExecution = true;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        while (continueExecution) {
            //Task roster
            int numberOfTask = taskRoaster();
            switch (numberOfTask) {
                case 1: {
                    //Task1
                    task1();
                    break;
                }
                case 2: {
                    //Task2
                    task2();
                    break;
                }
                case 3: {
                    //Task3
                    task3();
                    break;
                }
                case 4: {
                    //Task4
                    task4();
                    break;
                }
                case 5: {
                    //Task5
                    task5();
                    break;
                }
                case 6: {
                  //Task6
                    task6();
                   break;
                }
                case 7: {
                    //Task7
                    task7();
                    break;
               }
                case 8: {
                    //Task8
                    task8();
                    break;
                }
                case 9: {
                    //Task9
                    task9();
                    break;
                }

                case 10: {
                    //Task10
                   task10();
                    break;
                }
                default:
                    System.out.println("Выберите задание!");
                    break;
            }
            nextTaskQuestion();
        }


    }

    public static int taskRoaster() {
        System.out.print("Выберите задание для проверки: ");
        return scanner.nextInt();
    }

    public static void nextTaskQuestion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Хотите проверить другую задачу?  Да/Нет: ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("да")) {
            continueExecution = true;
        } else if (choice.equalsIgnoreCase("нет")) {
            scanner.close();
            continueExecution = false;
        }
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);

// Ввод строки текста
        System.out.println("Введите строку текста:");
        String inputString = scanner.nextLine();

// Ввод символа
        System.out.println("Введите символ для поиска:");
        char searchChar = scanner.next().charAt(0);

// Поиск символа в строке
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                System.out.println("Совпадение найдено в позиции " + i);
                count++;
            }
        }

// Вывод количества совпадений
        if (count == 0) {
            System.out.println("Совпадений не найдено.");
        } else {
            System.out.println("Общее количество совпадений: " + count);
        }
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);

// Ввод числа n
        System.out.println("Введите номер позиции (n): ");
        int n = scanner.nextInt();

        // Создание строки, содержащей все целые числа
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 1000; i++) {
            sb.append(String.valueOf(i));
            if (sb.length() >= 1000) {
                break;
            }
        }

// В случае если введенная позиция превышает длину строки, выводим сообщение
        if (n > sb.length()) {
            System.out.println("Введенная позиция превышает длину строки.");
        } else {
            char bukva = sb.charAt(n - 1);
            System.out.println("Цифра на " + n + "-й позиции: " + bukva);
        }
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);

// Ввод предложения
        System.out.println("Введите предложение: ");
        String input = scanner.nextLine();

// Подсчет средней длины слова
        String[] words = input.split(" ");
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        double averageLength = (double) totalLength / words.length;

// Вывод результата
        System.out.println("Средняя длина слова: " + averageLength);
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);

// Ввод строки
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();

// Нахождение слов, удовлетворяющих условию
        String[] words = input.split(" ");
        for (String word : words) {
            if (word.matches("^[AEIOUYaeiouy].*[BCDFGHJKLMNPQRSTVWXZbcdfghjklmnpqrstvwxz]$")) {
                System.out.println(word);
            }
        }
    }

    public static void task5() {
        Scanner scanner = new Scanner(System.in);

// Ввод строки
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();

// Разбиение строки на слова
        String[] words = input.split("\\s+|:"); // Разделителями являются пробелы и двоеточия

// Подсчет слов с четным количеством букв
        int evenLengthWordsCount = 0;
        for (String word : words) {
            if (word.length() % 2 == 0) {
                evenLengthWordsCount++;
            }
        }
        System.out.println("Количество слов с четным количеством букв: " + evenLengthWordsCount);
    }

    public static void task6() {
        int excludeCount = 0;
        for (int i = 0; i < 100000; i++) {
            String number = String.format("%05d", i); // Преобразование номера в строку с заполнением нулями
            if (number.contains("4") || number.contains("13")) { // Проверка на наличие 4 или 13 в номере
                excludeCount++;
            }
        }
        System.out.println("Необходимо исключить " + excludeCount + " номеров.");
    }

    public static void task7() {
    }

    public static void task8() {
    }

    public static void task9() {
    }

    public static void task10() {
        Scanner s = new Scanner(System.in);

        System.out.print("Введите строку (максимальная длина – 50 символов): ");
        String inputString = s.nextLine();

        if (inputString.length() > 50) {
            System.out.println("Превышена максимальная длина строки.");
            return;
        }

        int len = inputString.length();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(inputString.charAt(j) + " ");
            }
            System.out.println();
        }
        for (int i = len - 2; i >= 0; i--) {
            for (int j = 0; j < len - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(inputString.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}

