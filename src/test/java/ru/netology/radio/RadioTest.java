package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSwitchingRadioStation() {
        Radio station = new Radio();

        station.setSwitchingStation(8);

        int expected = 8;
        int actual = station.getCurrentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingRadioStation0() {
        Radio station = new Radio();

        station.setSwitchingStation(0);

        int expected = 0;
        int actual = station.getCurrentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchingRadioStation9() {
        Radio station = new Radio();

        station.setSwitchingStation(9);

        int expected = 9;
        int actual = station.getCurrentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchingRadioStation10() {
        Radio station = new Radio();

        station.setSwitchingStation(10);

        int expected = 0;
        int actual = station.getCurrentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingRadioStationMore9() {
        Radio station = new Radio();

        station.setSwitchingStation(80);

        int expected = 0;
        int actual = station.getCurrentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchingRadioStation1() {
        Radio station = new Radio();

        station.setSwitchingStation(1);

        int expected = 1;
        int actual = station.getCurrentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchingRadioStationMinus1() {
        Radio station = new Radio();

        station.setSwitchingStation(-1);

        int expected = 9;
        int actual = station.getCurrentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchingRadioStationLess0() {
        Radio station = new Radio();

        station.setSwitchingStation(-12);

        int expected = 9;
        int actual = station.getCurrentRadioStation;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldCurrentNextRadioStation() {
        Radio station = new Radio();

        station.setCurrentNextRadioStation(5);

        int expected = 6;
        int actual = station.getCurrentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNextRadioStation9() {
        Radio station = new Radio();

        station.setCurrentNextRadioStation(9);

        int expected = 0;
        int actual = station.getCurrentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentNextRadioStation0() {
        Radio station = new Radio();

        station.setCurrentNextRadioStation(0);

        int expected = 1;
        int actual = station.getCurrentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentPrevRadioStation() {
        Radio station = new Radio();

        station.setCurrentPrevRadioStation(5);

        int expected = 4;
        int actual = station.getCurrentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentPrevRadioStationBefore0() {
        Radio station = new Radio();

        station.setCurrentPrevRadioStation(-12);

        int expected = 9;
        int actual = station.getCurrentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentPrevRadioStation0() {
        Radio station = new Radio();

        station.setCurrentPrevRadioStation(0);

        int expected = 9;
        int actual = station.getCurrentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentPrevRadioStation9() {
        Radio station = new Radio();

        station.setCurrentPrevRadioStation(9);

        int expected = 8;
        int actual = station.getCurrentRadioStation;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentPrevRadioStation10() {
        Radio station = new Radio();

        station.setCurrentPrevRadioStation(10);

        int expected = 0;
        int actual = station.getCurrentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNextVolumeAfter10() {
        Radio station = new Radio();

        station.increaseVolume(80);

        int expected = 10;
        int actual = station.getCurrentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentNextVolume11() {
        Radio station = new Radio();

        station.increaseVolume(11);

        int expected = 10;
        int actual = station.getCurrentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNextVolumeBefore0() {
        Radio station = new Radio();

        station.increaseVolume(-12);

        int expected = 0;
        int actual = station.getCurrentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentNextVolume0() {
        Radio station = new Radio();

        station.increaseVolume(0);

        int expected = 1;
        int actual = station.getCurrentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNextVolume() {
        Radio station = new Radio();

        station.increaseVolume(5);

        int expected = 6;
        int actual = station.getCurrentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentPrevVolumeAfter10() {
        Radio station = new Radio();

        station.increasePrevVolume(120);

        int expected = 10;
        int actual = station.getCurrentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentPrevVolumeBefore0() {
        Radio station = new Radio();

        station.increasePrevVolume(-8);

        int expected = 0;
        int actual = station.getCurrentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentPrevVolume() {
        Radio station = new Radio();

        station.increasePrevVolume(5);

        int expected = 4;
        int actual = station.getCurrentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentPrevVolume10() {
        Radio station = new Radio();

        station.increasePrevVolume(10);

        int expected = 9;
        int actual = station.getCurrentVolume;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentPrevVolume0() {
        Radio station = new Radio();

        station.increasePrevVolume(0);

        int expected = 0;
        int actual = station.getCurrentVolume;

        Assertions.assertEquals(expected, actual);
    }


}
