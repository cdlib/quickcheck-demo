package org.cdlib.quickcheckdemo.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;
import org.quicktheories.core.Gen;
import org.quicktheories.generators.Generate;

public enum Campus {

    UCB,
    UCD,
    UCI,
    UCLA,
    UCM,
    UCR,
    UCSB,
    UCSC,
    UCSD,
    UCSF;

    public static class Generator {

        public static Gen<Campus> all() {
            return Generate.pick(Arrays.asList(Campus.values()));
        }
        
        public static Gen<Campus> only(Campus... campuses) {
            return Generate.pick(Arrays.asList(campuses));
        }
        
        public static Gen<Campus> except(Campus... campuses) {
            Set<Campus> kept = EnumSet.allOf(Campus.class);
            kept.removeAll(Arrays.asList(campuses));
            return Generate.pick(new ArrayList(kept));
        }
        
    }

}
