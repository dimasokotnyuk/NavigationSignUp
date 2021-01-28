package com.example.navigationsignup.data.repository

import com.example.navigationsignup.data.database.module.AuthDatabaseModule
import com.example.navigationsignup.data.network.module.AuthNetworkModule

class AuthRepository {

    private val networkModule: AuthNetworkModule by lazy { AuthNetworkModule() }

    private val databaseModule: AuthDatabaseModule by lazy { AuthDatabaseModule() }

    fun login(email: String, password: String) {
        networkModule.login(email, password)
        databaseModule.saveUserData()
    }
}