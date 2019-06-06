package com.dataStruct

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import util.control.Breaks._


object BinySearchAllData {
  def main(args: Array[String]): Unit = {
     //实现二分查找的多次位置的数据使用
     val arr = Array(1, 8, 10, 1000, 1000,1000, 1000, 1000, 1000,1000, 1000,1000, 1234)
    BinySearchAll(arr,1000)
  }

  /**
    * 实现二分查找
    * @param arr 数据
    * @param target  目标元素
    * @return
    */
  def BinySearchAll(arr:Array[Int],target:Int):ArrayBuffer[Int]={
    var left:Int = 0
    var right:Int = arr.length - 1;
    if (left>right){
      return ArrayBuffer()
    }
    val midIndex = (left+right)/2
    while (left<=midIndex) {
      if (arr(midIndex) > target) { //向左边递归查找
          right = midIndex - 1
      }else if (arr(midIndex) < target){
          right = midIndex + 1
      }else{
        val result = new ArrayBuffer[Int]()
        //当前已经找到坐标数据
        println(midIndex)
        var temp = midIndex -1
        //向左边扫描
        breakable{
          while (true){
            if (temp<0 || arr(temp)!=target){
              break()
            }
            if (arr(temp) == target){
              result.append(temp)
            }
            temp -= 1
          }
        }
        result.append(midIndex)
        //向右边扫描
        temp = midIndex +1
        breakable{
          while (true){
            if (temp>arr.length-1 || arr(temp) != target){
              break()
            }
            if (arr(temp) == target){
              result.append(temp)
            }
            temp+=1
          }

        }
        return result
      }
    }
    return ArrayBuffer();
  }


}
