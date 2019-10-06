package lin.jun.bin.mapper;

import lin.jun.bin.model.SortList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SortListMapper {
    /**
     *  查询所有分类
     * @return
     */
    List<SortList> selectSortListAll();

    /**
     * 根据ID查询
     *
     * @return
     */
    SortList selectSortListById(String id);

    /**
     * 新增
     *
     * @return
     */
    void insertSortList(SortList schoolGrade);

    /**
     * 修改
     *
     * @return
     */
    void updateSortList(SortList schoolGrade);

    /**
     * 删除
     *
     * @return
     */
    void deleteSortList(String id);

    /**
     * 多个ID删除
     *
     * @return
     */
    void deleteSortListList(List<String> ids);
}
