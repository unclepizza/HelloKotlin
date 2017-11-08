package example.gk.com.hellokotlin.activity

import example.gk.com.hellokotlin.R
import example.gk.com.hellokotlin.databinding.ActivitySecondBinding
import example.gk.com.hellokotlin.model.User

/**
 * @version
 * @description
 * @date 2017/11/8 10:15
 * @author gaok
 */
class SecondActivity : BaseBindingActivity<ActivitySecondBinding>() {

    override fun getLayoutResId(): Int {
        return R.layout.activity_second
    }

    override fun initView() {
        mBinding.user = intent.getSerializableExtra("user") as User?
    }
}