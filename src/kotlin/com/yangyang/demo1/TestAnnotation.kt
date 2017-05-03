package com.yangyang.demo1

@Fancy("test")
class TestAnnotation() {
	@Fancy fun foo(@Fancy i:Int):Int{
		return  i
	}
}