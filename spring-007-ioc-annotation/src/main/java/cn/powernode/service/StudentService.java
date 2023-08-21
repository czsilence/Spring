package cn.powernode.service;

import cn.powernode.dao.StudentDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    //@Resource(name="studentDaoImplForMySQL")
    private StudentDao studentDao;

    //能够出现在属性上和setter方法上，不能出现在构造方法上
    @Resource(name="studentDaoImplForMySQL")
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void deleteStudent(){
        studentDao.deleteById();
    }
}
