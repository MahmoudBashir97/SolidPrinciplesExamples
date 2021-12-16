package O;

/**
 *
 * @author Mahmoud
 */
public class Addition implements CalculatorOperation{
    
    public int left;
    public int right;
    public int result;

    public Addition(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void perform() {
       result = left + right;
    }
    

    @Override
    public void print() {
        System.out.println("Addition result : "+result);
    }
    
}
