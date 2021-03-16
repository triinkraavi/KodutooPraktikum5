import java.time.LocalDate;

public class Juhiluba implements Dokument {
    private int kehtivuseLõpuAasta;

    public Juhiluba(int kehtivuseLõpuAasta) {
        this.kehtivuseLõpuAasta = kehtivuseLõpuAasta;
    }

    public boolean onVähemalt12Aastane(){
        return kehtivuseLõpuAasta>0;
    }

    @Override
    public boolean vanusOnVähemalt(int vanus) {
        return false;
    }
}
