
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(5, 6);
        System.out.println("r1 Info: ");
        r1.printRectangle();
        //making changes
        r1.setLength(6);
        r1.setWidth(7);
        System.out.println("new info:");
        r1.printRectangle();
    }
}