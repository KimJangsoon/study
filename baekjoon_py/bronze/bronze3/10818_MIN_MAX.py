cnt = int(input())
#list로 받지 않고 map으로만 입력을 받으면 min을 한번 하고 더 이상 값을 사용할 수 없게 됨
numbers = list(map(int, input().split()))
print(min(numbers),max(numbers))