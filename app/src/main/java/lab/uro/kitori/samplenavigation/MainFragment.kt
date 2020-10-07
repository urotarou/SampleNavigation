package lab.uro.kitori.samplenavigation

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import lab.uro.kitori.samplenavigation.databinding.FragmentMainBinding
import timber.log.Timber

class MainFragment : Fragment() {
    private val activityViewModel: MainViewModel by activityViewModels()
    private val fragmentViewModel: MainViewModel by viewModels()
    private lateinit var binding: FragmentMainBinding

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
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Timber.d("onViewCreated: ${hashCode()}")

        binding.toHogeButton.setOnClickListener {
            val action = MainFragmentDirections.actMainToHoge()
            findNavController().navigate(action)
        }
        binding.toPiyoButton.setOnClickListener {
            val action = MainFragmentDirections.actMainToPiyo()
            findNavController().navigate(action)
        }

        activityViewModel.data.observe(viewLifecycleOwner, {
            Timber.d("getData-1: $it")
        })
        activityViewModel.getData()

        fragmentViewModel.data.observe(viewLifecycleOwner, {
            Timber.d("getData-2: $it")
        })
        fragmentViewModel.getData()
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
