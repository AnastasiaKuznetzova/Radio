package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio=new Radio();
    @Test
    void shouldincreaseSound() {
        radio.setCurrentSoundVolume(85);
        radio.increaseSound();
        int expected = 86;

        assertEquals(expected, radio.getCurrentSoundVolume());

    }
    @Test
    void shouldincreaseSound2() {
        radio.setCurrentSoundVolume(101);
        radio.increaseSound();
        int expected = 100;

        assertEquals(expected, radio.getCurrentSoundVolume());

    }
    @Test
    void shoulddecreaseSound() {
        radio.setCurrentSoundVolume(100);
        radio.decreaseSound();
        int expected = 99;

        assertEquals(expected, radio.getCurrentSoundVolume());

    }
    @Test
    void shoulddecreaseSound2() {
        radio.setCurrentSoundVolume(-1);
        radio.decreaseSound();
        int expected = 0;

        assertEquals(expected, radio.getCurrentSoundVolume());

    }
    @Test
    void shouldprevRadioStation() {
        radio.setCurrentRadioStation(6);
        radio.prevRadioStation();
        int expected = 5;

        assertEquals(expected, radio.getCurrentRadioStation());
    }
    @Test
    void shouldprevRadioStation2() {
        radio.setCurrentRadioStation(-1);
        radio.prevRadioStation();
        int expected =10;

        assertEquals(expected, radio.getCurrentRadioStation());
    }
    @Test
    void shouldnnextRadioStation () {
        radio.setCurrentRadioStation(7);
        radio.nextRadioStation();
        int expected = 8;

        assertEquals(expected, radio.getCurrentRadioStation());
    }
    @Test
    void shouldnnextRadioStation2 () {
        radio.setCurrentRadioStation(11);
        radio.nextRadioStation();
        int expected = 0;

        assertEquals(expected, radio.getCurrentRadioStation());
    }
}