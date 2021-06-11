package Main

object scala {



  //a4b3c2db2
  def compress(str:String):String={
    val a:List[String] = str.split("").toList
    def __recv(str:List[String],curr:String,i:Int):String= str match {
      case tail :: Nil => curr
      case Nil => curr
      case ::(head, next) => {
        if(head==next.head){
          __recv(next,curr,i+1)
        }
        else{
          __recv(next,curr+head+i,1)
        }
      }
    }
    __recv(a,"",1)
  }
  def main(args: Array[String]): Unit = {
    print(compress("aaaabbbccdbb"))
  }
}
