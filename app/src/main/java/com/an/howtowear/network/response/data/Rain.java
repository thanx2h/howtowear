package com.an.howtowear.network.response.data;

import com.google.gson.annotations.SerializedName;

public class Rain {
    @SerializedName("3h")
    String threeH; // list.rain.3h Rain volume for last 3 hours, mm

    public String getThreeH() {
        return threeH;
    }

    public void setThreeH(String threeH) {
        this.threeH = threeH;
    }

    @Override
    public String toString() {
        return "Rain{" +
                "threeH='" + threeH + '\'' +
                '}';
    }
}
