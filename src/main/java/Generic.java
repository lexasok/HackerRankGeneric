public class Generic {

    public static <E> E printE(E element) {
        return element;
    }

    public static void main(String[] args) {

        System.out.println(Generic.printE(1123123));

    }
}
