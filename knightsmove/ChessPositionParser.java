package croc.education.ws2023spb.knightsmove;

/**
 * Класс, содержащий методы преобразования в объект расположения фигуры на шахматной доске из различных форматов.
 *
 * @author Dmitry Malenok
 * @see ChessPosition
 */
public final class ChessPositionParser implements ChessPosition{
    private int coordinate_x;
    private int coordinate_y;


    /**
     * Конструктор.
     */
    private ChessPositionParser(int newX, int newY) {
        this.coordinate_x = newX;
        this.coordinate_y = newY;
    }

    /**
     * Разбирает наименование клетки шахматной доски, на которой находится фигура, в
     * <a href="https://w.wiki/7pFN">шахматной нотации</a> и возвращает соответствующий ей объект расположения фигуры на
     * шахматной доске.
     *
     * @param position
     *            наименование клетки шахматной доски, на которой находится фигура
     * @return объект расположения фигуры на шахматной доске, соответствующий переданному наименованию клетки
     */
    public static ChessPosition parse(final String position) {

        if (position.length() > 2) {
            throw new IllegalArgumentException("Неверный ввод");
        }

        char X = position.charAt(0);
        char Y = position.charAt(1);

        if (Y > '8' || Y < '1' ||X > 'h' || X < 'a' )
        {
            throw new IllegalArgumentException("Неверные координаты");
        }
        int x = X - 'a';
        int y = Y - '1';
        return new ChessPositionParser(x, y);
    }

    @Override
    public int x() {
        return coordinate_x;
    }

    @Override
    public int y() {
        return coordinate_y;
    }
    @Override
    public String toString() {
        char char_x = (char)('a' + coordinate_x);
        char char_y = (char)('1' + coordinate_y);
        return String.valueOf(char_x) + String.valueOf(char_y);
    }
}