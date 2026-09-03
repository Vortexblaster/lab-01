package com.example.petshop

abstract class Mood(val mood: String) {
    abstract fun checkMood(): String
}