package com.example.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.databinding.FragmentListBinding
import edu.tec.challenge.Adapter.Adapter
import edu.tec.challenge.data.TareaProvider

class ListFragment : Fragment() {
    private lateinit var binding: FragmentListBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recycler : RecyclerView = binding.recyclerview
        val quotesAdapter = Adapter(TareaProvider.getData())
        quotesAdapter.setOnItemClickListener(object :Adapter.ClickListener{
            override fun onItemClick(view: View, position: Int) {
                Toast.makeText(context,quotesAdapter.getData(position).toString(), Toast.LENGTH_LONG).show()
            }
        })
        recycler.layoutManager = LinearLayoutManager(context)
        //recycler le doy el adapter
        recycler.adapter = quotesAdapter

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater)

        return binding.root
    }

}

