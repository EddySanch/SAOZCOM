/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.classes;

/**
 *
 * @author eddy2
 */
public class Material {

    private int id;
    private String siatel_code;
    private String ax_code;
    private String description;
    private double quantity;
    private String uom;
    private static Material instance;

    public Material() {
    }


    public Material(int id, String siatel_code, String ax_code, String description, double quantity, String uom) {
        this.id = id;
        this.siatel_code = siatel_code;
        this.ax_code = ax_code;
        this.description = description;
        this.quantity = quantity;
        this.uom = uom;
    }

    public Material(String siatel_code, String ax_code, String description, double quantity, String uom) {
        this.siatel_code = siatel_code;
        this.ax_code = ax_code;
        this.description = description;
        this.quantity = quantity;
        this.uom = uom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSiatel_code() {
        return siatel_code;
    }

    public void setSiatel_code(String siatel_code) {
        this.siatel_code = siatel_code;
    }

    public String getAx_code() {
        return ax_code;
    }

    public void setAx_code(String ax_code) {
        this.ax_code = ax_code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }



    public static Material getInstance() {
        if (instance == null) {
            instance = new Material();
        }
        return instance;
    }
}
