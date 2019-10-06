package lin.jun.bin.mapper;

import lin.jun.bin.model.WordsList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WordsListMapper {
    /**
     * 查询所有单词
     *
     * @return
     */
    List<WordsList> selectWordsListAll();

    /**
     * 根据ID查询
     *
     * @return
     */
    WordsList selectWordsListById(String id);

    /**
     * 新增
     *
     * @return
     */
    void insertWordsList(WordsList schoolGrade);

    /**
     * 修改
     *
     * @return
     */
    void updateWordsList(WordsList schoolGrade);

    /**
     * 删除
     *
     * @return
     */
    void deleteWordsList(String id);

    /**
     * 多个ID删除
     *
     * @return
     */
    void deleteWordsListList(List<String> ids);
}
