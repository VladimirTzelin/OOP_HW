

public class CalculatorPresenterImpl implements CalculatorPresenter {
    private ComplexCalc inputView;
    private ComplexCalc model;
    private Object result_a;
    private Object result_b;
   
    public CalculatorPresenterImpl(ComplexCalc inputView1, ComplexCalc inputView2, ComplexCalc outputView1, ComplexCalc outputView2, ComplexCalc model) {
        this.inputView = inputView2;
        //this.outputView = outputView2;
        this.model = model;
    }

    public CalculatorPresenterImpl(ComplexCalc inputView2, ComplexCalc outputView, CalculatorModel model2) {
    }

    @Override
    public void calculate() {
        double firstNumber_a = inputView.getFirstNumber_a();
        double firstNumber_b = inputView.getFirstNumber_a();
        double secondNumber_a = inputView.getSecondNumber_a();
        double secondNumber_b = inputView.getSecondNumber_b();
        char operation = inputView.getOperation();

        double result = model.performOperation(firstNumber_a, firstNumber_b, secondNumber_a,secondNumber_b, operation);

        public outputView;
        ( outputView).showResult(result_a, result_b);
        
    }
}