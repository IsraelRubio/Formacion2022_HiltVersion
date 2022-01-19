package israelontanilla.es.formacion2022_hiltversion.ui.splash

import android.content.Intent
import android.os.Bundle
import israelontanilla.es.formacion2022_hiltversion.common.BaseActivity
import israelontanilla.es.formacion2022_hiltversion.databinding.ActivitySplashBinding
import israelontanilla.es.formacion2022_hiltversion.ui.main.MainActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import androidx.lifecycle.lifecycleScope


class SplashActivity : BaseActivity() {

    private val binding: ActivitySplashBinding by lazy {
        ActivitySplashBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        lifecycleScope.launch {
            delay(2000)
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }
    }
}