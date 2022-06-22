package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public void setToMaxStation() {
        currentRadioStation = 9;
    }

    public void setToMinStation() {
        currentRadioStation = 0;
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setIncreaseNextStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            setToMinStation();
        }
    }

    public void setIncreasePrevStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            setToMaxStation();
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setIncreaseNextVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            setToMaxVolume();
        }
    }

    public void setIncreasePrevVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            setToMinVolume();
        }
    }


}