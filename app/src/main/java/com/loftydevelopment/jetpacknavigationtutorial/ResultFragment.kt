package com.loftydevelopment.jetpacknavigationtutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_result.*

class ResultFragment : Fragment() {

    private var nameResult = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            nameResult = ResultFragmentArgs.fromBundle(it).nameArg
            tv_result_name.text = nameResult
        }

        btn_back.setOnClickListener {
            val action = ResultFragmentDirections.actionResultFragmentToInputFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

}
