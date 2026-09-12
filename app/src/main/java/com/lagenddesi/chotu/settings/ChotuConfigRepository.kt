package com.lagenddesi.chotu.settings

class ChotuConfigRepository(
    private val preferencesStore: ChotuPreferencesStore
) {

    fun getConfig(): ChotuConfig {
        return ChotuConfigMapper.fromPreferences(
            preferencesStore.getPreferences()
        )
    }

    fun saveConfig(config: ChotuConfig) {
        preferencesStore.savePreferences(
            ChotuConfigMapper.toPreferences(config)
        )
    }
}
