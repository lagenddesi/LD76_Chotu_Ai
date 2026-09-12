package com.lagenddesi.chotu.settings

object ChotuConfigMapper {

    fun fromPreferences(preferences: ChotuPreferences): ChotuConfig {
        return ChotuConfig(
            assistantName = preferences.assistantName,
            userName = preferences.userName
        )
    }

    fun toPreferences(config: ChotuConfig): ChotuPreferences {
        return ChotuPreferences(
            assistantName = config.assistantName,
            userName = config.userName
        )
    }
}
