import Kwakanie.KwakanieInterfejs;
import Latanie.LatanieInterfejs;

public abstract class Kaczka {
        LatanieInterfejs latanieInterfejs;
        KwakanieInterfejs kwakanieInterfejs;

        public abstract void wyświetl();

        public void wykonajLeć(){
            latanieInterfejs.leć();
        }

        public void wykonajKwacz(){
            kwakanieInterfejs.kwacz();
        }
        public void pływaj(){
            System.out.println("Wszystkie kaczki pływają, nawet te sztuczne!");
        }

        public void ustawLatanieInterfejs(LatanieInterfejs li){
            latanieInterfejs = li;
        }
        public void ustawKwakanieInterfejs(KwakanieInterfejs ki){
            kwakanieInterfejs = ki;
        }
}
