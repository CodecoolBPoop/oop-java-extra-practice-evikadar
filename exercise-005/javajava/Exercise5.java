public class Exercise5 {

    public static void main(String[] args) {
        DataObject[] dataObjects = {new DataObject(1, "Friday"), new DataObject(2, "Friday"), new DataObject(3, "Saturday"), new DataObject(4, "Saturday"), new DataObject(5, "Saturday")};
        int sum = 0;
        for (DataObject object : dataObjects) {
            if (object.code.equals("Friday")) {
                sum += object.count;
            }
        }
        System.out.printf("So here we are at sum %s.%n", sum);


    }

}
