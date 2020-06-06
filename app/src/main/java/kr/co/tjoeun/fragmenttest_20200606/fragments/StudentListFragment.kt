package kr.co.tjoeun.fragmenttest_20200606.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.fragment_student_list.*
import kr.co.tjoeun.fragmenttest_20200606.R
import kr.co.tjoeun.fragmenttest_20200606.adapters.StudentAdapter
import kr.co.tjoeun.fragmenttest_20200606.datas.Student

class StudentListFragment : BaseFragment() {

    val studentList = ArrayList<Student>()
    lateinit var mStudentAdapter : StudentAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_student_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        studentList.add(Student("조경진", 1988, true))
        studentList.add(Student("김광철", 1966, true))
        studentList.add(Student("김재환", 1993, true))
        studentList.add(Student("박수정", 1994, false))
        studentList.add(Student("신용성", 1988, true))
        studentList.add(Student("엄곤지", 1984, false))
        studentList.add(Student("이승원", 1978, true))
        studentList.add(Student("이현호", 1981, true))

        mStudentAdapter = StudentAdapter(mContext, R.layout.student_list_item, studentList)
        studentListView.adapter = mStudentAdapter
    }



}