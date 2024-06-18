package br.com.teamcubation.apifootball.model;

public enum Estado {
    AC, AL, AP, AM, BA, CE, DF, ES, GO, MA, MT, MS, MG, PA, PB, PR, PE, PI, RJ, RN, RS, RO, RR, SC, SP, SE, TO;

    public static boolean isValid(String estado) {
        try {
            Estado.valueOf(estado);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
