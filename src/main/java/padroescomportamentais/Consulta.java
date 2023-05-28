package padroescomportamentais;

public class Consulta {

    private int ano;
    private int consulta;
    private String situacao;

    public Consulta(int ano, int consulta) {
        this.ano = ano;
        this.consulta = consulta;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirConsulta() {
        this.situacao = "Consulta em aberto";
    }

    public void fecharConsulta() {
        this.situacao = "Consulta Realizada";
    }
}
