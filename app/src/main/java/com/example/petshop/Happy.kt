package com.example.petshop

class Happy(mood: String): Mood(mood) {
    override fun checkMood(): String {
        return "Happy"
    }
}