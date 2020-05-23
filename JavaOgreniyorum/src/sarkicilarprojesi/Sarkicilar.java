package sarkicilarprojesi;

import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String> sarkicilarListesi = new ArrayList<>();

    public void sarkicilariListele(){
        System.out.println("Listede toplam " + sarkicilarListesi.size() + "sarkici bulunmaktadır.");
        for (int i=0;i<sarkicilarListesi.size();i++){
            System.out.println((i+1) +". Şarkıcı :" + sarkicilarListesi.get(i));
        }
    }
    public void sarkiciEkle(String isim){
        sarkicilarListesi.add(isim);
        System.out.println("Listeye Yeni Şarkıcı Eklendi....");
    }
    public void sarkiciGüncelle(String yeniIsim, int position){
        sarkicilarListesi.set(position, yeniIsim);
        System.out.println("Liste Güncellendi....");
    }
    public void sarkiciSil(int position){
        String isim = sarkicilarListesi.get(position);
        sarkicilarListesi.remove(position);
        System.out.println(isim +" şarkıcı listeden silindi");
    }
    public void sarkiciAra (String isim){
        int position = sarkicilarListesi.indexOf(isim);
        if (position>=0){
            System.out.println("Şarkıcı bulundu .");
            System.out.println(isim + "isimli şarkıcı " + (position+1) + " . sıradadır.");
        }else
            System.out.println("Listede şarkıcı yoktur.");
    }

}
