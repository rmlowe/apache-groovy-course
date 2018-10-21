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

MarkupBuilder builder = new MarkupBuilder()
builder.doubleQuotes = true

builder.books {
    books.each { theBook ->
        book(isbn: theBook.isbn) {
            title theBook.title
            author theBook.author
            price theBook.price
        }
    }
}