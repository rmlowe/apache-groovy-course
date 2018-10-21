import groovy.xml.MarkupBuilder

List books = [
        [
                isbn: '978-1935182443',
                title: 'Groovy in Action 2nd Edition',
                author: 'Dierk Koenig',
                price: 50.58
        ],
        [
                isbn: '978-1935182948',
                title: 'Making Java Groovy',
                author: 'Ken Kousen',
                price: 33.96
        ],
        [
                isbn: '978-1937785307',
                title: 'Programming Groovy 2: Dynamic Productivity for the Java Developer',
                author: 'Venkat Subramaniam',
                price: 28.92
        ]
]

FileWriter writer = new FileWriter('html/books.html')
MarkupBuilder builder = new MarkupBuilder(writer)

builder.html {
    head {
        title 'Books'
    }
    body {
        h1 'Books'
        p 'Here are some books ...'
        table {
            tr {
                th 'ISBN'
                th 'Title'
                th 'Author'
                th 'Price'
            }
            books.each { book ->
                tr {
                    td book.isbn
                    td book.title
                    td book.author
                    td book.price
                }
            }
        }
    }
}