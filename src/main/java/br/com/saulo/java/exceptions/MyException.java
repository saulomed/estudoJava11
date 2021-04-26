package br.com.saulo.java.exceptions;

public class MyException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 7402267420521338169L;
	private int detail;

    MyException(int a)
    {
        detail = a;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
