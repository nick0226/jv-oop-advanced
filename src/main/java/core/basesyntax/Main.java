package core.basesyntax;

import java.util.Random;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();
    public static void main(String[] args) {
        Random random = new Random();
        Figure[] figures = new Figure[random.nextInt(5)];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            System.out.println(figures[i].draw());
        }
    }
}