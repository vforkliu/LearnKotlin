import java.text.SimpleDateFormat
import java.util.*

// Date 扩展函数
fun Date.format(fmt:String = "yyyy-MM-dd HH:mm:ss"):String{
    val sdf = SimpleDateFormat(fmt)
    return sdf.format(this)
}

fun main(){
    var date = Date();
    var f = date.format();
    println(f);
}