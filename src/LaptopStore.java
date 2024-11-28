import java.util.*;

public class LaptopStore {
    public static void main(String[] args) {
        HashSet<Laptop> Laptop = new HashSet<>();
        Laptop.add(new Laptop(250, 8, "Windows10", "black"));
        Laptop.add(new Laptop(500, 32, "Windows11", "black"));
        Laptop.add(new Laptop(250, 64, "Windows11", "silver"));
        Laptop.add(new Laptop(500, 16, "Windows10", "black"));
        Laptop.add(new Laptop(750, 8, "Windows7", "blue"));
        Laptop.add(new Laptop(1000, 16, "Linux", "red"));
        Laptop.add(new Laptop(1250, 32, "Windows11", "red"));
        Laptop.add(new Laptop(750, 64, "Linux", "white"));
        Laptop.add(new Laptop(500, 32, "Linux", "silver"));
        Filter(userRequest(), Laptop);

    }
    public static HashMap<String, String> userRequest() {
        HashMap<String, String> userRequest = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите параметры для поиска:");
        System.out.print("Введите тип ОС:");
        userRequest.put("os_type", scanner.nextLine());
        System.out.print("Введите цвет корпуса:");
        userRequest.put("color", scanner.nextLine());
        System.out.print("Введите минимальный объем жесткого диска:");
        userRequest.put("hdd_volume", scanner.nextLine());
        System.out.print("Введите минимальный объем оперативной памяти:");
        userRequest.put("ram_volume", scanner.nextLine());
        scanner.close();
        return userRequest;
    }

    public static void Filter(HashMap<String, String> userRequest, HashSet<Laptop> catalog) {
        boolean noResultsFlag = true;
        for (Laptop nb : catalog) {
            if (userRequest.get("color").equals(nb.getColor()) || userRequest.get("color") == "") {
                if (userRequest.get("os_type").equals(nb.getOStype()) || userRequest.get("os_type") == "") {
                    if (nb.getHDDvolume() >= Integer.parseInt(userRequest.get("hdd_volume")))
                        if (nb.getRAMvolume() >= Integer.parseInt(userRequest.get("ram_volume"))) {
                        System.out.println(nb);
                        noResultsFlag=false;
                        }
                    }
                }
            }
        if (noResultsFlag) {
            System.out.println("По вашему запросу ничего не найдено.");
        }
    }
}