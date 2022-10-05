"""
num1, num2, num3 = map(int, input().split())
list = [num1, num2, num3]
if num1 == num2 and num2 == num3:
    reward = 10000 + (num1 * 1000)
elif (num1 == num2 and num1 != num3) or (num1 == num3 and num1 != num2):
    reward = 1000 + (num1 * 100)
elif num2 == num3 and num2 != num1:
    reward = 1000 + (num2 * 100)
else:
    maxValue = list[0]
    for i in range(1, len(list)):
        if maxValue < list[i]:
            maxValue = list[i]
    reward = maxValue * 100
print(reward) 아래는 클린코드
"""
a, b, c = map(int, input().split())

if a == b == c:
    reward = 10000 + (a * 1000)
elif a == b:
    reward = 1000 + (a * 100)
elif a == c:
    reward = 1000 + (a * 100)
elif b == c:
    reward = 1000 + (b * 100)
else:
    reward = 100 * max(a, b, c)

print(reward)