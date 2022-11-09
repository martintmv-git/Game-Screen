package com.androidapp.gamescreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.acxdev.commonFunction.util.view.RecyclerViewX.Companion.adapter
import com.acxdev.internship.R
import com.acxdev.internship.databinding.FragmentGameBinding

class FragmentGame : Fragment() {


    private lateinit var binding: FragmentGameBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGameBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mutableListSlack = mutableListOf<Job>()
        mutableListSlack.add(Job(R.drawable.monopoly, "Monopoly", "Hasbro", "3-8 Players", "1 Year Ago", 50112, R.array.howtoplay_monopoly, R.array.htp_tetris))
        mutableListSlack.add(Job(R.drawable.scrabble, "Scrabble", "EA Games", "2-4 Players", "6 Months Ago", 2700, R.array.howtoplay_scrabble, R.array.htp_tetris))
        mutableListSlack.add(Job(R.drawable.tetris, "Tetris Bundle", "Nintendo Games", "1-2 Players", "1 Week Ago", 50112, R.array.howtoplay_tetris, R.array.htp_tetris))
        mutableListSlack.add(Job(R.drawable.logo2048, "2048", "Solebon LLC", "1-4 Players", "3 Months Ago", 2700, R.array.howtoplay_2048, R.array.htp_tetris))
        mutableListSlack.add(Job(R.drawable.drawmy, "Draw Something", "OMGPOP, Inc", "2-8 Players", "5 Weeks Ago", 50112, R.array.howtoplay_drawmy, R.array.htp_tetris))
        mutableListSlack.add(Job(R.drawable.glow, "Glow Hockey", "Natenai Ariyatrakool", "1-2 Players", "3 Months Ago", 2700, R.array.howtoplay_glowhockey, R.array.htp_tetris))
        mutableListSlack.add(Job(R.drawable.tictactoe, "Tic-Tac-Toe", "AB Games", "2 Players", "1 Year Ago", 550112, R.array.howtoplay_tictactoe, R.array.htp_tetris))
        mutableListSlack.add(Job(R.drawable.checkers, "Checkers", "XYZ Games", "2 Players", "6 Months Ago", 12700, R.array.howtoplay_checkers, R.array.htp_tetris))
        mutableListSlack.add(Job(R.drawable.tetris, "Tetris Bundle", "Nintendo Games", "1-2 Players", "1 Week Ago", 50112, R.array.howtoplay_tetris, R.array.htp_tetris))
        mutableListSlack.add(Job(R.drawable.logo2048, "2048", "Solebon LLC", "1-4 Players", "3 Months Ago", 2700, R.array.howtoplay_2048, R.array.htp_tetris))
        binding.newInternship.adapter(RowNewInternship(mutableListSlack),1)

    }

}