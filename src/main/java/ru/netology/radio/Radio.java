package ru.netology.radio;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int radioStation = 10;
    private int currentRadioStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int radioStation) {
        this.maxStation = getMinStation() + radioStation - 1;
        this.minStation = getMinStation();
    }


    public Radio() {
        this.maxStation = getMaxStation();
        this.minStation = getMinStation();
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minStation) {
            return;
        }
        if (newCurrentRadioStation > maxStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }


    public void setIncreaseNextStation() {
        if (currentRadioStation < maxStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = getMinStation();
        }
    }

    public void setIncreasePrevStation() {
        if (currentRadioStation > minStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = getMaxStation();
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setIncreaseNextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = getMaxVolume();
        }
    }

    public void setIncreasePrevVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = getMinVolume();
        }
    }


}