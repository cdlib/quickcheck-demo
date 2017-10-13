package org.cdlib.quickcheckdemo;

import org.cdlib.quickcheckdemo.model.Campus;
import org.cdlib.quickcheckdemo.model.Patron;
import org.cdlib.quickcheckdemo.model.PatronType;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import static org.quicktheories.QuickTheory.qt;

public class MyBusinessBeanTest {

    MyBusinessBean service;

    @Before
    public void setup() {
        service = new MyBusinessBean();
    }

    @Test
    public void allFacultyAreEligible() {
        qt()
                .forAll(Campus.Generator.all(), PatronType.Generator.only(PatronType.Faculty))
                .check((campus, type)
                        -> service.isPatronEligibleForCDLService(new Patron(campus, type))
                );
    }

    @Test
    public void guestsAreNeverEligible() {
        qt()
                .forAll(Campus.Generator.all(), PatronType.Generator.only(PatronType.Guest))
                .check((campus, type)
                        -> !service.isPatronEligibleForCDLService(new Patron(campus, type))
                );
    }

    @Test
    public void postDocsAreOnlyEligibleAtBerkeley() {
        qt()
                .forAll(Campus.Generator.except(Campus.UCB), PatronType.Generator.only(PatronType.PostDoc))
                .check((campus, type)
                        -> !service.isPatronEligibleForCDLService(new Patron(campus, type))
                );
        assertTrue(service.isPatronEligibleForCDLService(new Patron(Campus.UCB, PatronType.PostDoc)));
    }

}
