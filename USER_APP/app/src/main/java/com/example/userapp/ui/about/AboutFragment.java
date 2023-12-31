package com.example.userapp.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.userapp.R;

import java.util.ArrayList;
import java.util.List;


public class AboutFragment extends Fragment {

    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel>list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_about, container, false);
        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_comp,"Computer Science","The Computer Science and Engineering (CSE) Department at Shahjalal University of Science and Technology (SUST) is a highly regarded department in Bangladesh. It offers undergraduate and postgraduate programs in computer science and engineering and has a faculty that is dedicated to providing students with a strong foundation in computer science theory and practical skills. The department has excellent facilities and state-of-the-art laboratories that support research activities in various areas of computer science and engineering. The CSE Department at SUST is committed to producing skilled and innovative computer science professionals who can make meaningful contributions to the industry and academia."));
        list.add(new BranchModel(R.drawable.ic_comp,"Information Technology","The Department of Information Technology (IT) at Shahjalal University of Science and Technology (SUST) is a highly respected department in Bangladesh. It offers undergraduate and postgraduate programs in information technology, with a curriculum designed to provide students with a strong foundation in the principles of computer science, information technology, and management. The department has a highly qualified faculty who are dedicated to providing students with a comprehensive education in IT. The IT department at SUST has modern facilities and laboratories that support research activities in various areas of information technology, including data analytics, cloud computing, and artificial intelligence. The department is committed to producing skilled IT professionals who can make meaningful contributions to the industry and academia. Overall, the IT department at SUST is committed to providing students with a world-class education in information technology and preparing them for successful careers in the IT industry."));
        list.add(new BranchModel(R.drawable.ic_elec,"Electrical Engineering","The Department of Electrical and Electronic Engineering (EEE) at Shahjalal University of Science and Technology (SUST) is a highly esteemed department that offers undergraduate and postgraduate programs in electrical and electronic engineering. The department has a strong focus on theoretical and practical learning, with a curriculum designed to provide students with a thorough understanding of the fundamental principles of electrical and electronic engineering. The EEE department at SUST has a team of experienced and qualified faculty who are committed to providing students with a high-quality education. The department has modern labs and facilities that support research activities in various areas of electrical and electronic engineering. The EEE department at SUST is recognized for its research contributions and has a strong collaboration with industry and academia. Overall, the EEE department at SUST is committed to producing competent electrical and electronic engineers who can contribute to the development of the country."));
        list.add(new BranchModel(R.drawable.ic_mech,"Mechanical Engineering","The Department of Mechanical Engineering (ME) at Shahjalal University of Science and Technology (SUST) is a well-regarded department in Bangladesh. The department offers undergraduate and postgraduate programs in mechanical engineering and has a curriculum designed to provide students with a strong foundation in the principles of mechanics, thermodynamics, and manufacturing. The ME department at SUST has a team of experienced faculty who are committed to providing students with a high-quality education. The department has excellent facilities and laboratories that support research activities in various areas of mechanical engineering, including materials science, fluid mechanics, and robotics. The ME department at SUST is recognized for its research contributions and has a strong collaboration with industry and academia. Overall, the ME department at SUST is committed to producing competent mechanical engineers who can contribute to the development of the country."));

        adapter = new BranchAdapter(getContext(), list);

        viewPager = view.findViewById(R.id.viewPager);

        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.college_image);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/mycollegeapp-be3a2.appspot.com/o/gallery%2F%5BB%408dbafc0jpg?alt=media&token=15bb43be-4928-4763-96ef-b0ede16093ac")
                .into(imageView);

        return view;

    }
}