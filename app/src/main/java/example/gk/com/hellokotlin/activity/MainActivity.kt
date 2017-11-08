package example.gk.com.hellokotlin.activity

import android.content.Intent
import example.gk.com.hellokotlin.R
import example.gk.com.hellokotlin.databinding.ActivityMainBinding
import example.gk.com.hellokotlin.model.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseBindingActivity<ActivityMainBinding>() {

    override fun getLayoutResId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        val gaok = User("gaok", "001")
        mBinding.user = gaok

        tv_content.setOnClickListener {
            openActivity(gaok)
        }
    }

    private fun openActivity(gaok: User) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("user", gaok)
        startActivity(intent)
    }

}