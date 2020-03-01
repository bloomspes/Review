public class StringEqualsPractice {

    public static void main(String[] args) {

        String name1 = "슭";
        String name2 = "슭";

        if (name1 == name2) {

            System.out.println("name1과 name2는 참조가 같음");
        }

        else {

            System.out.println("name1과 name2는 참조가 다름");
        }

        if (name1.equals(name2)) {

            System.out.println("name1과 name2는 문자열이 같다");
        }

        String name3 = new String("슭");
        String name4 = new String("슭");

        if (name3 == name4) {

            System.out.println("name3과 name4는 참조가 같음");
        }

        else {

            System.out.println("name3과 name4는 참조가 다름");
        }

        if (name3.equals(name4)) {

            System.out.println("name3과 name4는 문자열이 같음");
        }
    }
}