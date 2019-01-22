public class Car {

    private Color color; // w enumach musi byc jeszcze dodana cena w zaleznosci od wybranej opcji
    // chyba ze trzebe bedzie zrobic tak jak w klasie coat z rozmiarami ??

    private Body body;
    private Padding padding;
    private Engine nadwozie;

    public Car(Color color, Body body, Padding padding, Engine nadwozie) {
        this.color = color;
        this.body = body;
        this.padding = padding;
        this.nadwozie = nadwozie;
    }
    public Color getColor() {
        return color;
    }
    public Body getBody() {
        return body;
    }
    public Padding getPadding() {
        return padding;
    }
    public Engine getNadwozie() {
        return nadwozie;
    }
}
