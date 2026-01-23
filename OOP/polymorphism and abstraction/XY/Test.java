public class Test {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(2, 3, 1, 1);
        System.out.println("Before");
        System.out.println(p1);
        p1.moveUp();
        p1.moveRight();
        System.out.println("After");
        System.out.println(p1);

        MovableCircle c1 = new MovableCircle(0, 0, 2, 2, 5);
        System.out.println(c1);
        c1.moveDown();
        c1.moveLeft();
        System.out.println(c1);
    }
}
