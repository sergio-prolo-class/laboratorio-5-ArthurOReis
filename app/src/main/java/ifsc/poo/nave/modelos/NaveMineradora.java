package ifsc.poo.nave.modelos;

public class NaveMineradora extends NaveEspacial {
    private int energiaLaserMaxima;
    private int energiaLaserAtual;

    public NaveMineradora(int energiaLaserMaxima){
        this.energiaLaserMaxima = energiaLaserMaxima;
        this.energiaLaserAtual = 0;
    }

    public boolean alternarLaser(int energiaLaserAtual){
        if(energiaLaserAtual <= energiaLaserMaxima){
            this.energiaLaserAtual = energiaLaserAtual;
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
