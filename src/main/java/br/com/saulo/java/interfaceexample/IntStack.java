package br.com.saulo.java.interfaceexample;

public interface IntStack
{
    void push(int item);
    int pop();

    default void clear()
    {
        System.out.println("clear*() not implemented");
        throw new  UnsupportedOperationException();
    }

    default int[] popNElements(int n)
    {
        return getElements(n);
    }

    default int[] skipAndpopNElements(int skip, int n)
    {
        getElements(skip);

        return getElements(n);
    }

    private int[] getElements(int n)
    {
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) {
            elements[i] = pop();
        }
        return elements;
    }
}
