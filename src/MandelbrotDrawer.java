public class MandelbrotDrawer {
    public static boolean getNewZvals(ComplexNumber Z, double CXVal, double CYVal, int iteration ) {
        double newAVal = Math.pow(Z.getA(), 2) - ( Math.pow(Z.getB(), 2) ) + CXVal;
        double newBVal = 2 * Z.getA() * Z.getB() - CYVal;
        iteration++;
        ComplexNumber NewZ = new ComplexNumber(newAVal, newBVal)
        Boolean isConverging = NewZ.CheckZVal();
        if (iteration < 100 && isConverging) {
            isConverging = getNewZvals(NewZ, CXVal, CYVal, i);
        }
        return isConverging;


    }

}
