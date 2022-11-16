package com.example.homework3_3_3_teachers;



import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> teachersList = new ArrayList<>();
    private RecyclerView rvTeacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addValue();

        rvTeacher = findViewById(R.id.rv_teacher);
        TeacherAdapter teacherAdapter = new TeacherAdapter(teachersList);
        rvTeacher.setAdapter(teacherAdapter);
    }

    private void addValue() {
        teachersList.add("Рамис");
        teachersList.add("Алексей");
        teachersList.add("Баха");
        teachersList.add("Нурсултан");
        teachersList.add("Нурдин");
        teachersList.add("Эсен");
        teachersList.add("Феликс");
        teachersList.add("Нургазы");
        teachersList.add("Талгар");
        teachersList.add("Алмаз");
        teachersList.add("Жаннат");
        teachersList.add("Бексултан");
        teachersList.add("Нооруз");
        teachersList.add("Зульфия");
        teachersList.add("Айзирек");
        teachersList.add("Абай");
        teachersList.add("Мактым");
        teachersList.add("Нурайым");
        teachersList.add("Можно");
        teachersList.add("Десять");
        teachersList.add("Баллов");
        teachersList.add("Потому");
        teachersList.add("Что");
        teachersList.add("Я не копировал");
        teachersList.add("Буду рад!");
    }
}