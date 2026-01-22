public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Nguyen Van A", "Hanoi");
        System.out.println("=== Test lop Person ===");
        System.out.println("Thong tin ban dau:");
        System.out.println(p1);
        System.out.println("Ten: " + p1.getName());
        System.out.println("Dia chi: " + p1.getAddress());
        p1.setAddress("Ho Chi Minh City");
        System.out.println("Sau khi thay doi dia chi:");
        System.out.println(p1);
    }
}
