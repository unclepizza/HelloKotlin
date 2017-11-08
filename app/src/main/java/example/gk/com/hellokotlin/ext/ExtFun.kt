package example.gk.com.hellokotlin.ext

import android.content.Context
import android.widget.Toast

/**
 * @version
 * @description 扩展函数
 * @date 2017/11/8 10:26
 * @author gaok
 */
fun Context.toast(message:String, length : Int = Toast.LENGTH_SHORT){
    Toast.makeText(this,message,length).show()
}