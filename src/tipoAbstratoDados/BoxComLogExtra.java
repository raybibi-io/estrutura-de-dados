public interface BoxComLogExtra<MeuTipoBonitinho> {

    /**
     * O método guardar() deve guardar um número inteiro novo na BoxComLog. Caso
     * algum número anterior já esteja guardado, este número é perdido (exceto pela
     * informação retornada pelo log).
     *
     * @param newNum o número a ser guardado na BoxComLog
     */
    public void guardar(MeuTipoBonitinho newNum);

    /**
     * O método recuperar() deve fornecer como retorno
     * o último número inteiro que foi guardado na
     * BoxComLog. Caso nenhum número tenha sido guardado antes da chamada a
     * recuperar(), este método deve retornar um valor padrão (a ser definido pela
     * classe que implementar BoxComLog).
     *
     * @return o último número inteiro guardado. Qualquer número anteriormente
     * guardado nesta caixa não deve influenciar este valor de retorno de
     * nenhuma forma sob pena de eu ir até a cara da pessoa e xingar muito.
     */
    public MeuTipoBonitinho recuperar();

    /**
     * O método imprimirLog() retorna na forma de String a relação de todos os
     * números inteiros anteriormente guardados na BoxComLog, em ordem cronológica a
     * partir do mais antigo. Os números devem estar separados por ", ".
     */
    public String imprimirLog();
}