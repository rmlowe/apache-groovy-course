// Closure Basics

def fizzBuzzBar(Closure c) {
    c("fizz")
    c("buzz")
    c("bar")
}

def c = { println it }
fizzBuzzBar(c)

["fizz", "buzz", "bar"].each { println it }

[uk: "London", china: "Beijing", japan: "Tokyo"].each { String key, String value -> println "$key:$value" }

def add = { x, y -> x + y }
def addSeven = add.curry(7)
[1, 2, 3].collect(addSeven)


// Explore the GDK

def fibs = [1, 1, 2, 3, 5, 8, 13, 21]
def isEven = { it % 2 == 0 }
assert fibs.find(isEven) == 2
assert fibs.findAll(isEven) == [2, 8]

assert fibs.any(isEven)
assert !fibs.every(isEven)

assert ["Clubs", "Diamonds", "Spades", "Hearts"].groupBy { it.length() } == [5:["Clubs"], 8:["Diamonds"], 6:["Spades", "Hearts"]]
assert ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"].groupBy { it.substring(0, 1) } ==
        [S:["Sunday", "Saturday"], M:["Monday"], T:["Tuesday", "Thursday"], W:["Wednesday"], F:["Friday"]]

