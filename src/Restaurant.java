public class Restaurant {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.printMenu();


        String[] names = menu.getMainDishesNames();

        MainDish newBeef = menu.getBeef();
    }
}
