// object that calculate square root using recursion
object session {
	def abs(x:Double) = if (x < 0) -x else x

	// using block scope can improve code structure
	def sqrt(x: Double) = {
		def sqrtIter(guess: Double): Double =
			if (isGoodEnough(guess)) guess
			else sqrtIter(improve(guess))

		// use normalized abs
		def isGoodEnough(guess: Double) =
			abs(guess * guess - x) / x < 0.001

		def improve(guess: Double) = (guess + x / guess) / 2

		sqrtIter(1.0)
	}

	sqrt(1)
	sqrt(2)
	sqrt(4)
	sqrt(1e-60)		// very very small number
	sqrt(1e60)		// very very large number
}