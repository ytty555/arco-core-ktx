package ru.okcode.arco

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.okcode.arco.android_core.string.TextResource
import ru.okcode.arco.databinding.FragmentOneBinding
import ru.okcode.arco.textresource.from

class FragmentOne : Fragment() {

    private var _binding: FragmentOneBinding? = null
    private val binding: FragmentOneBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val simpleTextResource: TextResource = TextResource.from("Simple string")
        val resIdTextResource: TextResource = TextResource.from(R.string.res_id_text)
        val formattedTextResource: TextResource = TextResource.from(R.string.formatted_string, 100)

        with(binding) {
            simpleTextView.text = simpleTextResource.toString(resources)
            resTextView.text = resIdTextResource.toString(resources)
            formattedTextView.text = formattedTextResource.toString(resources)
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}