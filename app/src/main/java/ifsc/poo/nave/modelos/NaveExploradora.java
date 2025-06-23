package ifsc.poo.nave.modelos;

public class NaveExploradora extends NaveEspacial {
    private boolean holofotes;

    public NaveExploradora(boolean holofotes){
        this.holofotes = holofotes;
    }

    public boolean ligarHolofotes(){
        this.holofotes = !holofotes;
        return holofotes;
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
