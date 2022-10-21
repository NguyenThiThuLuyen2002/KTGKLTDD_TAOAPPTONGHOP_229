package com.ktgk.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    private RecyclerView recyclerView;
    private CategoryAdapter categoryAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rcv_category);
        CategoryAdapter categoryAdapter = new CategoryAdapter(getContext());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        categoryAdapter.setData(getListCategory());
        recyclerView.setAdapter(categoryAdapter);

        return view;
    }
    private List<Category> getListCategory(){
        List<Category> listCategory=new ArrayList<>();

        List<Book> listBook = new ArrayList<>();
        listBook.add(new Book(R.drawable.imgbook_damthatbai,"Dám Thất bại"));
        listBook.add(new Book(R.drawable.imgbook_ditim,"Di tìm lẽ sống"));
        listBook.add(new Book(R.drawable.img_bookdongian,"Đơn giản hóa"));
        listBook.add(new Book(R.drawable.imgbook_thaydoi,"Thay đổi bản thân"));

        listBook.add(new Book(R.drawable.imgbook_damthatbai,"Dám Thất bại"));
        listBook.add(new Book(R.drawable.imgbook_thaydoi,"Thay đổi bản thân"));
        listBook.add(new Book(R.drawable.imgbook_ditim,"Di tìm lẽ sống"));
        listBook.add(new Book(R.drawable.img_bookdongian,"Đơn giản hóa"));



        listBook.add(new Book(R.drawable.imgbook_ditim,"Di tìm lẽ sống"));
        listBook.add(new Book(R.drawable.img_bookdongian,"Đơn giản hóa"));
        listBook.add(new Book(R.drawable.imgbook_thaydoi,"Thay đổi bản thân"));
        listBook.add(new Book(R.drawable.imgbook_damthatbai,"Dám Thất bại"));


        listBook.add(new Book(R.drawable.img_bookdongian,"Đơn giản hóa"));
        listBook.add(new Book(R.drawable.imgbook_damthatbai,"Dám Thất bại"));
        listBook.add(new Book(R.drawable.imgbook_ditim,"Di tìm lẽ sống"));
        listBook.add(new Book(R.drawable.imgbook_thaydoi,"Thay đổi bản thân"));

        listCategory.add(new Category("Sách phát triển bản thần",listBook));
        listCategory.add(new Category("Sách Văn học nghệ thuật",listBook));
        listCategory.add(new Category("Sách Truyện, tiểu thuyết",listBook));
        listCategory.add(new Category("Sách Sách thiếu nhi.",listBook));
        listCategory.add(new Category("Sách Chính trị – pháp luật",listBook));
        listCategory.add(new Category("Sách Giáo trình",listBook));


        return listCategory;
    }
    }
