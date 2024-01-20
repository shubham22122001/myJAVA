class Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;

    }
}
class AdvCalc extends Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2+1;
    }
}
// in method overriding - everything will be same that is parameter, class name that have different behaivour but in method overloading there are different parameters but same class name that have different behaivour
public class override {
    public static void main(String[] args) {
        AdvCalc a = new AdvCalc();
        int x=a.add(3,4);
        System.out.println(x);
    }
}
