package com.yangyang.utils

fun printarray(array: Array<out Any>){
	array.forEach{e->print(e.toString()+" ,")}
	println()
}
fun printColl(coll:Collection<Any>){
	coll.forEach {e->print(e.toString()+" ,")  }
	println()
}