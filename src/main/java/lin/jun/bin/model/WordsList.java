package lin.jun.bin.model;

/**
 * 单词
 */
public class WordsList {

    private String id;
    /**
     * 单词英文
     */
    private String word;
    /**
     * 单词中文
     */
    private String wordName;
    /**
     * 添加时间
     */
    private String addTime;
    /**
     * 学院等级
     */
    private String schoolGradeId;
    /**
     * 类别
     */
    private String sortId;
    /**
     * 近义词
     */
    private String synonymId;
    /**
     * 相似词
     */
    private String similarWordId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWordName() {
        return wordName;
    }

    public void setWordName(String wordName) {
        this.wordName = wordName;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getSchoolGradeId() {
        return schoolGradeId;
    }

    public void setSchoolGradeId(String schoolGradeId) {
        this.schoolGradeId = schoolGradeId;
    }

    public String getSortId() {
        return sortId;
    }

    public void setSortId(String sortId) {
        this.sortId = sortId;
    }

    public String getSynonymId() {
        return synonymId;
    }

    public void setSynonymId(String synonymId) {
        this.synonymId = synonymId;
    }

    public String getSimilarWordId() {
        return similarWordId;
    }

    public void setSimilarWordId(String similarWordId) {
        this.similarWordId = similarWordId;
    }

    @Override
    public String toString() {
        return "WordsList{" +
                "id='" + id + '\'' +
                ", word='" + word + '\'' +
                ", wordName='" + wordName + '\'' +
                ", addTime='" + addTime + '\'' +
                ", schoolGradeId='" + schoolGradeId + '\'' +
                ", sortId='" + sortId + '\'' +
                ", synonymId='" + synonymId + '\'' +
                ", similarWordId='" + similarWordId + '\'' +
                '}';
    }
}
