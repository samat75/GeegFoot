package com.example.geegfoot.ui

import android.util.Log
import com.example.geegfoot.core.BaseActivity
import com.example.geegfoot.core.BaseVM
import com.google.firebase.FirebaseException
import com.google.firebase.FirebaseTooManyRequestsException
import com.google.firebase.auth.*
import java.util.concurrent.TimeUnit

class AuthVm: BaseVM() {
    var credential: PhoneAuthCredential?=null
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()
    fun checkUser(number:Int,activity: BaseActivity){
        val options = PhoneAuthOptions.newBuilder(auth)
            .setPhoneNumber("+996552250702")
            .setTimeout(60L, TimeUnit.SECONDS)
            .setActivity(activity)
            .setCallbacks(callbacks)
            .build()
        PhoneAuthProvider.verifyPhoneNumber(options)
    }

    val callbacks = object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

        override fun onVerificationCompleted(credential: PhoneAuthCredential) {
            Log.d("success", "onVerificationCompleted:$credential")
        }

        override fun onVerificationFailed(e: FirebaseException) {
            Log.w("TAG", "onVerificationFailed", e)

            if (e is FirebaseAuthInvalidCredentialsException) {
                // Invalid request
            } else if (e is FirebaseTooManyRequestsException) {
                // The SMS quota for the project has been exceeded
            }

            // Show a message and update the UI
        }

        override fun onCodeSent(
            verificationId: String,
            token: PhoneAuthProvider.ForceResendingToken
        ) {

            Log.d("gjkdf", "onCodeSent:$verificationId")

            val storedVerificationId = verificationId
            val resendToken = token
            credential = PhoneAuthProvider.getCredential(verificationId,543.toString() )
        }
    }
}