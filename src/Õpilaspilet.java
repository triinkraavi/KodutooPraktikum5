import java.time.LocalDate;

public class Õpilaspilet implements Dokument {
    private int sünniaasta;

    public Õpilaspilet(int sünniaasta) {
        this.sünniaasta = sünniaasta;
    }
    public boolean onVähemalt12Aastane(){
        return sünniaasta + 12 <= LocalDate.now().getYear();
    }
    @Override
    public boolean vanusOnVähemalt(int vanus) {
        int praeguneAasta = LocalDate.now().getYear();
        return praeguneAasta - sünniaasta >= vanus;
    }

    @Override
    public String toString() {
        return "Õpilaspilet: " +
                "sünniaasta = " + sünniaasta;
    }


}
