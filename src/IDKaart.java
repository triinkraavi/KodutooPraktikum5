import java.time.LocalDate;

public class IDKaart implements Dokument {
    private String isikukood;

    public IDKaart(String isikukood) {
        this.isikukood = isikukood;
    }

    public boolean onVähemalt12Aastane(){
        int praeguneAasta = LocalDate.now().getYear();
        return sünniaasta() <= praeguneAasta-12;
    }
    @Override
    public boolean vanusOnVähemalt(int vanus) {
        int praeguneAasta = LocalDate.now().getYear();
        return praeguneAasta - sünniaasta() >= vanus;
    }

    private int sünniaasta(){
        int algus = Integer.parseInt(isikukood.substring(0,1));
        int aasta = Integer.parseInt(isikukood.substring(1,3));
        if(algus <= 2)
            return 1800 + aasta;
        if(algus <= 4)
            return 1900 + aasta;
        if (algus <= 6)
            return 2000 + aasta;
        return 2100 + aasta;
    }

    @Override
    public String toString() {
        return "IDKaart: " +
                "isikukood = " + isikukood;
    }


}
