A, B = map(int, input().split())
C = int(input())

D = (B + C)//60

if A+D < 24 and B + C >= 60:
    print(A+D,(B+C)-(60*D))
elif A+D > 23 and B+C >= 60:
    print((A+D)-24,(B+C)-(60*D))
else:
    print(A,B+C)