class MyClass {

    def invokeMethod(String name, Object args) {
        return "Invoked method $name with args $args"
    }

    def getProperty(String propertyName) {
        return "Value for $propertyName"
    }

    void setProperty(String propertyName, Object newValue) {
        println "Setting $propertyName to $newValue"
    }

}

MyClass inst = new MyClass()
println inst.foo()
println inst.bar
inst.baz = "qux"

Expando ex = new Expando()
ex.favouriteFood = "Cheese"
ex.report = { -> println "My favourite food is $favouriteFood" }
ex.report()

class MyOtherClass {

}

MyOtherClass.metaClass.favouriteDrink = "Beer"
MyOtherClass.metaClass.sayHello = { -> println "My favourite drink is $favouriteDrink" }

MyOtherClass inst2 = new MyOtherClass()
inst2.sayHello()

Integer.metaClass.timesTwo = { -> multiply(2) }
println 7.timesTwo()

class IntegerCategory {

    static Integer timesTwoAlt(Integer i) {
        i.multiply(2)
    }

}

use(IntegerCategory) {
    println 7.timesTwoAlt()
}