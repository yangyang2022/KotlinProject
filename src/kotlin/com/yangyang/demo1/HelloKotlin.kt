package com.yangyang.demo1

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun main(args: Array<String>) {

//	val user = User(1,"yangyang",22)
//	val jack = user.copy(age = 33)
//	println(jack)
//	println(user)
//	val (id,name,age) = user
//	println("id is${id},name is ${name},age is ${age}")

//	println(Expr.Sum(Expr.Const(1.1),Expr.Const(2.2)))

//	val t = Box<Int>(1)
//	val tt = Box(1)
//	println("${t.value} and ${tt.value}")


//	val ints = arrayOf(1,2,3)
//	val any = Array<Any>(3){0}
//	copy(ints,any)
//	printarray(ints)
//	printarray(any)

//	val arr = arrayOf("1","2","3")
//	printarray(arr)

//	val arr = arrayOf("hello" as CharSequence)
//	printarray(arr)
//	fill(arr,"world")
//	printarray(arr)

//	Outer().Inner().boo()
//	println(foo2())


//	printvalues<RGB>()
//	println(RGB.GREEN.name+RGB.BLUE.ordinal)


// println(Example().p)
//	val lazyValue:String by lazy {
//		println("computed")
//		"hello"
//	}
//	println(lazyValue)
//	println(lazyValue)
//	println(lazyValue)

//	val user = User1()
//	user.name = "first"
//	user.name = "second"
//
//	user.age = 12
//	println(user)
//	user.age = 10
//	println(user)
//	user.age = 22
//	println(user)


//	val user = User2(mutableMapOf("name" to "yangyang","age" to 123))
//	println(user.name+" , " +user.age)




//	read(arrayOf(1,2,3,5,4))

//	B().foo()
//	membersof<StringBuilder>().forEach(::println)

//	val array = arrayOf(1,2)
//	val (a,b) = array
//	println("a is $a and $b")

//	val map = mapOf("one" to 1,"two" to 2)
//	for((k,v) in map){
//		println("$k -> $v")
//	}

//	val list = mutableListOf(1,30, 2,0)
//	if(list.none { it > 6 }) println("no nonw greater than 6")
//	else println("failure ... ")


//	val y = 123
//	println(y as? String)
//	val strings = listOf("hello","world","hi","hehe")
//	val max = max(strings, { a, b -> a.length < b.length })
//	println(max)
//	val foldRight = strings.foldRight("", { e, acc -> "-"+e + acc})
//	println(foldRight)


//	val compare:(String,String)->Boolean = {a,b -> a.length < b.length}
//
//	val sum:(Int,Int)->Int = {x,y -> x+y}
//	println(sum(2,3))

//	val res = (1..10).filter {
//		val shouldfilter = it > 5
//		return@filter shouldfilter
//	}
//	println(res)

//	var a:String? = null
//	println(a!!.length)
//	a = null
//	val length = if(a == null) -1 else a.length
//	print(length)
//	println(a?.length)

//	val list:List<String?> = listOf("a","b",null)
//	list.forEach(::println)
//	for (item in list){
//		item?.let { println(it) }
//	}

//	val nulllist:List<Int?> = listOf(1,2,null,null,null,3,4,5)
//	val list = nulllist.filterNotNull()
//	printColl(list)

//	fun isOdd(x:Int) = x % 2 != 0
//	fun isOdd(s:String) = s == "hello" || s == "world"
//	val numbers = listOf(1,2,3)
//	numbers.filter(::isOdd).forEach(::println)


//	fun length(s:String) = s.length
//	val oddLength = compose(::isOdd,::length)
//	val oddLength2 = then(::length,::isOdd)

//	val strings = listOf("a","ab","abc")
//	strings.filter(oddLength2).forEach(::println)
//	println(strings.map(String::length))

//	println(::x.get())
//	::x.set(123)
//	println(::x.get())

//	println(Ademo::p.javaGetter)
//	println(Ademo::p.javaClass)

//	fun function(factory:()->Foo){
//	}
//	function(::Foo)

//	val list = listOf(1,2,3,4,5,6,7,8,9,10)
//	println(list.lastIndex)
//	println(list.asReversed())
//	val sublist = list.subList(2,5)
//	println(sublist)
//	println(list.associate { it -> it to "one" })

//	val list1 = arrayOf(1,2)
//	val list2 = arrayOf(3,4)
//	val list3 = arrayOf(5,6)
//	val list = arrayOf(list1,list2,list3)
//	list.forEach(::println)
//	list.flatMap{it.toList()}.forEach(::println)

	fun isOdd(x:Int) = x % 2 == 0

	val list1 = listOf(6,99,1,2,3,4,5,6)
	val list2 = listOf(10,20,30,40,50,60)
	val list3 = listOf("1","2","3","4")

	val map = mapOf( 1 to 11, 2 to 22 ,3 to 13,4 to 14,5 to 8)

	map.filter { (k,v)->k+v < 15 }.forEach { k, v -> println("$k -> $v") }


//	val sumlist = list1.zip(list2,{a,b -> a + b })
//	printColl(sumlist)
//
//	listOf(Pair(1,2),Pair(3,4)).toMap().forEach { k, v -> println("$k -> $v") }
//	println(list3.sumBy { it.toInt() })
//	println(list1.sum())
//	println(list1.reduce { acc, i -> acc + i })

//	list1.onEach(::println)


//	list3.map { it.toInt() }.toSet().forEach(::println)
//	val set = mutableSetOf<Int>()
//	val mapset = list3.mapTo(set){it.toInt()}
//	println(mapset)

//	val take = list1.take(5)
//	println(take)
//	val take2 = list1.takeWhile{ it > 4 }
//	println(take2)

//	val takelist = list1.takeWhile { it > 1 }
//	takelist.forEach(::println)

//	list.withIndex().forEach(::println)

//	println(list.count{it == 2})

//	list.groupBy { isOdd(it) }.forEach { t, u -> println("$t->$u") }
//
//	val map = list.groupBy { it>3 }
//	println(map)
//	val list2 = listOf(1,2,3)
//	println(list + list2)
//
//	val pair = list.partition { isOdd(it) }
//	println(pair.first)
//	println(pair.second)





}

