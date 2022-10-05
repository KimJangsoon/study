n1, n2, n3, n4, n5 = map(int, input().split())

valNum = ((n1 * n1) + (n2 * n2) + (n3 * n3) + (n4 * n4) + (n5 * n5)) % 10

print(valNum)