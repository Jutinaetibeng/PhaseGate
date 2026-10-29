def reverse_number(nums):
    result = []
    for index in nums:
        result.append(index[::-1])
   

    return result


nums = [[1,2,3],[4,5,6],[7,8,9]]
print(reverse_number(nums))
