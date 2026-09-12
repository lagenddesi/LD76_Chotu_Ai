package com.lagenddesi.chotu.settings

object DefaultChotuSettings {

    const val ASSISTANT_NAME = "Chotu"
    const val USER_NAME = "Ustad"

    fun create(): ChotuSettings {
        return ChotuSettings(
            assistantName = ASSISTANT_NAME,
            userName = USER_NAME
        )
    }
}
