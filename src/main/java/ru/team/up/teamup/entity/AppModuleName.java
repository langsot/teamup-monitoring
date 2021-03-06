package ru.team.up.teamup.entity;

import java.util.Random;

/**
 * @author Степан Глущенко
 * Имена модулей приложения, которые будут принимать парамтеры от системы SUP.
 */

@Deprecated
public enum AppModuleName {
    TEAMUP_CORE_AUTH,
    TEAMUP_CORE,
    TEAMUP_DTO,
    TEAMUP_EXTERNAL,
    TEAMUP_CORE_INPUT,
    TEAMUP_KAFKA,
    TEAMUP_MONITORING;

    // Сделано для теста
    private static Random random = new Random();


    public static <T extends Enum> T getAppModule(Class<T> clazz) {
        return clazz.getEnumConstants()[random.nextInt(clazz.getEnumConstants().length)];
    }
}
