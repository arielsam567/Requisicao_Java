package agenda;

public class Agenda {

    private Integer id;
    private String nome;
    private String hash;
    private String esfera;


    public void setEsfera(String esfera) {
        this.esfera = esfera;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHash(String category) {
        this.hash = category;
    }

    @Override
    public String toString() {
        return "Agenda [id=" + id + ", nome=" + nome + ", hash= "
                + hash + ", esfera= " + esfera + "]";
    }

}

