package com.lagenddesi.chotu.settings

class ChotuSettingsProvider(
    private val repository: ChotuSettingsRepository
) {

    fun currentSettings(): ChotuSettings {
        return repository.getSettings()
    }
}
