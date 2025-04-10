package cts.sandulescu.daria.g1099.builder.main;

import cts.sandulescu.daria.g1099.builder.models.Internare;
import cts.sandulescu.daria.g1099.builder.models.InternareBuilder;

public class Main {
    public static void main(String[] args) {

        InternareBuilder bld=new InternareBuilder();

        Internare internare=bld.buildInternare("Leontin");
        Internare internare2=bld.setHasMicDejun(true).setPatRabatabil(true).buildInternare("Leontina");

        System.out.println(internare.toString());
        System.out.println(internare2.toString());

    }
}