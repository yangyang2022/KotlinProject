package com.yangyang.demo1

/**
 * Created by syy on 2017/4/27.
 */

fun main(args: Array<String>) {
	Derived(BaseImpl(10)).print()
}

interface Base{
	fun print()
}
class BaseImpl(val x:Int):Base{
	override fun print() {
		println("baseimple ... "+x)
	}
}
class Derived(b:Base):Base by b
