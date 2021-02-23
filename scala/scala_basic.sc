println(1)

println(1 + 1)

println("Hello!")
println("Hello, " + " World!")

val x = 1 + 1
println(x)


val x: Int = 1 + 3

val x: Float = 1 + 3

var X = 1 + 1
X = 3
println(X * X)

println({
  val x = 1+1
  x + 1
})


(x: Int) => x + 1

// 익명 함수를 만들어 놓고 그것을 value(val)로 지정을 하는 방식

val addOne = (x: Int) => x + 1
println(addOne(1))

// 함수에 다수의 파라미터를 넣어 사용할 수 있다.

val add = (x:Int, y: Int) => x + y
println(add(1, 2))

// 또는 인자를 아예 안 받아도 됌.

val getTheAnswer = () => 42
println(getTheAnswer())

//Methods
//메소드는 실제로 함수와 굉장히 비슷하고 그렇게 행동하지만, 몇가지 중요한 차이점이 있습니다.
//메소드는 def 키워드로 선언을 한다.
//def 다음에 이름이 오고 다음으로 파라미터 리스트가 오고 리턴 타입이 오고 본문이 온다.

def add(x: Int, y: Int): Int = x + y // 리턴타입이 파라미터 리스트 다음에 콜론 다음에 선언되는 것이 주의한다.
println(add(1, 2))

// 메소드는 파라미터 리스트를 여러개 받을 수도 있다.
// 메소드에서만 다중인자리스트를 받을 수 있다.

def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
println(addThenMultiply(1, 2)(3)) // 커링 관련 내용?

// 또는 파라미터 리스트가 없을 수도 있다.
def name: String = System.getProperty("user.name")
println("Hello, " + name + "!")

// 또 다른 몇가지 차이점이 있지만, 함수랑 거의 비슷한 것이라고 여기자.
// 메소드는 여러줄의 식을 받을 수 있다.

def getSquareString(input: Double): String = { // 블럭으로 감싸짐.
  val square = input * input
  square.toString // 블락은 마지막 식을 반환함
}

//바디의 마지막 expression이 method의 반환 값(return value)이 됩니다.
//  Scala는 return 키워드가 없지만 간혹 사용하긴함