public class ShopHelper {

    // 1
    public static int findCheapestKeyboard(int[] keyboards) {
        int min = keyboards[0];
        for (int price : keyboards) {
            if (price < min) {
                min = price;
            }
        }
        return min;
    }

    // 2
    public static int findMostExpensiveItem(int[] items1, int[] items2) {
        int max = items1[0];
        for (int price : items1) {
            if (price > max) {
                max = price;
            }
        }
        for (int price : items2) {
            if (price > max) {
                max = price;
            }
        }
        return max;
    }

    // 3
    public static int findMostExpensiveUSB(int[] usbDrives, int budget) {
        int maxAffordable = -1;
        for (int price : usbDrives) {
            if (price <= budget && price > maxAffordable) {
                maxAffordable = price;
            }
        }
        return maxAffordable;
    }

    // 4
    public static int findMaxSpend(int[] keyboards, int[] usbDrives, int budget) {
        int maxSpend = -1;

        for (int keyboardPrice : keyboards) {
            for (int usbPrice : usbDrives) {
                int total = keyboardPrice + usbPrice;
                if (total <= budget && total > maxSpend) {
                    maxSpend = total;
                }
            }
        }

        return maxSpend;
    }

    public static void main(String[] args) {

        // 1
        int[] keyboards = {40, 35, 70, 15, 45};
        System.out.println("Cea mai ieftină tastatură: " + findCheapestKeyboard(keyboards));

        // 2
        int[] usbDrives = {20, 15, 40, 15};
        System.out.println("Cel mai scump obiect: " + findMostExpensiveItem(keyboards, usbDrives));

        // 3
        int budget = 30;
        System.out.println("Cel mai scump USB pe care Markus îl poate cumpăra: " + findMostExpensiveUSB(usbDrives, budget));

        // 4
        budget = 60;
        System.out.println("Suma maximă pe care o poate cheltui Markus: " + findMaxSpend(keyboards, usbDrives, budget));
    }
}
