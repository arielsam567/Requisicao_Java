package agenda;

public class Agenda {

    private String id;
    private String nome;
    private String hash;
    private String esfera;

    public String getEsfera() {
        return esfera;
    }
    public void setEsfera(String esfera) {
        this.esfera = esfera;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHash() {
        return hash;
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

