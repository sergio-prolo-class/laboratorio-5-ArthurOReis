package ifsc.poo.nave.modelos;

public class NaveCargueira extends NaveEspacial{
    private int cargaMaxima;
    private int cargaAtual;

    public NaveCargueira(int cargaMaxima){
        this.cargaMaxima = cargaMaxima;
        this.cargaAtual = 0;
    }

    public boolean carregar(int p){
        if(p <= cargaMaxima){
            this.cargaAtual = p;
            return true;
        }
        return false;
    }

    @Override
    public String acelerar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'acelerar'");
    }

    @Override
    public String frear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'frear'");
    }

    @Override
    public String decolar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'decolar'");
    }

    @Override
    public String pousar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pousar'");
    }
}
