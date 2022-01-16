package com.example.elektronik;

import android.content.Context;
import model.Elektronik;
import model.Handphone;
import model.Laptop;
import model.Televisi;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    private static List<Elektronik> elektroniks = new ArrayList<>();

    private static List<Handphone> initCoktail(Context ctx) {
        List<Handphone> handphones = new ArrayList<>();
        handphones.add(new Handphone(ctx.getString(R.string.name_iphone11promax), ctx.getString(R.string.jenis_iphone11promax),ctx.getString(R.string.deskripsi_iphone11promax)
                ,R.drawable.h_apple_promax_11));
        handphones.add(new Handphone(ctx.getString(R.string.name_samsung),
                ctx.getString(R.string.jenis_samsung), ctx.getString(R.string.deskripsi_samsung)
                , R.drawable.h_samsung_galaxy_a72));
        handphones.add(new Handphone(ctx.getString(R.string.name_opporeno),ctx.getString(R.string.jenis_opporeno),ctx.getString(R.string.deskripsi_opporeno)
                , R.drawable.h_oppo));
        handphones.add(new Handphone(ctx.getString(R.string.name_nokia), ctx.getString(R.string.jenis_nokia),ctx.getString(R.string.deskripsi_nokia)
                , R.drawable.h_nokia));
       return handphones;
    }

    private static List<Laptop> initMocktail(Context ctx) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop(ctx.getString(R.string.name_accer), ctx.getString(R.string.jenis_accer), ctx.getString(R.string.deskripsi_accer)
               , R.drawable.l_acer));
        laptops.add(new Laptop(ctx.getString(R.string.name_lenovo), ctx.getString(R.string.jenis_lenovo), ctx.getString(R.string.deskripsi_lenovo)
               , R.drawable.l_lenovo));
        laptops.add(new Laptop(ctx.getString(R.string.name_toshiba), ctx.getString(R.string.jenis_toshiba), ctx.getString(R.string.deskripsi_toshiba)
                , R.drawable.l_toshiba));
        laptops.add(new Laptop(ctx.getString(R.string.name_hp), ctx.getString(R.string.jenis_hp), ctx.getString(R.string.deskripsi_hp)
                , R.drawable.l_hp));
        laptops.add(new Laptop(ctx.getString(R.string.name_assus), ctx.getString(R.string.jenis_assus), ctx.getString(R.string.deskripsi_assus)
               , R.drawable.l_assus));
        return laptops;
    }

    private static List<Televisi> initIndonesianFoos(Context ctx) {
        List<Televisi> televisis = new ArrayList<>();
        televisis.add(new Televisi(ctx.getString(R.string.name_lg), ctx.getString(R.string.jenis_lg), ctx.getString(R.string.deskripsi_lg)
               , R.drawable.t_lg));
        televisis.add(new Televisi(ctx.getString(R.string.name_politron), ctx.getString(R.string.jenis_politron), ctx.getString(R.string.deskripsi_politron)
                , R.drawable.t_toshiba));
        return televisis;
    }


    private static void initAllElektronik(Context ctx) {
        elektroniks.addAll(initCoktail(ctx));
        elektroniks.addAll(initMocktail(ctx));
        elektroniks.addAll(initIndonesianFoos(ctx));
    }


    public static List<Elektronik> getElektroniksByTipe(Context ctx, String jenis) {
        List<Elektronik> elektroniksByType = new ArrayList<>();
        if (elektroniks.size() == 0) {
            initAllElektronik(ctx);
        }
        for (Elektronik h : elektroniks) {
            if (h.getElektronik().equals(jenis)) {
                elektroniksByType.add(h);
            }
        }
        return elektroniksByType;
    }
}
