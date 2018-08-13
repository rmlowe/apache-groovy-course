List nums = [1,2,3,6,7,9,4,5,3,6,8,9]
println nums
println nums.class.name

// add | remove | get | clear

/*
nums.add(99)
////nums.putAt(0,77)
nums[0] = 78
nums + 7
nums << 66
*/

/*
nums.removeLast()
nums.removeAt(0)
def newList = nums - 3
println newList
*/

//println nums.getAt(0..3)
//nums = []

for(x in nums) {
    //println x
}

// flatten
nums << [3,4,5]
nums << [1,2]
println nums.flatten()

println nums.unique()

def numbers = [1,2,7,3,8,3,8,3,8,9,2,6,10,165,4] as SortedSet
println numbers
println numbers.class.name

