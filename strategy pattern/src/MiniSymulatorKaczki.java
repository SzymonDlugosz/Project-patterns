public class MiniSymulatorKaczki {

    public static void main(String[] args) {
        Kaczka dzika = new DzikaKaczka();
        dzika.wykonajKwacz();
        dzika.wykonajLeć();

        Kaczka model = new ModelKaczki();
        model.wykonajKwacz();
        model.wykonajLeć();

        Kaczka gumowa = new GumowaKaczka();
        model.wykonajKwacz();
        model.wykonajLeć();
    }
}
