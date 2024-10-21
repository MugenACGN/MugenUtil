package cn.mugen.core.exception;

public class UtilCannotInstantiateException extends CannotInstantiateException {
    public UtilCannotInstantiateException() {
        super("Util cannot be instantiated!");
    }

    public UtilCannotInstantiateException(String message) {
        super(message);
    }
}
