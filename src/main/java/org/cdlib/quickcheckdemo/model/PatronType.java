package org.cdlib.quickcheckdemo.model;

import java.util.Arrays;
import org.quicktheories.core.Gen;
import org.quicktheories.generators.Generate;

public enum PatronType {

    Undergraduate,
    Graduate,
    PostDoc,
    Faculty,
    Staff,
    Guest;

    public static class Generator {

        public static Gen<PatronType> all() {
            return Generate.pick(Arrays.asList(PatronType.values()));
        }
    }
}
