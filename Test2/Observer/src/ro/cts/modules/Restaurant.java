package ro.cts.modules;

public class Restaurant extends Localuri{


    public Restaurant(String denumire) {
        super(denumire);
    }

    @Override
    public void rezervaMasa() {
       trimiteMesaj("Restaurantul "+ this.getDenumire());
    }
}
