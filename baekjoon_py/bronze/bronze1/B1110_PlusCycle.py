N = int(input())
n1 = N // 10
n3 = N
cnt = 1

while True:
    n2 = n3 % 10
    n3 = n1 + n2
    if n2 == (N//10) and (n3 % 10) == (N%10):
        print(cnt)
        break
    n1 = n2
    n2 = n3
    cnt += 1