# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""


def swap(a, b, arr):
    if a!=b:
        temp = arr[a]
        arr[a] = arr[b]
        arr[b] = temp
        
# Hoare partition scheme        
def hoare_partition(elements, start, end):
    pidx = start
    pivot = elements[pidx]
    
    while start < end:
        
        while start < len(elements) and elements[start] <= pivot:
            start += 1
            
        while elements[end] > pivot:
            end -= 1
            
        if start < end:
            swap(start, end, elements)
            
    swap(pidx, end, elements)
    2
    return end

# Lomuto partition scheme
def lomuto_partition(elements, low, high):
    pivot = elements[high]
    i = low - 1
    
    while low < high:
        if elements[low] <= pivot:
            i += 1
            swap(low, i, elements)
            low += 1
        else:
            low += 1
    
    i += 1
    swap(low, i, elements)
    return i
            
    
def quicksort(elements, start, end):
    if start < end:
        if scheme == 1:
            pi = hoare_partition(elements, start, end)
        else:
            pi = lomuto_partition(elements, start, end)
        quicksort(elements, start, pi-1)    # left partition
        quicksort(elements, pi+1, end)  # right partition

if __name__ == '__main__':
    # elements = [11, 9, 29, 7, 2, 15, 28]
    print("Enter list of elements in unsorted manner seperated by space")
    
    # 2 ways to take input from user
    # way 1
    # elements = [int(x) for x in input().split()]
    # way 2
    x = input()
    elements = list(map(int, x.split()))
    print("Enter 1 for Hoare partition scheme or 2 for Lomuto partition scheme")
    scheme = int(input())
    quicksort(elements, 0, len(elements)-1)
    print(elements)