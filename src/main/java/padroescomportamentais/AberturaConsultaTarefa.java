package padroescomportamentais;

public class AberturaConsultaTarefa implements Tarefa {

    private Consulta consulta;

    public AberturaConsultaTarefa(Consulta consulta) {
        this.consulta = consulta;
    }

    public void executar() {
        this.consulta.abrirConsulta();
    }

    public void cancelar() {
        this.consulta.fecharConsulta();
    }
}
