package O;

/**
 *
 * @author Mahmoud
 */
public class Subtraction implements CalculatorOperation
{
    public int left;
    public int right;
    public int result;

    public Subtraction(int left, int right) {
        this.left = left;
        this.right = right;
    }
    
    

    @Override
    public void perform() {
        result = left - right;
    }

    @Override
    public void print() {
        System.out.println("Subtraction result : "+result);
    }
    
}
