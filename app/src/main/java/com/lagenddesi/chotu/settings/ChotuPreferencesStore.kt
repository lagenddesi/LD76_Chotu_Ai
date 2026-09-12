package com.lagenddesi.chotu.settings

interface ChotuPreferencesStore {

    fun getPreferences(): ChotuPreferences

    fun savePreferences(preferences: ChotuPreferences)
}
