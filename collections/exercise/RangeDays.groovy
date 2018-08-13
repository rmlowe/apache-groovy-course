enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
def range = DayOfWeek.SUNDAY..DayOfWeek.SATURDAY
println range.size()
println range.contains(DayOfWeek.WEDNESDAY)
println range.from
println range.to