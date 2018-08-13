def dayList = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]
println dayList

for (day in dayList) {
    println day
}

println dayList.size()

dayList.remove("Saturday")
println dayList

dayList.add("Saturday")
println dayList

println dayList[3]