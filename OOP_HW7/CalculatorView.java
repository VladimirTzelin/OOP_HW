package OOP_HW7;
public interface CalculatorView {
    /**
     * Отображает результат вычисления на экране.
     *
     * @param result результат вычисления
     */
    void showResult( double result_a, double result_b);

    /**
     * Получает первое число от пользователя.
     *
     * @return первое число
     */
    double getFirstNumber_a();
    double getFirstNumber_b();

    /**
     * Получает второе число от пользователя.
     *
     * @return второе число
     */
    double getSecondNumber_a();
    double getSecondNumber_b();
    /**
     * Получает выбранную операцию от пользователя.
     *
     * @return выбранная операция (+, -, *, /)
     */
    char getOperation();
}
