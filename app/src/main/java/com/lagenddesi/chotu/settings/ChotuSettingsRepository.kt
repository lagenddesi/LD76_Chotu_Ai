package com.lagenddesi.chotu.settings

class ChotuSettingsRepository(
    private val configRepository: ChotuConfigRepository
) {

    fun getSettings(): ChotuSettings {
        return ChotuSettingsMapper.fromConfig(
            configRepository.getConfig()
        )
    }

    fun saveSettings(settings: ChotuSettings) {
        configRepository.saveConfig(
            ChotuSettingsMapper.toConfig(settings)
        )
    }
}
