inputNum = int(input())

if inputNum <= 99:
    cnt = inputNum
if inputNum > 99:
    cnt = 99
    for i in range(100, inputNum + 1):
        hun = i // 100
        ten = (i // 10) % 10
        one = i % 10
        if (hun - ten) == (ten - one):
            cnt += 1
print(cnt)