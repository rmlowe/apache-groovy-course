// create a new file
//def file = new File('dummy.txt')
//file.write("This is some text\n")
//
//// new File('dummy.txt').text = "..."
//
//file.append("I am some more text...\n")
//
//List lines = file.readLines()
//lines.each { line ->
//    println line
//}

// list all files in a directory

//String dir = '/Users/robertlowe/apache-groovy-course'
//new File(dir).eachFileRecurse { file ->
//
//    if( file.isFile() ){
//        println file.name
//    }
//
//}

new File('.').eachFile { file ->
    if( file.name.endsWith('.groovy') ){
        println file.name
    }
}