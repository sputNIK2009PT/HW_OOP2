package ru.netology.radioservice;

public class Radio {
    private int radioNum;
    private int volume;
    private int radioSize = 10;
    private int radioNumMin = 0;
    private int radioNumMax = radioSize - 1;
    public int volumeMin = 0;
    public int volumeMax = 100;

    public Radio(int radioSize) {
        if (radioSize > 0) {
            this.radioSize = radioSize;
            this.radioNumMax = radioSize - 1;
        }
    }
    public Radio() {
        this.radioSize = getRadioSize();
    }

    public int getRadioSize() {
        return radioSize;
    }

    public int getRadioMax() {
        return radioNumMax;
    }

    public int getRadioNum() {
        return radioNum;
    }

    public void setRadioNum(int newRadioNum) {
        if (newRadioNum < radioNumMin || newRadioNum > radioNumMax) {
            return;
        } else {
            radioNum = newRadioNum;
        }
    }
       public void increaseRadioNum() {
        if (radioNum < radioNumMax) {
            radioNum = radioNum + 1;
        } else radioNum = radioNumMin;
    }

    public void decreaseRadioNum() {
        if (radioNum > 0) {
            radioNum = radioNum - 1;
        } else radioNum = radioNumMax;
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

    public void increaseVolume() {
        if (volume < volumeMax) {
            volume = volume + 1;
        } else volume = volumeMax;
    }

    public void decreaseVolume() {
        if (volume > volumeMin) {
            volume = volume - 1;
        } else volume = volumeMin;
    }
}