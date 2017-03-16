// object that calculate square root using recursion
object session {
	def abs(x:Double) = if (x < 0) -x else x

	// using block scope can improve code structure
	def sqrt(x: Double) = {
		def sqrtIter(guess: Double, x: Double): Double =
			if (isGoodEnough(guess, x)) guess
			else sqrtIter(improve(guess, x), x)

		// use normalized abs
		def isGoodEnough(guess: Double, x: Double) =
			abs(guess * guess - x) / x < 0.001

		def improve(guess: Double, x: Double) = (guess + x / guess) / 2

		sqrtIter(1.0, x)
	}

	sqrt(1)
	sqrt(2)
	sqrt(4)
	sqrt(1e-60)		// very very small number
	sqrt(1e60)		// very very large number
}