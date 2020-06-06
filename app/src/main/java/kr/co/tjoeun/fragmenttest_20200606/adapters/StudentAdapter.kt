package kr.co.tjoeun.fragmenttest_20200606.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.co.tjoeun.fragmenttest_20200606.R
import kr.co.tjoeun.fragmenttest_20200606.datas.Student

class StudentAdapter(context: Context, resId : Int, list: List<Student>) : ArrayAdapter<Student>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        tempRow?.let {
//            null이 아닌 경우
        }.let {
//            null인 경우
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }
        val row = tempRow!!


        return row
    }

}