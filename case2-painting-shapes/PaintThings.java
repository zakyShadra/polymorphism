public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        Rectangle deck = new Rectangle(20, 35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        double deckAmount = paint.amount(deck);
        double ballAmount = paint.amount(bigBall);
        double tankAmount = paint.amount(tank);

        System.out.println("Deck paint: " + deckAmount);
        System.out.println("Big ball paint: " + ballAmount);
        System.out.println("Tank paint: " + tankAmount);

        Shape shape;
        shape = deck;
        System.out.println(shape + " area=" + shape.area());
        shape = bigBall;
        System.out.println(shape + " area=" + shape.area());
        shape = tank;
        System.out.println(shape + " area=" + shape.area());
    }
}
