package com.lagenddesi.chotu.settings

class ChotuConfigProvider(
    private val repository: ChotuConfigRepository
) {

    fun currentConfig(): ChotuConfig {
        return repository.getConfig()
    }
}
