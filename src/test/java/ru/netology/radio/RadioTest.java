package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(8);

        int expected = 8;
        int actual = station.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxStation() {
        Radio station = new Radio();

        station.setToMaxStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinStation() {
        Radio station = new Radio();

        station.setToMinStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio station = new Radio();

        station.setCurrentRadioStation(10);

        int expected = 0;
        int actual = station.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMin() {
        Radio station = new Radio();

        station.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = station.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOnNine() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);

        station.setIncreaseNextStation();


        int expected = 0;
        int actual = station.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationOnNull() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);

        station.setIncreasePrevStation();


        int expected = 9;
        int actual = station.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(5);

        station.setIncreaseNextStation();


        int expected = 6;
        int actual = station.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(2);

        station.setIncreasePrevStation();


        int expected = 1;
        int actual = station.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio station = new Radio();

        station.setToMaxVolume();

        int expected = 10;
        int actual = station.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio station = new Radio();

        station.setToMinVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio station = new Radio();

        station.setCurrentVolume(11);

        int expected = 0;
        int actual = station.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMin() {
        Radio station = new Radio();

        station.setCurrentVolume(-1);

        int expected = 0;
        int actual = station.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOnTen() {
        Radio station = new Radio();
        station.setCurrentVolume(10);

        station.setIncreaseNextVolume();


        int expected = 10;
        int actual = station.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeOnNull() {
        Radio station = new Radio();
        station.setCurrentVolume(0);

        station.setIncreasePrevVolume();


        int expected = 0;
        int actual = station.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(5);

        station.setIncreaseNextVolume();


        int expected = 6;
        int actual = station.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(2);

        station.setIncreasePrevVolume();


        int expected = 1;
        int actual = station.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }


}

