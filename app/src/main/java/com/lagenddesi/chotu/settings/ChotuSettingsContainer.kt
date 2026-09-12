package com.lagenddesi.chotu.settings

import android.content.Context

class ChotuSettingsContainer(
    context: Context
) {

    private val preferencesStore = SharedPreferencesChotuPreferencesStore(context)

    private val configRepository = ChotuConfigRepository(
        preferencesStore = preferencesStore
    )

    private val settingsRepository = ChotuSettingsRepository(
        configRepository = configRepository
    )

    val provider = ChotuSettingsProvider(
        repository = settingsRepository
    )

    fun save(settings: ChotuSettings) {
        settingsRepository.saveSettings(settings)
    }
}
