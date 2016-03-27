package com.mckay.dip.good;

/**
 * Created by Jason McKay on 2016/03/23.
 */
public class ManagerDipGood
{
    WorkerServiceDipGood worker;

    public void setWorker(WorkerServiceDipGood worker) {
        this.worker = worker;
    }

    public void manage()
    {
        worker.work();
    }
}
