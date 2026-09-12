package com.lagenddesi.chotu.settings

import android.content.Context

class SharedPreferencesChotuPreferencesStore(
    context: Context
) : ChotuPreferencesStore {

    private val preferences = context.getSharedPreferences(
        FILE_NAME,
        Context.MODE_PRIVATE
    )

    override fun getPreferences(): ChotuPreferences {
        return ChotuPreferences(
            assistantName = preferences.getString(
                KEY_ASSISTANT_NAME,
                DefaultChotuSettings.ASSISTANT_NAME
            ).orEmpty().ifBlank {
                DefaultChotuSettings.ASSISTANT_NAME
            },
            userName = preferences.getString(
                KEY_USER_NAME,
                DefaultChotuSettings.USER_NAME
            ).orEmpty().ifBlank {
                DefaultChotuSettings.USER_NAME
            }
        )
    }

    override fun savePreferences(preferences: ChotuPreferences) {
        this.preferences.edit()
            .putString(KEY_ASSISTANT_NAME, preferences.assistantName)
            .putString(KEY_USER_NAME, preferences.userName)
            .apply()
    }

    private companion object {
        const val FILE_NAME = "chotu_preferences"
        const val KEY_ASSISTANT_NAME = "assistant_name"
        const val KEY_USER_NAME = "user_name"
    }
}
