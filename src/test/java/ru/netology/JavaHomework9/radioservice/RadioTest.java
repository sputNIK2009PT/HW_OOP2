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
    //Задание количества станций
    public void shouldSetRadioSize() {
        Radio radio = new Radio(20);
        int expected = 20;
        int actual = radio.getRadioSize();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //задание количества станций (нулевое значение)
    public void shouldNotSetRadioSizeMin() {
        Radio radio = new Radio(0);
        int expected = 10; // кол-во станций по умолчанию = 10
        int actual = radio.getRadioSize();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    //задание максимальног номера станции в зависимости от количества станций
    public void shouldSetRadioMaxBySize() {
        Radio radio = new Radio(20);
        int expected = 19;
        int actual = radio.getRadioMax();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // Количество станций не задается, количество станций по умолчанию 10,максимальная станция №9
    public void shouldNotSetMaxSize() {
        Radio radio = new Radio();
        int expectedSize = 10;
        int actualSize = radio.getRadioSize();
        int expectedRadioMax = 9;
        int actualRadioMax = radio.getRadioMax();
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedRadioMax, actualRadioMax);
    }


    @Test
    // проверка граничных значений (задане номера станции напрямую при указании каоличества станций)
    public void shouldNotSetRadioAboveMaxSize() {
        Radio radio = new Radio(12);
        radio.setRadioNum(13);
        int expected = 0; // т.к не должно изменяться
        int actual = radio.getRadioNum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    // переключения станций кнопкой "+" при максимальном значении номера станции (установлено кол-во станций)
    public void shouldNotClickRadioAboveMaxSize() {
        Radio radio = new Radio(18);
        radio.setRadioNum(17);
        radio.increaseRadioNum();
        int expected = 0;
        int actual = radio.getRadioNum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    // переключения станции кнопкой "-" при минимальном значении номера станции (установлено кол-во станций)
    public void shouldNotClickRadioUnderMinSize() {
        Radio radio = new Radio(21);
        radio.setRadioNum(0);
        radio.decreaseRadioNum();
        int expected = 20;
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