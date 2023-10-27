package croc.education.ws2023spb.knightsmove;

/**
 * Класс, реализующий фабричный метод, возвращающий обработчики, проверяющие, что последовательность клеток на шахматной
 * доске может быть пройдена ходом коня.
 *
 * @author Dmitry Malenok
 */
public final class KnightsMoveCheckerFactory implements KnightsMoveChecker{

    /**
     * Конструктор.
     */
    public KnightsMoveCheckerFactory() {
        // Конструктор задан только для того, чтобы экземпляр класса случайно не создали.
    }

    /**
     * Возвращает обработчик, проверяющий, что последовательность клеток на шахматной доске может быть пройдена ходом
     * коня.
     *
     * @return обработчик, проверяющий, что последовательность клеток на шахматной доске может быть пройдена ходом коня
     */
    public static KnightsMoveChecker get() {
        return new KnightsMoveCheckerFactory();
    }

    @Override
    public void check(String[] positions) throws IllegalMoveException {
        if (positions == null || positions.length < 2) {
            throw new IllegalMoveException("Пустая клетка");
        }

        for (int i = 1; i < positions.length; i++) {
            ChessPosition current = ChessPositionParser.parse(positions[i - 1]);
            ChessPosition next = ChessPositionParser.parse(positions[i]);
            int diff_x = Math.abs(next.x() - current.x());
            int diff_y = Math.abs(next.y() - current.y());

            // Ход коня похож на букву "Г" , 2 клетки в одном направлении и 1 клетка в перпендикулярном направлении
            if (!((diff_x == 1 && diff_y == 2) || (diff_x == 2 && diff_y == 1) )) {
                throw new IllegalMoveException("Конь не может выполнять такой ход " + current + next);
            }
        }
    }
}