package com.example.uygulama7;

import android.util.Log;

public class personel {
    private int yas;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas<18||yas>55){
            Log.e("kapsülleme","Hatalı yaş");
            yas=18;
        }
        this.yas = yas;
    }
}
