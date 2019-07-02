package com.moheqionglin.alth.sort.switchSort;

import com.moheqionglin.alth.Util;

import java.util.Random;


/**
 * @author wanli.zhou
 * @description
 * @time 12/01/2019 8:43 PM
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = Util.mockArray(10);

        Util.print(array);
        quickSort(array, 0, array.length -1 );
        Util.print(array);

    }


    //先序遍历二叉树
    private static void quickSort(int[] array, int left, int right) {
        if(left > right){
            return;
        }

        int jizhun = array[left];
        int i = left;
        int j = right;

        while (i != j){
           //先右
           while(array[j] >= jizhun && i < j){
               j--;
           }
           while(array[i] <= jizhun && i < j){
                i++;
           }

           if(i < j){
               Util.swap(array, i, j);
           }
        }
        //基准数据 归位
        array[left] = array[i];
        array[i] = jizhun;

        quickSort(array, left, i - 1);
        quickSort(array, i +1, right);
    }



}