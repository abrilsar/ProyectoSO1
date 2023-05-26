/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoso1;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Abril
 */
public class VehiclePlant {
    private String name;
    private int maxWorkerQty;
    private Worker[] workers;
    private long dayDuration;
    public WareHouse wareHouse;
    public Semaphore mutex;
}
