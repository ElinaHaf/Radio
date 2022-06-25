package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldChangeQuantityStation7() {
        Radio station = new Radio(7);

        Assertions.assertEquals(6, station.getMaxStation());
        Assertions.assertEquals(0, station.getMinStation());
    }

    @Test
    public void shouldChangeQuantityStation5() {
        Radio station = new Radio(5);

        Assertions.assertEquals(4, station.getMaxStation());
        Assertions.assertEquals(0, station.getMinStation());
    }

    @Test
    public void shouldChangeQuantityStation1() {
        Radio station = new Radio(1);

        Assertions.assertEquals(0, station.getMaxStation());
        Assertions.assertEquals(0, station.getMinStation());
    }

    @Test
    public void shouldNotChangeStationAboveTen() {
        Radio station = new Radio(12);

        int expected = 10;
        int actual = station.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotChangeStationAboveNull() {
        Radio station = new Radio(0);

        int expected = 10;
        int actual = station.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxStation() {
        Radio station = new Radio();

        int expected = 9;
        int actual = station.getMaxStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinStation() {
        Radio station = new Radio();


        int expected = 0;
        int actual = station.getMinStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio station = new Radio();

        int expected = 0;
        int actual = station.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStation0() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);

        int expected = 0;
        int actual = station.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationLessMinStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = station.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStationMoreMaxStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(10);

        int expected = 0;
        int actual = station.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetStation9() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);

        int expected = 9;
        int actual = station.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMin() {
        Radio station = new Radio();


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
    public void shouldSetStationWithinTheRange() {
        Radio station = new Radio();
        station.setCurrentRadioStation(7);

        station.setIncreaseNextStation();

        int expected = 8;
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
        Radio station = new Radio(7);
        station.setCurrentRadioStation(6);

        station.setIncreaseNextStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio station = new Radio(3);
        station.setCurrentRadioStation(2);

        station.setIncreasePrevStation();


        int expected = 1;
        int actual = station.getCurrentRadioStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(100);


        int expected = 100;
        int actual = station.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio station = new Radio();

        station.setCurrentVolume(0);

        int expected = 0;
        int actual = station.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio station = new Radio();

        station.setCurrentVolume(101);

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
    public void shouldSetVolumeOn100() {
        Radio station = new Radio();
        station.setCurrentVolume(100);

        station.setIncreaseNextVolume();


        int expected = 100;
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

