import Kwakanie.Kwacz;
import Latanie.NieLatam;

public class ModelKaczki extends Kaczka {
    public ModelKaczki(){
        latanieInterfejs = new NieLatam();
        kwakanieInterfejs = new Kwacz();
    }

    @Override
    public void wyświetl() {
        System.out.println("Jestem modelem kaczki!");
    }
}
