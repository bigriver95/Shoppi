package com.example.shoppi

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class HomeFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //false 를 하는 이유는 액티비티가 모두 구성하는 이후에 레이아웃을 인플레이트 해야함 생성되는 시점을 늦추기 위해
        return inflater.inflate(R.layout.fragment_home, container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.btn_enter)
        button.setOnClickListener {
            //host 역할을하는 parent를 쓰는게 맞음 beginTransaction() 트렌젝션을 반환함
            val transaction = parentFragmentManager.beginTransaction()
            transaction.add(R.id.container_main, ProductDetailFragment())
            transaction.commit()
        }
    }
}