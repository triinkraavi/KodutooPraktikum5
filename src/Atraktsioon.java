import java.util.ArrayList;
import java.util.List;

public class Atraktsioon {
    private String atraktsiooniNimi;
    private int minimaalneNõutudVanus;

    public Atraktsioon(String atraktsiooniNimi, int minimaalneNõutudVanus) {
        this.atraktsiooniNimi = atraktsiooniNimi;
        this.minimaalneNõutudVanus = minimaalneNõutudVanus;
    }

    public boolean vanusedSobivad(Dokument[] dokumendid) {
        if (ebasobivadDokumendid(dokumendid).isEmpty())
            return true;
        else
            return false;
}

    public List<Dokument> ebasobivadDokumendid(Dokument[] dokumendid){
        List<Dokument> ebasobivadDokumendid = new ArrayList<>();
        for(Dokument dokument:dokumendid){
            if(!dokument.vanusOnVähemalt(minimaalneNõutudVanus))
                ebasobivadDokumendid.add(dokument);
        }
        return ebasobivadDokumendid;
    }

    @Override
    public String toString() {
        return "Atraktsioon: " +
                "atraktsiooni nimi = " + atraktsiooniNimi +
                ", minimaalne nõutud vanus = " + minimaalneNõutudVanus;
    }
}



