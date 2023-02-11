import kotlin.system.measureNanoTime

// set run repetitions
val RUNS: Long = 65536

fun main() {
	var first: Long
	var second: Long

	// bench setup

    var a: Long = 0

	// /bench setup

	first = measureNanoTime {
		for (i: Long in 0..RUNS) {
			// 1st run

			a++
			// a += 1			// reverse test

			// bench function
			// func1()
			// func2()			// reverse test

			// /1st run
		}
	}

	// reset bench setup

	a = 0

	// /reset bench setup

	second = measureNanoTime {
		for (i: Long in 0..RUNS) {
			// 2nd run

			a += 1
			// a++ 				// reverse test

			// bench function
			// func2()
			// func1()			// reverse test

			// /2nd run
		}
	}

	// print result nanoseconds
	// println("1st run: " + first.toFloat() / RUNS.toFloat() + " ns")
	// println("2nd run: " + second.toFloat() / RUNS.toFloat() + " ns")

	// print result microseconds
	println("1st run: " + first.toFloat() / RUNS.toFloat() / 1000.0 + " µs")
	println("2nd run: " + second.toFloat() / RUNS.toFloat() / 1000.0 + " µs")

	// print result milliseconds
	// println("1st run: " + first.toFloat() / RUNS.toFloat() / 1.0e6 + " ms")
	// println("2nd run: " + second.toFloat() / RUNS.toFloat() / 1.0e6 + " ms")

	// print result seconds
	// println("1st run: " + first.toFloat() / RUNS.toFloat() / 1.0e9 + " s")
	// println("2nd run: " + second.toFloat() / RUNS.toFloat() / 1.0e9 + " s")
}

fun func1() {}		// demo function

fun func2() {}  	// demo function
