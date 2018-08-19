class Account {
    BigDecimal balance = 0.0
    
    def deposit(BigDecimal amount) {
        if( amount < 0 ) {
            throw new IllegalArgumentException("amount cannot be negative")
        } else {
            balance += amount
        }
    }
    
    def deposit(List amounts) {
        for( amount in amounts ) {
            deposit(amount)
        }
    }
}

Account account = new Account()
account.deposit(10.0)

try {
    account.deposit(-5.0)
} catch( IllegalArgumentException e ) {
    println e.message
}

account.deposit([15, 20, 25])
println account.balance