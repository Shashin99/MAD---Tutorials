package com.example.tutorial04sample.models

import com.example.tutorial04sample.models.validations.ValidationResult

class FormData (
    private var studentID:String,
    private var year:String,
    private var semester:String,
    private var agree:Boolean

    )   {
            fun validateStudentID():ValidationResult{
                return if(studentID.isEmpty()){
                    ValidationResult.Empty("Student ID is Empty")
                }else if(!studentID.startsWith("IT" )){
                    ValidationResult.Invalid("Should be starting with IT")

                }else if(studentID.length<10){
                    ValidationResult.Invalid("Student ID should have 10 characters")
                }else if(studentID.length>10){
                    ValidationResult.Invalid("Student ID should have 10 characters")
                }else{
                    ValidationResult.Valid
                }
            }

            fun validateYear():ValidationResult{
                return if(year.isEmpty()){
                    ValidationResult.Empty("Year is Empty")
                }else{
                    ValidationResult.Valid
                }

            }

            fun validateSemester():ValidationResult{
                return if(semester.isEmpty()){
                    ValidationResult.Empty("Semester is Empty")
                }else{
                    ValidationResult.Valid
                }
            }

            fun validateAgreement():ValidationResult{
                return if(!agree){
                    ValidationResult.Invalid("You must agree for the terms and conditions")
                }else{
                    ValidationResult.Valid
                }
            }
}
