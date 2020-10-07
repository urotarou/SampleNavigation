package lab.uro.kitori.samplenavigation

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import lab.uro.kitori.samplenavigation.databinding.FragmentPiyoBinding
import timber.log.Timber

class PiyoFragment : Fragment() {
    private val viewModel: PiyoViewModel by viewModels()
    private lateinit var binding: FragmentPiyoBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Timber.d("onAttach: ${hashCode()}")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("onCreate: ${hashCode()}")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Timber.d("onCreateView: ${hashCode()}")
        binding = FragmentPiyoBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Timber.d("onViewCreated: ${hashCode()}")

        viewModel.data.observe(viewLifecycleOwner, {
            Timber.d("getData: $it")
        })

        viewModel.getData()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Timber.d("onActivityCreated: ${hashCode()}")
    }

    override fun onStart() {
        super.onStart()
        Timber.d("onStart: ${hashCode()}")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("onResume: ${hashCode()}")
    }

    override fun onPause() {
        Timber.d("onPause: ${hashCode()}")
        super.onPause()
    }

    override fun onStop() {
        Timber.d("onStop: ${hashCode()}")
        super.onStop()
    }

    override fun onDestroy() {
        Timber.d("onDestroy: ${hashCode()}")
        super.onDestroy()
    }

    override fun onDetach() {
        Timber.d("onDetach: ${hashCode()}")
        super.onDetach()
    }
}
