package com.lagenddesi.chotu.settings

object ChotuSettingsMapper {

    fun fromConfig(config: ChotuConfig): ChotuSettings {
        return ChotuSettings(
            assistantName = config.assistantName,
            userName = config.userName
        )
    }

    fun toConfig(settings: ChotuSettings): ChotuConfig {
        return ChotuConfig(
            assistantName = settings.assistantName,
            userName = settings.userName
        )
    }
}
