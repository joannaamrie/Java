public class MyCode {
    public static void main(String[] args) {
 
        //TODO: Write your program
 String[] items = {"Ballpen", "Pencil", "Eraser", "Notebook", "Yellow Pad Paper"};
        int[] quantity = {2, 5, 1, 2, 1};
        float[] price = {12.5F, 9.5F, 5.5F, 50.5F, 40.5F};

        for (int i = 0; i < 5; i++) {
            System.out.println("Item " + (i + 1) + ": " + items[i] + ", Quantity: " + quantity[i] + ", Price: " + price[i]);
        }
    }
}
