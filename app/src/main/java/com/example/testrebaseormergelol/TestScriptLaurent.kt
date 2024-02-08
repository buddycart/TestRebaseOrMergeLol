package com.example.testrebaseormergelol


    private lateinit var nameOfFood:String

    fun main(){
        nameOfFood="Ramen"
        for (i in 1..7){
            if(i <=4){
                println("$nameOfFood - $i")
            }
        }
        repeat(4){
            for (letter in nameOfFood){
                println(letter)
            }
        }
        repeat(3){
            for (letter in nameOfFood.reversed()){
                println(letter)
            }
            println()
        }

    }


