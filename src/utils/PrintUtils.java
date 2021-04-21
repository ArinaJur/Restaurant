package utils;

import static utils.PrintUtils.CommonPrintMethods.*;

public class PrintUtils {
    private final static String LINE = "______________________________________________________________________";
    private final static String MAIN_DISHED_TITLE = "Our Best Main Dishes:";


    public static class CommonPrintMethods {

        public final static void print(String text) {
            System.out.print(text);
        }

        public final static void println() {
            System.out.println();
        }

        public static void printLine() {
            println();
            print(LINE);
        }
    }

    public static class PrintTitles {

        public static void printMenuTitle() {
            println();
            println();
            print("________________________ Take Out Menu __________________________");
            println();
            println();
        }

        public static void printMainDishesTitle() {
            print(MAIN_DISHED_TITLE);
            println();
            println();
        }

        public static void printSidesTitle() {
            print("Our Healthy Sides:");
            println();
            println();
        }

        public static void printDrinksTitle() {
            print("Drinks:");
            println();
            println();
        }

        public static void printPrice(double price) { //10.00   5.00
            if(price < 10) {
                print("$ " + price);
            } else {
                print("$" + price);
            }
        }
    }

    public static class PrintSpaces {

        private static int maxLength = 0;

        private static int maxLengthName(String[] names) {
            for (int i = 0; i < names.length; i ++) {
                if (names[i].length() > maxLength) {
                    maxLength = names[i].length();
                }
            }
            return maxLength;
        }

        public static int spacesAfterName(String[] names, String[] names1, String[] names2, String name) {
            maxLength = maxLengthName(names);
            int maxLength1 = maxLengthName(names1);
            int maxLength2 = maxLengthName(names2);

            if (maxLength < maxLength1) {
                maxLength = maxLength1;
            } else if (maxLength < maxLength2) {
                maxLength = maxLength2;
            }

            int count = maxLength - name.length();
            return count;
        }

        public static void printSpacesAfterName(int spacesCount) {
            for (int i = 0; i <= spacesCount; i ++) {
                print(" ");
            }
        }
    }
}
