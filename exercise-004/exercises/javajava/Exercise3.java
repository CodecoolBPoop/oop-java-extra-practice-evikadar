package javajava;

public class Exercise3 {
    public static void main(String[] args) {
        DataObject[] dataObjectArray = {new DataObject(1), new DataObject(2), new DataObject(3)};
        int sum = 0;
        for (DataObject dataObject: dataObjectArray) {
            sum += dataObject.count;
        }
        System.out.printf("So the sum is %s%n", sum);
    }
}
