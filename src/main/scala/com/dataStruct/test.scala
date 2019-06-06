package com.dataStruct

import scala.collection.mutable

object test {
  def main(args: Array[String]): Unit = {
    val topicInfo = TopicInfo("", "", "", "", "", "", "")
    val tagMap = mutable.HashMap[String, mutable.HashMap[String, Int]]()

    if (!"".equals(topicInfo.tag1) && !"null".equals(topicInfo.tag1) && topicInfo.tag1 != null) {
      val tag1MapFlag: Option[mutable.HashMap[String, Int]] = tagMap.get("tag1")
      if (tag1MapFlag != None) {
        //若不为空，先判断是否有，先判断是否有该tagNum    coimc count >sanhua
        val tagDetialMap: mutable.HashMap[String, Int] = tag1MapFlag.get
        val tagNumFlag: Option[Int] = tag1MapFlag.get.get(topicInfo.tag1)
        if (tagNumFlag != None) {
          val tagDetailNum = tagNumFlag.get + 1
          tagDetialMap.put(topicInfo.tag1, tagDetailNum)
          tagMap.put("tag1", tagDetialMap)
        } else {
          val tagDetailNum = 1
          tagDetialMap.put(topicInfo.tag1, tagDetailNum)
          tagMap.put("tag1", tagDetialMap)
        }

      } else {
        val tagNum = mutable.HashMap[String, Int]()
        tagNum.put(topicInfo.tag1, 1)
        tagMap.put("tag1", tagNum)
      }

    }
    //tag2
    if (!"".equals(topicInfo.tag2) && !"null".equals(topicInfo.tag2) && topicInfo.tag2 != null) {
      val tag1MapFlag: Option[mutable.HashMap[String, Int]] = tagMap.get("tag2")
      if (tag1MapFlag != None) {
        //若不为空，先判断是否有，先判断是否有该tagNum
        val tagDetialMap: mutable.HashMap[String, Int] = tag1MapFlag.get
        val tagNumFlag: Option[Int] = tag1MapFlag.get.get(topicInfo.tag2)
        if (tagNumFlag != None) {
          val tagDetailNum = tagNumFlag.get + 1
          tagDetialMap.put(topicInfo.tag2, tagDetailNum)
          tagMap.put("tag2", tagDetialMap)
        } else {
          val tagDetailNum = 1
          tagDetialMap.put(topicInfo.tag2, tagDetailNum)
          tagMap.put("tag2", tagDetialMap)
        }

      } else {
        val tagNum = mutable.HashMap[String, Int]()
        tagNum.put(topicInfo.tag2, 1)
        tagMap.put("tag2", tagNum)
      }
    }
  }


}
case class TopicInfo(val id: String, val maxRate: String, val taste: String, val tag1: String, val tag2: String
                     , val gender: String, val age: String)

