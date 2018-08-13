def dayOfWeekMap = [1:"Sunday", 2:"Monday", 3:"Tuesday", 4:"Wednesday", 5:"Thursday", 6:"Friday", 7:"Saturday"]
println dayOfWeekMap

for (entry in dayOfWeekMap) {
    println entry
}

println dayOfWeekMap.getClass().getName()

println dayOfWeekMap.size()

println dayOfWeekMap.values()

for (day in dayOfWeekMap.values()) {
    println day
}