public class Buffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        System.out.println(str.length());
        System.out.println(str.capacity());

        StringBuffer str2 = new StringBuffer(20);
        System.out.println(str2.length());
        System.out.println(str2.capacity());

        StringBuffer str3 = new StringBuffer("Nayo");
        System.out.println(str3.length());
        System.out.println(str3.capacity());

        String name = "abc";
        int num = 10;
        Buffer obj = new Buffer();
        StringBuffer x = new StringBuffer("xyz");

        System.out.println(x.append(obj.toString()));
        System.out.println(x.append(num));
        System.out.println((x.insert(1, 'r')));
        x.setCharAt(1, 'r');
        System.out.println(x);

    }
}
