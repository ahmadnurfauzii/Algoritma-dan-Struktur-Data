/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author FAUZI
 */
public class th2020<T> {
    T data;
    th2020<T> next;

    public th2020(T data, th2020<T> next) {
        this.data = data;
        this.next = next;
    }
}
