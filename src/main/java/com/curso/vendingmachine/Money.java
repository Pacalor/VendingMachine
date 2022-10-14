/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.vendingmachine;

/**
 *
 * @author dpadilla
 */
public enum Money {
    ONECENT(0.01f),
    TWOCENT(0.02f),
    FIVECENT(0.05f),
    TENCENT(0.10f),
    TWENTYCENT(0.20f),
    FIFTYCENT(0.50f),
    ONEEUR(1.0f),
    TWOEUR(2.0f);

    private float value;

    private Money(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public boolean isEqual(float f) {
        return value == f;
    }
}
