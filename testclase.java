public class testclase implements operacionesAritmeticas{
    public static void main(String[] args) {
        testclase test=new testclase();
        //System.out.println(aritmeticos.resta(0, aritmeticos.resta(5,-8)));
        int resulSuma=test.suma(3,7);
        int resulResta=test.resta(10,8);
        int resulMultiplicacion=test.multiplicacion(9,3);
        int resulDivision=test.division(2,1);

        System.out.println("Suma: " + resulSuma);
        System.out.println("Resta: " + resulResta);
        System.out.println("Multiplicación: " + resulMultiplicacion);
        System.out.println("División: " + resulDivision);

        int resultCombinado=test.mix(4,2);
        System.out.println("Resultado: "+resultCombinado);
    }
    public  int suma (int x, int y){
        return x + y;
    }

    public int resta (int x, int y){
        return x - y;
    }

    public int multiplicacion (int x, int y){
        return x * y;
    }

    public int division(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Error: No se puede divir un numero con cero");
            return 0;
        }
    }

    public int mix (int x,int y){
        int resultadoSuma = suma(x, y);
        int resultadoResta = resta(x, y);
        int resultadoMultiplicacion = multiplicacion(x, y);
        int resultadoDivision = division(x, y);

        return resultadoSuma + resultadoResta + resultadoMultiplicacion - resultadoDivision;

    }

}

/*
abstract class  aritmeticos{
    public abstract int suma (int x, int y);

    public static int resta (int x, int y){
        return x - y;
    }
*/

interface operacionesAritmeticas {
    int suma(int x, int y);
    int resta(int x, int y);
    int multiplicacion(int x, int y);
    int division(int x, int y);

}
