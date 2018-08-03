/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luxoft.sanzhar.java8feature7;

/**
 *
 * @author admin
 */
public interface NewInterface {
    String FIELD2 = "fff";
    void stM2();
    /**
     * static interface methods are not supported in -source 1.7
     (use -source 8 or higher to enable static interface methods)
     */
    //static void stM2();
}
