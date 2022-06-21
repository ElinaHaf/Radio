package ru.netology.radio;

public class Radio {


    public int getCurrentRadioStation;

    public void setSwitchingStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            newCurrentRadioStation = 9;
        }
        if (newCurrentRadioStation > 9) {
            newCurrentRadioStation = 0;
        }
        else {
            newCurrentRadioStation = newCurrentRadioStation+0;
        }
        getCurrentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentNextRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 9) {
            newCurrentRadioStation = newCurrentRadioStation + 1;
        }
        if (newCurrentRadioStation >= 9) {
            newCurrentRadioStation = 0;
        }
        getCurrentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentPrevRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation <= 9 && newCurrentRadioStation >= 0) {
            newCurrentRadioStation = newCurrentRadioStation - 1;
        }
        if (newCurrentRadioStation < 0) {
            newCurrentRadioStation = 9;
        }
        if (newCurrentRadioStation > 9){
            newCurrentRadioStation = 0;
        }
        getCurrentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentVolume;

    public void increaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 10 && newCurrentVolume >= 0) {
            newCurrentVolume = newCurrentVolume + 1;
        }
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        getCurrentVolume = newCurrentVolume;
    }

    public void increasePrevVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 10 && newCurrentVolume >= 0) {
            newCurrentVolume = newCurrentVolume - 1;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        getCurrentVolume = newCurrentVolume;
    }


}

