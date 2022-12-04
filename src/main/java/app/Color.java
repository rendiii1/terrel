package app;

import misc.Misc;

/**
 * Класс цветов
 */
public class Color {
    /**
     * цвет фона
     */
    public static final int APP_BACKGROUND_COLOR = Misc.getColor(255, 0, 50, 50);

    /**
     * Запрещённый конструктор
     */
    private Color() {
        throw new AssertionError("Вызов этого конструктора запрещён");
    }
}