#3, 29, 38, 12, 57, 74, 40, 85, 61
cnt = 9
numbers = []
for i in range(cnt):
    numbers.append(int(input()))


print(max(numbers))
print(numbers.index(max(numbers))+1)