king = 1
queen = 1
look = 2
bishop = 2
knight = 2
pawn = 8

k, q, l, b, kn, p = map(int, input().split())

king -= k
queen -= q
look -= l
bishop -= b
knight -= kn
pawn -= p

print(king,queen,look,bishop,knight,pawn)