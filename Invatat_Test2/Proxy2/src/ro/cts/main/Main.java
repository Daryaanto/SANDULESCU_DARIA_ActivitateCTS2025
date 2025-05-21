package ro.cts.main;

import ro.cts.modules.Client;
import ro.cts.modules.ClientProxy;
import ro.cts.modules.IClient;

public class Main {
    public static void main(String[] args) {

        IClient client = new Client(22,"Leontin",50);
        IClient client2 = new Client(17,"Pilula",50);
        IClient client3 = new Client(19,"Nea Vali",5);

        ClientProxy proxyL=new ClientProxy(client);
        ClientProxy proxyP=new ClientProxy(client2);
        ClientProxy proxyV=new ClientProxy(client3);

        client.cumparaTigari(((Client) client).getVarsta(),25);
        proxyL.cumparaTigari(((Client) client).getVarsta(),25);
        System.out.println();

        client2.cumparaTigari(((Client) client2).getVarsta(),25);
        proxyP.cumparaTigari(((Client) client2).getVarsta(),25);
        System.out.println();

        client3.cumparaTigari(((Client) client3).getVarsta(),25);
        proxyV.cumparaTigari(((Client) client3).getVarsta(),25);;



    }
}