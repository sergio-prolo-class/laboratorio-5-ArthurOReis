package ifsc.poo.nave.modelos;

public abstract class NaveEspacial {
    private int id;
    private static int incrementaId = 0;
    private int velocidadeAtual;

    public NaveEspacial(){
        this.id = incrementaId + 1;
        this.velocidadeAtual = 0;
    }

    public abstract String acelerar();

    public abstract String frear();

    public abstract String decolar();

    public abstract String pousar();

}
