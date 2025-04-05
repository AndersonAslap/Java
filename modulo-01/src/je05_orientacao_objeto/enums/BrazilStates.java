package je05_orientacao_objeto.enums;

public enum BrazilStates {
    PE("Pernambuco", "PE"),
    MA("Maranhão", "MA"),
    BA("Bahia", "BA"),
    SP("São Paulo", "SP"),
    RJ("Rio de Janeiro", "RJ"),
    ;

    private String name;
    private String uf;

    private  BrazilStates(String name, String uf) {
        this.name = name;
        this.uf = uf;
    }

    public String getName() {
        return this.name;
    }

    public String getUf(){
        return this.uf;
    }
}
