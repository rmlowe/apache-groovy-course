import groovy.text.SimpleTemplateEngine
import groovy.text.Template

// 3 components to building a dynamic template

// 1. Engine (SimpleTemplateEngine)
// 2. Template (the email)
// 3. Data Bindings (The Data to insert into the dynamic portions of our email)

SimpleTemplateEngine engine = new SimpleTemplateEngine(truec)
Template template = engine.createTemplate( new File('dynamic-email.txt') )

// data bindings
Map bindings = [
        firstName: "Dan",
        lastName: "Vega",
        commits: 27,
        repositories: [
                [name:'Apache Groovy Course',url:'https://github.com/cfaddict/apache-groovy-course'],
                [name:'Spring Boot REST',url:'https://github.com/cfaddict/spring-boot-rest'],
                [name:'Learn Spring Boot',url:'https://github.com/cfaddict/learnspringboot']
        ]
]

println template.make(bindings)
