import Kwakanie.NieKwacz;
import Latanie.NieLatam;

public class GumowaKaczka extends Kaczka{
    public GumowaKaczka(){
        latanieInterfejs=new NieLatam();
        kwakanieInterfejs=new NieKwacz();
    }
    @Override
    public void wyświetl() {

    }
}
