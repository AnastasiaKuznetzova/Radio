package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldincreaseSound() {
        Radio radio=new Radio();
        radio.setCurrentSoundVolume(7);
        radio.setMaxSoundVolume(10);
        radio.setMinSoundVolume(0);
        radio.increaseSound();
        int expected = 8;

        assertEquals(expected, radio.getCurrentSoundVolume());

    }
    @Test
    void shouldincreaseSound2() {
        Radio radio=new Radio();
        radio.setCurrentSoundVolume(11);
        radio.setMaxSoundVolume(10);
        radio.setMinSoundVolume(0);
        radio.increaseSound();
        int expected = 10;

        assertEquals(expected, radio.getCurrentSoundVolume());

    }
    @Test
    void shoulddecreaseSound() {
        Radio radio=new Radio();
        radio.setCurrentSoundVolume(10);
        radio.setMaxSoundVolume(10);
        radio.setMinSoundVolume(0);
        radio.decreaseSound();
        int expected = 9;

        assertEquals(expected, radio.getCurrentSoundVolume());

    }
    @Test
    void shoulddecreaseSound2() {
        Radio radio=new Radio();
        radio.setCurrentSoundVolume(-1);
        radio.setMaxSoundVolume(10);
        radio.setMinSoundVolume(0);
        radio.decreaseSound();
        int expected = 0;

        assertEquals(expected, radio.getCurrentSoundVolume());

    }
    @Test
    void shouldprevRadioStation() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(6);
        radio.prevRadioStation();
        int expected = 5;

        assertEquals(expected, radio.getCurrentRadioStation());
    }
    @Test
    void shouldprevRadioStation2() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(-1);
        radio.prevRadioStation();
        int expected = 9;

        assertEquals(expected, radio.getCurrentRadioStation());
    }
    @Test
    void shouldnnextRadioStation () {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(7);
        radio.nextRadioStation();
        int expected = 8;

        assertEquals(expected, radio.getCurrentRadioStation());
    }
    @Test
    void shouldnnextRadioStation2 () {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(10);
        radio.nextRadioStation();
        int expected = 0;

        assertEquals(expected, radio.getCurrentRadioStation());
    }
}