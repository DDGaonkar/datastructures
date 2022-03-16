# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""
# Hoare partition scheme

def swap(a, b, arr):
    if a!=b:
        temp = arr[a]
        arr[a] = arr[b]
        arr[b] = temp
        
def partition(elements, start, end):
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
    
    return end
    
def quicksort(elements, start, end):
    if start < end:
        pi = partition(elements, start, end)
        quicksort(elements, start, pi-1)    # left partition
        quicksort(elements, pi+1, end)  # right partition

if __name__ == '__main__':
    elements = [11, 9, 29, 7, 2, 15, 28]
    quicksort(elements, 0, len(elements)-1)
    print(elements)