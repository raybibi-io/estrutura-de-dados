public class BoxLogStringExtra<MeuTipoBonitinho> implements BoxComLogExtra<MeuTipoBonitinho> {
    MeuTipoBonitinho valGuardado;
    String log;

    public BoxLogStringExtra() {
        valGuardado = null;
        log = "";
    }

    public void guardar(MeuTipoBonitinho newVal) {
        valGuardado = newVal;
        if (log != "")
            log += ", ";
        log += newVal.toString();
    }

    public MeuTipoBonitinho recuperar() {
        return valGuardado;
    }

    public String imprimirLog() {
        return log;
    }
}