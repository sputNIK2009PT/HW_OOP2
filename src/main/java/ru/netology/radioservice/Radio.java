package ru.netology.radioservice;

public class Radio {
    private int radioNum;
    private int volume;
    public int radioNumMin = 0;
    public int radioNumMax = 9;
    public int volumeMin = 0;
    public int volumeMax = 100;

    public int getRadioNum() {
        return radioNum;
    }

    public void setRadioNum(int newRadioNum) {
        if (newRadioNum < radioNumMin || newRadioNum > radioNumMax) {
            return;
        } else radioNum = newRadioNum;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolumeSet) {
        if (newVolumeSet <= volumeMin) {
            volume = volumeMin;
        } else if (newVolumeSet >= volumeMax) {
            volume = volumeMax;
        } else volume = newVolumeSet;
    }

    public void increaseRadioNum() {
        if (radioNum < 9) {
            radioNum = radioNum + 1;
        } else radioNum = 0;
    }

    public void decreaseRadioNum() {
        if (radioNum > 0) {
            radioNum = radioNum - 1;
        } else radioNum = 9;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        } else volume = 100;
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        } else volume = 0;
    }
}