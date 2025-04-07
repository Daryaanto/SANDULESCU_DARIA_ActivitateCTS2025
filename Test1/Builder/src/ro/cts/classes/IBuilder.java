package ro.cts.classes;

public interface IBuilder {
    Rezervare getRezervare();

    IBuilder setNume(String nume);

    IBuilder setNrPersoane(int nrPersoane);

    IBuilder setOra(String ora);

    IBuilder setZi(String zi);

        IBuilder setPretMinim(float pretMinim) ;

    IBuilder setFumator(boolean fumator) ;
}
