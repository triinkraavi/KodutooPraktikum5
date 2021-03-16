public class TestAmeerikaMäed {
    public static void main(String[] args) {
        Atraktsioon atraktsioon1 = new Atraktsioon("Tondiloss", 14);
        Atraktsioon atraktsioon2 = new Atraktsioon("Karusell", 12);
        Dokument[] dokumendid = {
                new IDKaart("50508071234"),
                new Õpilaspilet(2008)
        };

        System.out.println(atraktsioon1 + " Kas vanused sobivad: "+ atraktsioon1.vanusedSobivad(dokumendid)+ ", ebasobivad dokumendid: " + atraktsioon1.ebasobivadDokumendid(dokumendid));
        System.out.println(atraktsioon2 + " Kas vanused sobivad: "+ atraktsioon2.vanusedSobivad(dokumendid)+ ", ebasobivad dokumendid: " + atraktsioon2.ebasobivadDokumendid(dokumendid));
    }
}
