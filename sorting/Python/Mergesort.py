# -*- coding: utf-8 -*-
"""
Created on Sun Mar  6 17:45:53 2022

@author: Omkar
"""

def mergesort(arr):
    if len(arr) > 1:
        left_arr = arr[:len(arr)//2]
        right_arr = arr[len(arr)//2:]
        
        # recursion
        mergesort(left_arr)
        mergesort(right_arr)
        
        # merge
        i = 0 #left_arr idx
        j = 0 #right_arr idx
        k = 0 #merged array idx
        
        while i < len(left_arr) and j < len(right_arr):
            if left_arr[i] < right_arr[j]:
                arr[k] = left_arr[i]
                i += 1
            else:
                arr[k] = right_arr[j]
                j += 1
            k += 1
        
        while i < len(left_arr):
            arr[k] = left_arr[i]
            i += 1
            k += 1
            
        while j < len(right_arr):
            arr[k] = right_arr[j]
            j += 1
            k += 1
    
    
array = [2, 4, 3, 6, 4, 1, 9, 8, 5, 7, 0, 1]
mergesort(array)
print(array)