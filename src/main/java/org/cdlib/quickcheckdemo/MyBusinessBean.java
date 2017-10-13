package org.cdlib.quickcheckdemo;

import java.util.EnumSet;
import java.util.Set;
import org.cdlib.quickcheckdemo.model.Patron;
import org.cdlib.quickcheckdemo.model.PatronType;

public class MyBusinessBean {

    private final Set<PatronType> UCB_PATRON_VIPS = EnumSet.of(PatronType.Faculty, PatronType.PostDoc);
    private final Set<PatronType> UCLA_PATRON_VIPS = EnumSet.of(PatronType.Faculty);

    /**
     * <ul>
     * <li>Except for UCB and UCLA, any patron is eligible except for
     * Guests.</li>
     * <li>For UCB, only Faculty and PostDoc are eligible.</li>
     * <li>For UCLA, only Faculty are eligible.</li>
     * <li>To repeat, Guests are never eligible.</li>
     * </ul>
     *
     * @param patron
     * @return
     */
    public boolean isPatronEligibleForCDLService(Patron patron) {
        switch (patron.getCampus()) {
            case UCLA:
                return UCLA_PATRON_VIPS.contains(patron.getType());
            case UCB:
                return UCB_PATRON_VIPS.contains(patron.getType());
            default:
                return patron.getType() != PatronType.Guest;
        }
    }
}
