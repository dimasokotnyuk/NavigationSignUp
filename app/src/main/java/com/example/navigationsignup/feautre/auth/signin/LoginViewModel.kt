package com.example.navigationsignup.feautre.auth.signin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.navigationsignup.data.repository.AuthRepository

class LoginViewModel : ViewModel() {

    val loginValidationLiveData: MutableLiveData<Boolean> = MutableLiveData()
    val loginLiveData: MutableLiveData<Boolean> = MutableLiveData()

    private val authRepository: AuthRepository by lazy { AuthRepository() }

    fun login(email: String, password: String) {
        if (email.isEmpty() or password.isEmpty()) {
            loginValidationLiveData.value = false
        } else {
            authRepository.login(email, password)
        }
    }
}