package lab.uro.kitori.samplenavigation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import lab.uro.kitori.samplenavigation.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Timber.d("onCreate")

        viewModel.data.observe(this, {
            Timber.d("getData: $it")
        })

        viewModel.getData()
    }
}
