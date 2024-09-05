package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

data class Dog(
 @DrawableRes   val imageResource: Int,
 @StringRes   val name: Int,
    val age: Int,
   @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.bella,R.string.dog_name_3,2,R.string.dog_description_3),
    Dog(R.drawable.koda,R.string.dog_name_1,22,R.string.dog_description_1),
    Dog(R.drawable.leroy,R.string.dog_name_2,12,R.string.dog_description_2),
    Dog(R.drawable.bella,R.string.dog_name_4,5,R.string.dog_description_4),
    Dog(R.drawable.bella, R.string.dog_name_6, 14, R.string.dog_description_6),
    Dog(R.drawable.leroy, R.string.dog_name_9, 4, R.string.dog_description_9),
    Dog(R.drawable.koda, R.string.dog_name_7, 2, R.string.dog_description_7),
)