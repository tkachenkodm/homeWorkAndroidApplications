package com.example.hwandroidapplications

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class OutputFragment : Fragment(R.layout.output_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.tvOutput).text =
            arguments?.getInt(MathService.OUTPUT_KEY, -1).toString()
    }

    companion object {

        fun getFragment(result: Int): OutputFragment {
            val fragment = OutputFragment()
            val bundle = Bundle()
            bundle.putInt(MathService.OUTPUT_KEY, result)
            fragment.arguments = bundle
            return fragment
        }
    }
}