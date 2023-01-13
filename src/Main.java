import java.util.*;

public class Main {
    public static void main(String[] args) {
        filterSelection(createCriterion());
    }

    private static Set<Object> createLaptopSet() {
        Laptop laptop = new Laptop("HP", "11R12L", 4, 250, "Windows 7", "Black");
        Laptop laptop1 = new Laptop("Lenovo", "8ЕЕ64V", 8, 150, "Windows 10", "Black");
        Laptop laptop2 = new Laptop("Acer", "A241W", 8, 250, "Windows 11", "White");
        Laptop laptop3 = new Laptop("Asus", "236U", 6, 500, "Windows 10", "Gray");
        Laptop laptop4 = new Laptop("DELL", "526Lite", 4, 200, "Windows 7", "Black");
        Laptop laptop5 = new Laptop("DELL", "813SE", 16, 500, "Windows 11", "White");
        Laptop laptop6 = new Laptop("Acer", "A26EW", 16, 250, "Windows 10", "Gray");
        Laptop laptop7 = new Laptop("MSI", "GF63", 16, 500, "Windows 11", "Black");

        Set<Object> setLaptop = new HashSet<>();
        setLaptop.add(laptop);
        setLaptop.add(laptop1);
        setLaptop.add(laptop2);
        setLaptop.add(laptop3);
        setLaptop.add(laptop4);
        setLaptop.add(laptop5);
        setLaptop.add(laptop6);
        setLaptop.add(laptop7);

        return setLaptop;
    }
    private static int createCriterion(){
        Map<Integer, String> criterion = new HashMap<>();
        criterion.put(1, "ОЗУ");
        criterion.put(2, "Объем SSD");
        criterion.put(3, "Операционная система");
        criterion.put(4, "Цвет");

        System.out.println("Параметры для фильтрации ноутбуков: " + "\n" + criterion);
        System.out.print("Введите выбранное значение: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static void filterSelection(int selectedCriterion){
        if (selectedCriterion == 1){
            filter1(createLaptopSet());
        }
        else if (selectedCriterion == 2){
            filter2(createLaptopSet());
        }
        else if (selectedCriterion == 3){
            filter3(createLaptopSet());
        }
        else if (selectedCriterion == 4){
            filter4(createLaptopSet());
        }
        else System.out.println("Введено несуществующее значение");
    }
    private static void filter1(Set<Object> setLaptop) {
        System.out.print("Введите необходимый объем ОЗУ (4, 6, 8, 16): ");
        Scanner scanner1 = new Scanner(System.in);
        int size1 = scanner1.nextInt();
        String sizeRam = "ram=" + size1;
        for (var item : setLaptop) {
            String laptop = item.toString();
            if (laptop.contains(sizeRam)) {
                System.out.println(item);
            }
        }
    }
    private static void filter2(Set<Object> setLaptop){
        System.out.print("Введите необходимый объем ЖД (150, 200, 250, 500): ");
        Scanner scanner2 = new Scanner(System.in);
        int size2 = scanner2.nextInt();
        String sizeSsd = "ssd=" + size2;
        for (var item : setLaptop) {
            String laptop = item.toString();
            if (laptop.contains(sizeSsd)){
                System.out.println(item);
            }
        }
    }
    private static void filter3(Set<Object> setLaptop){
        System.out.println("""
                1 - Windows 7
                2 - Windows 8
                3 - Windows 11""");
        System.out.print("Введите выбранную ОС: ");
        Scanner scanner3 = new Scanner(System.in);
        int selectedOs = scanner3.nextInt();
        String os = null;
        if (selectedOs == 1) {
            os = "Windows 7";
        } else if (selectedOs == 2) {
            os = "Windows 10";
        } else if (selectedOs == 3) {
            os = "Windows 11";
        }
        else System.out.println("Введено несуществующее значение");
        for (var item : setLaptop) {
            String laptop = item.toString();
            assert os != null;
            if (laptop.contains(os)){
                System.out.println(item);
            }
        }
    }
    private static void filter4(Set<Object> setLaptop){
        System.out.println("""
                1 - Black
                2 - White
                3 - Gray""");
        System.out.println("Введите значение выбранного цвета: ");
        Scanner scanner3 = new Scanner(System.in);
        int selectedColor = scanner3.nextInt();
        String color = null;
        if (selectedColor == 1) {
            color = "Black";
        } else if (selectedColor == 2) {
            color = "White";
        } else if (selectedColor == 3) {
            color = "Gray";
        }
        else System.out.println("Введено несуществующее значение");
        for (var item : setLaptop) {
            String laptop = item.toString();
            assert color != null;
            if (laptop.contains(color)){
                System.out.println(item);
            }
        }
    }
}