package cn.mugen.core.exception;

public class CannotInstantiateException extends Exception {
    public CannotInstantiateException() {
        super("this class cannot be instantiated!");
    }

    public CannotInstantiateException(String message) {
        super(message);
    }
}
