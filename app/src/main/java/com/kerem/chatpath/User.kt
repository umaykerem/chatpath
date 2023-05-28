package com.kerem.chatpath

class User {
    var name: String? = null
    var email: String? = null
    var uid: String? = null   //unique id for user

    constructor(){}
    // ? means that nullable
    constructor(name: String?, email: String?, uid: String?){
        this.name = name
        this.email = email
        this.uid = uid
    }
}