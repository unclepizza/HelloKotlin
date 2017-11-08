package example.gk.com.hellokotlin.activity

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseBindingActivity<T : ViewDataBinding> : AppCompatActivity() {


    lateinit var mBinding: T
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = DataBindingUtil.setContentView(this, getLayoutResId())

        initView()
    }

    abstract fun getLayoutResId(): Int

    abstract fun initView()
}