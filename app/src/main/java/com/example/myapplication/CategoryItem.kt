package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.myapplication.http.HttpHelper

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CategoryItem.newInstance] factory method to
 * create an instance of this fragment.
 */
class CategoryItem : Fragment() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val inflatedFragment = inflater.inflate(R.layout.fragment_category, container, false)
        val categoryNameTextView = inflatedFragment.findViewById<TextView>(R.id.category_name)
        val categoryName = arguments?.getString(CATEGORY_NAME)
//        val categoryImg = intent.getStringExtra("categoryImg")

        //TODO pegar lista da caralha das category
        //TODO instanciar essa porra de caralho de activity e setar a desgraça do nome e do icon pra cada category

        categoryNameTextView.setText(categoryName)
        return inflatedFragment

    }

    companion object {
        private const val CATEGORY_NAME = "categoryName"
        /**
         * @return A new instance of fragment category.
         */

        @JvmStatic
        fun newInstance(categoryName: String) = CategoryItem().apply {
            arguments = Bundle().apply {
                putString(CATEGORY_NAME, categoryName)
            }

        }


    }


}