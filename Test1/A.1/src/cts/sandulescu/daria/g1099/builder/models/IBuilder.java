package cts.sandulescu.daria.g1099.builder.models;

public interface IBuilder {
    Internare buildInternare(String nume);



    IBuilder setPatRabatabil(boolean patRabatabil) ;

    IBuilder setHasMicDejun(boolean hasMicDejun) ;
}
