public final class Logger {

    protected int num = 1;
    private static final Logger logger = new Logger();

    private Logger() {
    }

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        return logger;
    }
}