package dominio;

public class Curso extends Conteudo{


    private int cargaHoraria;


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return  '\n' + "Curso: " + titulo + " - " +
                "descricao: " + descricao + " - " +
                "cargaHoraria: " + cargaHoraria +
                " - XP: " + calcularXp();
    }

    @Override
    public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }
}
