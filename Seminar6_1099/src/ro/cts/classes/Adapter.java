package ro.cts.classes;

public class Adapter extends Medicament_farmacie{
   private Medicament_spital medicament_spital;

    public Adapter(Medicament_spital medicament_spital) {
        super(medicament_spital.getNume(), medicament_spital.getPret(), true, "20/10/2025");
        this.medicament_spital = medicament_spital;

    }

    @Override
    public void cumpara_medicament() {
        medicament_spital.achizitioneaza_medicament();
    }


}
