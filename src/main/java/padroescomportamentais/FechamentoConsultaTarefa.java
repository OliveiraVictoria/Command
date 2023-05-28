package padroescomportamentais;

public class FechamentoConsultaTarefa implements Tarefa {

    private Consulta consulta;

    public FechamentoConsultaTarefa(Consulta consulta) {
        this.consulta = consulta;
    }

    public void executar() {
        this.consulta.fecharConsulta();
    }

    public void cancelar() {
        this.consulta.abrirConsulta();
    }
}
