package AlperenHoca.GrupProjeUygulama01.Repositories.entities;

import java.util.ArrayList;

public class Sepet {

    private static Integer sepetIdCount =0;
    private Integer sepetId;
    private Double toplamFiyat;
    ArrayList<Urun> urunArrayList;

    public Sepet(){
        urunArrayList = new ArrayList<>();
        this.sepetId = ++sepetIdCount;
    }

}
