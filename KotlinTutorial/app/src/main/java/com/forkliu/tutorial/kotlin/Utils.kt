import java.text.SimpleDateFormat
import java.util.*

fun Date.format(fmt:String = "yyyy-MM-dd HH:mm:ss"):String{
    val sdf = SimpleDateFormat(fmt)
    return sdf.format(this)
}