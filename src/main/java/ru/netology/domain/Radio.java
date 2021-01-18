package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int currentSoundVolume;
    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private boolean on;

    public Radio(int currentRadioStation, int maxRadioStation, int minRadioStation, int currentSoundVolume, int maxSoundVolume, int minSoundVolume, boolean on) {
        this.currentRadioStation = currentRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
        this.currentSoundVolume = currentSoundVolume;
        this.maxSoundVolume = maxSoundVolume;
        this.minSoundVolume = minSoundVolume;
        this.on = on;
    }

    public Radio() {
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseSound() {
        if (currentSoundVolume < maxSoundVolume) {
            currentSoundVolume++;
        } else {
            currentSoundVolume = maxSoundVolume;
        }
    }

    public void decreaseSound() {
        if (currentSoundVolume > minSoundVolume) {
            currentSoundVolume--;
        } else {
            currentSoundVolume = minSoundVolume;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;

        } else {
            currentRadioStation = maxRadioStation;
        }

    }

    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }
}

