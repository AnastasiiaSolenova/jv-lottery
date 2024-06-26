package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANDOM_NUMBER = 101;
    private ColorSupplier colorSupplier;

    public Lottery() {
        this.colorSupplier = new ColorSupplier();
    }

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public void setColorSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Ball getRandomBall() {
        Ball ball = new Ball();

        String randomColorName = colorSupplier.getRandomColor().name();
        Color randomColor = Color.valueOf(randomColorName);

        ball.setColor(randomColor);

        Random random = new Random();
        int num = random.nextInt(RANDOM_NUMBER);
        ball.setNumber(num);

        return ball;
    }
}
