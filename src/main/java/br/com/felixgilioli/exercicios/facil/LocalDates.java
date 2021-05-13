package br.com.felixgilioli.exercicios.facil;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Classe com métodos para trabalhar com objetos do tipo {@link java.time.LocalDate}.
 */
public class LocalDates {

    private LocalDates() {}

    /**
     * Deve retornar a quantidade de dias que se passaram entre as datas {@param inicio} e {@param fim}.
     * @param inicio data de início.
     * @param fim data de fim.
     * @return quantidade de dias entre as datas.
     */
    public static long getQuantidadeDeDiasEntreDatas(LocalDate inicio, LocalDate fim) {
        return Math.abs(ChronoUnit.DAYS.between(inicio, fim));
    }
}
