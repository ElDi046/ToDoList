package com.example.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.todolist.databinding.FragmentCaptureBinding
import edu.tec.challenge.data.Tarea
import java.text.SimpleDateFormat
import java.util.*


class CaptureFragment : Fragment() {
    private lateinit var binding: FragmentCaptureBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCaptureBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.captureTextView.text = "${arguments?.getString("nombre")} TO DO LIST"

        binding.addButton.setOnClickListener {
            val nombreTarea = binding.editTaskName.text.toString()
            val descripcionTarea = binding.editTaskDescription.text.toString()
            val prioridadTarea = binding.editPriority.text.toString()
            val timeStamp: String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val tareas = Tarea(nombreTarea, descripcionTarea, prioridadTarea, timeStamp)


            val action = CaptureFragmentDirections.actionCaptureFragmentToListFragment(tareas)

            findNavController().navigate(action)

        }

    }
}