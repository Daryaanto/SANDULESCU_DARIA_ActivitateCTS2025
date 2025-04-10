package cts.sandulescu.daria.factorymethod.factories;

import cts.sandulescu.daria.factorymethod.modules.APersonalSpital;

public interface IFactory {


   public APersonalSpital getPersonal(IPersonal tip, String nume, int salariu);
}
