package ro.cts.classes;

public class Receptionist {
    public String poateLuaLocLaMasa(Masa masa1){
        Ospatar ospatar1= new Ospatar();
        Picolo picolo1= new Picolo();

        if(masa1.isEsteLibera()){
            if(picolo1.esteDebarasata(masa1)){
                if(ospatar1.esteAranjata(masa1)){
                    return "luati loc la masa "+ masa1.getNrMasa();

                }
                else{
                    return "asteptati se aranjeaza masa";
                }

            }
            else{
                return "asteptati se curata masa";

            }
        }
        else{
            return "masa e indisponibila";

        }
    };
}
