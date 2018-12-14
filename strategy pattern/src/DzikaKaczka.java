import Kwakanie.Kwacz;
import Latanie.LatamBoMamSkrzydła;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        kwakanieInterfejs = new Kwacz();
        latanieInterfejs = new LatamBoMamSkrzydła();
    }

    @Override
    public void wyświetl() {
        System.out.println("Jestem prawdziwą dziką kaczką");
    }
}
