package com.lagenddesi.chotu.settings

class InMemoryChotuPreferencesStore(
    initialPreferences: ChotuPreferences = ChotuPreferences()
) : ChotuPreferencesStore {

    private var preferences = initialPreferences

    override fun getPreferences(): ChotuPreferences {
        return preferences
    }

    override fun savePreferences(preferences: ChotuPreferences) {
        this.preferences = preferences
    }
}
