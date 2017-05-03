package com.yangyang.demo1

@Target(AnnotationTarget.CLASS,AnnotationTarget.FIELD,AnnotationTarget.FUNCTION,AnnotationTarget.EXPRESSION,AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Fancy(val why:String = "default")
