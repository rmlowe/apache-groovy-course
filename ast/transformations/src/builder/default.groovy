package builder

Developer dan = Developer
    .builder()
    .firstName("Dan")
    .lastName("Vega")
    .middleInitial("A")
    .email("danvega@gmail.com")
    .hireDate(new Date())
    .languages(["Java","Groovy"])
    .build()

println dan
assert dan.firstName == "Dan"
assert dan.lastName == "Vega"
assert dan.languages.size() == 2

