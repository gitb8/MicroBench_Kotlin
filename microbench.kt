import kotlin.system.measureNanoTime

// add imports for bench:


// set run repetitions:
val RUNS: Long = 65536

// add variables for bench:

// var a: Long = 0


fun main() {
	var first: Long
	var second: Long

	// add local variables for bench:

	var a: Long = 0


	first = measureNanoTime {
		for (i: Long in 0..RUNS) {
			// 1st run

			a++
			// a += 1			// reverse test

			// bench functions
			func1()
			// func2()			// reverse test
		}
	}

	// reset bench variables:

	a = 0


	second = measureNanoTime {
		for (i: Long in 0..RUNS) {
			// 2nd run

			a += 1
			// a++ 				// reverse test

			// bench functions
			func2()
			// func1()			// reverse test
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


// add functions for bench:

fun func1(): Unit {}		// demo function

fun func2(): Unit {}  	// demo function
