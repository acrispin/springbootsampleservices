/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anton.dev.sbss.bean;

/**
 *
 * @author anton
 */
public class MultiplyEntity {

    //id of the multiply operation
    private final long id;

    //result of the multiply operation
    int result;

    //getters and setters
    public long getId() {
        return id;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    /**
     * The object will be constructed in the controller
     *
     * @param id of the multiply operation
     * @param result result of the multiply operation
     */
    public MultiplyEntity(long id, int result) {
        this.id = id;
        this.result = result;
    }
}
