public class BoxLogString implements BoxComLog {
    long numGuardado;
    String log;

    BoxLogString() {
        numGuardado = -1;
        log = "";
    }

    public void guardar(long newNum) {
        numGuardado = newNum;
        if (log != "")
            log += ", ";
        log += ((Long) newNum).toString();
    }

    public long recuperar() {
        return numGuardado;
    }

    public String imprimirLog() {
        return log;
    }
}