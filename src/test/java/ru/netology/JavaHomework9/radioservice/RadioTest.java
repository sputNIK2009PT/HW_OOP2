package ru.netology.JavaHomework9.radioservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radioservice.Radio;

public class RadioTest {

    @Test
    // переключения станции кнопкой "-" (допустимые номера станций)
    public void shouldClickPrevRadio() {
        Radio radio = new Radio();
        radio.setRadioNum(6);
        radio.decreaseRadioNum();
        int expected = 5;
        int actual = radio.getRadioNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // переключения станции кнопкой "+" (допустимые номера станций)
    public void shouldClickNextRadio() {
        Radio radio = new Radio();
        radio.setRadioNum(4);
        radio.increaseRadioNum();
        int expected = 5;
        int actual = radio.getRadioNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // переключение станции кнопкой "+" (максимальное значение номера станции)
    public void shouldNotClickRadioAboveMax() {
        Radio radio = new Radio();
        radio.setRadioNum(9);
        radio.increaseRadioNum();
        int expected = 0;
        int actual = radio.getRadioNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // переключение станции кнопкой "-" (минимальное значение номера станции)
    public void shouldNotClickRadioUnderMin() {
        Radio radio = new Radio();
        radio.setRadioNum(0);
        radio.decreaseRadioNum();
        int expected = 9;
        int actual = radio.getRadioNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //прямое указание номера станции
    public void shouldSetRadioNum() {
        Radio radio = new Radio();
        radio.setRadioNum(8);
        int expected = 8;
        int actual = radio.getRadioNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // граничные значения (установка номера станции напрямую)
    public void shouldNotSetRadioAboveMax() {
        Radio radio = new Radio();
        radio.setRadioNum(10);
        int expected = 0; // ноль потому что ничего не должно измениться (далее тот же смысл)
        int actual = radio.getRadioNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // граничные значения (установка номера станции напрямую)
    public void shouldNotSetRadioUnderMin() {
        Radio radio = new Radio();
        radio.setRadioNum(-1);
        int expected = 0;
        int actual = radio.getRadioNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // переключение звука кнопкой "+" (допустимые значения громкости)
    public void shouldClickNextVolume() {
        Radio radio = new Radio();
        radio.setVolume(35);
        radio.increaseVolume();
        int expected = 36;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // переключение звука кнопкой "-" (допустимые значения громкости)
    public void shouldClickPrevVolume() {
        Radio radio = new Radio();
        radio.setVolume(41);
        radio.decreaseVolume();
        int expected = 40;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // переключения звука кнопкой "+" (максимальное значение)
    public void shouldNotClickNextVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // переключения звука кнопкой "-" (минимальное значение)
    public void shouldNotClickPrevVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}