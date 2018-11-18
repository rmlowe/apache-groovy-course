
//String dir = '/Users/robertlowe/apache-groovy-course'
//List hidden = []
//new File(dir).eachFile { file ->
//
//    if( file.isDirectory() ){
//        println file.name
//    }
//
//    if( file.isHidden() ) {
//        hidden << file.name
//    }
//}
//
//println hidden

//String dir = '/Users/robertlowe/apache-groovy-course'
//new File(dir).eachDir { subfolder ->
//    println subfolder
//}
//
//def groovyCourseDir = new File('/Users/robertlowe/apache-groovy-course')
//println groovyCourseDir.directorySize()
//
//// create new
//new File('dummy').mkdir()
//new File('one/two/three').mkdirs()

new File('dummy').deleteDir()