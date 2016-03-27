package com.mckay.dip.bad;

/**
 * Created by Jason McKay on 2016/03/23.
 *
 * this is the high level class which works fine until
 * you need to add another type of worker class (low level class)
 * then the high level ManagerDipBad class needs to be modified.
 * Still more work needs to be done to this class to make it function correctly.
 */
public class ManagerDipBad
{
    WorkerDipBad worker;
    SuperWorkerDipBad superWorker;
    public void setWorker(WorkerDipBad worker) {
        this.worker = worker;
    }

    public void setSuperWorker(SuperWorkerDipBad superWorker) {
        this.superWorker = superWorker;
    }

    public void manage()
    {
        worker.work();
    }
}
