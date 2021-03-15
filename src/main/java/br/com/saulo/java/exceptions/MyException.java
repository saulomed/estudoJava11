package br.com.saulo.java.exceptions;

public class MyException extends Exception
{
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