class Foo

class Ademo(val p:Int)

var x = 998
fun <A,B,C> then(f: (A) -> B,g:(B)->C):(A)->C{
	return {x -> g(f(x))}
}
fun <A,B,C> compose(f:(B)->C,g:(A)->B):(A)->C{
	return {x -> f(g(x))}
}

fun <T> max(coll:Collection<T>,less:(T,T)->Boolean):T?{
	var max:T? = null
	for(it in coll){
		if(max == null || less(max,it)){
			max = it
		}
	}
	return max;
}
//fun <T> lock(lock:Lock ,body:()->T):T {
//	println("hello")
//}
inline fun <reified T> membersof() = T::class.members

open class A{
	open fun foo(i:Int = 9){
		println("i is $i")
	}
}
class B :A(){
	override fun foo(i: Int) {
		println("iiii is $i")
	}
}
fun read(b:Array<Int>,off:Int = 0,size:Int = b.size){
	println("b: ${b.size} -- ${off} -- ${size}")
}


class User2(map: MutableMap<String,Any?>){
	var name:String by map
	var age:Int by map

	override fun toString(): String {
		return name+" -> "+age
	}
}
class User1{
	var name:String by Delegates.observable("<no name>"){
		property, oldValue, newValue -> println("$oldValue -> $newValue")
	}
	var age:Int by Delegates.vetoable(12){
		property, oldValue, newValue -> newValue > oldValue
	}

	override fun toString(): String {
		return name+ " : "+age
	}
}
class Delegate{
	operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
		return "$thisRef, thank you for delegating '${property.name}' to me!"
	}

	operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
		println("$value has been assigned to '${property.name} in $thisRef.'")
	}
}

class Example{
	var p :String by Delegate()
}

enum class RGB{RED,GREEN,BLUE}
inline fun<reified T:Enum<T>> printvalues(){
	println(enumValues<T>().joinToString{it.name})
}


fun foo2() = 1

class Outer{
	private val bar:Int = 1
	inner class Inner{
		fun boo(){ println("bar is "+bar)}
	}
}

fun fill(dest:Array<in String>,value:String){
	dest.set(0,value)
}

fun copy(from:Array<out Any>,to :Array<Any>){
	assert(from.size == to.size)
	for(i in from.indices){
		to[i] = from[i]
	}
}
class Box<T>(t:T){
	var value = t
}
data class User(val id:Int,var name:String = "default name",var age:Int = 0,var addrss:String = "no address"){
	fun copy(id: Int = this.age,name: String = this.name,age: Int = this.age) = User(id,name,age)
}

sealed class Expr{
	class Const(val number:Double):Expr()
	class Sum(val s1:Expr,var s2:Expr):Expr()
	object NoNumber : Expr()
}

fun eval(expr: Expr):Double = when(expr){
	is Expr.Const -> expr.number
	is Expr.Sum -> eval(expr.s1)+ eval(expr.s2)
	is Expr.NoNumber -> Double.NaN
}
