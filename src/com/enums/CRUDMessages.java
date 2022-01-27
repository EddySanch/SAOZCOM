/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.enums;

/**
 *
 * @author eddy2
 */
public enum CRUDMessages {
    REGISTER_SUCCESFULLY,
    REGISTER_FAILED,
    UPDATE_SUCCESFULLY,
    UPDATE_FAILED,
    DELETE_SUCCESFULLY,
    DELETE_FAILED;

private String name;
    @Override
    public String toString() {
        return this.name;
    }
}
