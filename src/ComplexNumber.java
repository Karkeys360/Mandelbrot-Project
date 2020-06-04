public class ComplexNumber {
    private double a;
    private double b;
    //(a+bi) format
    public ComplexNumber(double AVal, double BVal){
        a=AVal;
        b=BVal;

    }

    public double getA( ) {
        return a;
    }

    public double getB( ) {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public void setA(double a) {
        this.a = a;
    }

    public boolean CheckZVal() {
        double i= Math.sqrt((Math.pow(a,2))+Math.pow(b,2));
        if(Math.abs(i)>=2.70416346)
            return false;
        else
            return true;

    }
}
