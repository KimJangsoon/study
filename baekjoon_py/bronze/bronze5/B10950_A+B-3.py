n = int(input())
new_str = []

for _ in range(n):
    a,b = map(int, input().split())
    (new_str).append(a + b)


for i in new_str:
    print(i)