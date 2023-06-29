package com.example.tutorial04sample.models.validations

sealed class ValidationResult{
    data class Empty(val errorMessage:String):ValidationResult()
    data class Invalid(val errorMessage:String):ValidationResult()
    object Valid:ValidationResult()
}



