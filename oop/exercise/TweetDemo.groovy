@groovy.transform.ToString
class Tweet {
    String from, text
    Date sent = new Date()
    
    static List<String> findByStartChar(String s, String startChar) {
        Integer i = s.indexOf(startChar)
        if (i == -1) {
            []
        } else {
            Integer startIndex = i + 1
            println "Starting at ${startIndex}"
            Integer endIndex = startIndex
            while (endIndex < s.length()) {
                Character c = s.charAt(endIndex)
                println "c: ${c}"
                if (!(c in 'a'..'z' || c in 'A'..'Z' || c in '0'..'9')) {
                    break
                }
                endIndex++
            }
            [s.substring(startIndex, endIndex)] + findByStartChar(s.substring(endIndex), startChar)
        }
    }
    
    List<String> findByStartCharInText(String startChar) {
        findByStartChar(text, startChar)
    }
    
    List<String> mentions() {
        findByStartCharInText('@')
    }
    
    List<String> hashtags() {
        findByStartCharInText('#')
    }
}

Tweet tweet = new Tweet(from:"robertlowe", text:"Hello, World! I like @daisy. #duckfan")
println tweet

assert tweet.mentions() == ["daisy"]
assert tweet.hashtags() == ["duckfan"]