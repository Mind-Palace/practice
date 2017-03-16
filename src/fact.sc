object session2 {
	def factorial(n: Int): Int = {

		def factorialIter(f: Int, m: Int): Int =
			if (m == 0) f
			else factorialIter(f * m, m - 1)

		factorialIter(1, n)

	}

	factorial(0)
	factorial(1)
  factorial(2)
	factorial(3)
	factorial(4)
	factorial(5)
}