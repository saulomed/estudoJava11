package br.com.saulo.java.exceptions;

public class MultiCatch
{

    public static void main(String[] args) {
        int a = 10, b = 0;
        int vals[] = {1,2,3};
        try {
            int result = a/b;
            vals[10] = 19;
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exceptions caught: "+e);
        }

        System.out.println("After multi-catch");
    }
}
