package lin.jun.bin.mapper;

import lin.jun.bin.model.SchoolGrade;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SchoolGradeMapper {
    /**
     * 查询所有学院等级
     *
     * @return
     */
    List<SchoolGrade> selectSchoolGradeAll();

    /**
     * 根据ID查询
     *
     * @return
     */
    SchoolGrade selectSchoolGradeById(String id);

    /**
     * 新增
     *
     * @return
     */
    void insertSchoolGrade(SchoolGrade schoolGrade);

    /**
     * 修改
     *
     * @return
     */
    void updateSchoolGrade(SchoolGrade schoolGrade);

    /**
     * 删除
     *
     * @return
     */
    void deleteSchoolGrade(String id);

    /**
     * 多个ID删除
     *
     * @return
     */
    void deleteSchoolGradeList(List<String> ids);
}
