package com.mckay;

import com.mckay.dip.bad.ManagerDipBad;
import com.mckay.dip.bad.WorkerDipBad;
import com.mckay.dip.good.ManagerDipGood;
import com.mckay.dip.good.SuperWorkerDipGood;
import com.mckay.dip.good.WorkerDipGood;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jason McKay on 2016/03/23.
 *
 *These tests are to test dependency-inversion principle
 * (DIP), states that we should couple at the abstract
 * level, not at the concrete level. we need to be able
 * to add low level classes/modules without having to
 * modify the high level classes/modules.
 */
public class DIPTest
{
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testDipBad() throws Exception {
        WorkerDipBad worker = new WorkerDipBad();
        ManagerDipBad manager = new ManagerDipBad();
        manager.setWorker(worker);
        manager.manage();
    }

    @Test
    public void testDipGood() throws Exception {
        WorkerDipGood worker = new WorkerDipGood();
        SuperWorkerDipGood superWorker = new SuperWorkerDipGood();
        ManagerDipGood manager = new ManagerDipGood();
        manager.setWorker(worker);
        manager.manage();
        manager.setWorker(superWorker);
        manager.manage();
    }
}
