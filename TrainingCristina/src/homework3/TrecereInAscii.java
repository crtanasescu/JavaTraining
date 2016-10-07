package homework3;

import java.util.Arrays;

/**
 * Created by KiKI on 24.09.2016.
 */
public class TrecereInAscii {
    char[] sirCaracterePropozitie;
    int[] vectorAscii;

    public TrecereInAscii(String propozitie) {
        this.sirCaracterePropozitie = propozitie.toCharArray();
    }

    public int[] transformare() {
        vectorAscii = new int[sirCaracterePropozitie.length];
        for (int i = 0; i < sirCaracterePropozitie.length; i++) {
            vectorAscii[i] = (int) sirCaracterePropozitie[i];
        }
        return vectorAscii;
    }

}
