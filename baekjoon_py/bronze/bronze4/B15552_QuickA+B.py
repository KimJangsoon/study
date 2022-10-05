import sys

T = int(sys.stdin.readline().rstrip())
list = []

for _ in range(T):
    a, b = map(int, sys.stdin.readline().split())
    (list).append(a+b)

for i in list:
    print(i)