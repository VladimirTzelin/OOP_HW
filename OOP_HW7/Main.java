package OOP_HW7;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр представления для ввода и вывода
        ComplexCalc inputView = new ComplexCalc();
        ComplexCalc outputView = new ComplexCalc();

        // Создаем экземпляр модели данных
        CalculatorModel model = new CalculatorModel();

        // Создаем презентер, передавая ему  представления и модели данных
        CalculatorPresenter presenter = new CalculatorPresenterImpl(inputView, outputView, model);

        // Запускаем выполнение расчета
        presenter.calculate();
    }
}