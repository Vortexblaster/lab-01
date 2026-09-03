package com.example.petshop

class Sad(mood: String): Mood(mood) {
    override fun checkMood(): String {
        return "Sad"
    }
}