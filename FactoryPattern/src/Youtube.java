public abstract class Youtube {
    public abstract String getName();

    public static void main(String[] args) {
        TypeYFactory typeYFactory = new TypeYFactory();

        Youtube y1 = typeYFactory.createYoutube("카일스쿨");
        Youtube y2 = typeYFactory.createYoutube("노마드코");
        Youtube y3 = typeYFactory.createYoutube("동빈나");

        System.out.println(y1.getName());
        System.out.println(y2.getName());
        System.out.println(y3.getName());
    }
}
