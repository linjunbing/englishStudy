package lin.jun.bin.controller;

import lin.jun.bin.mapper.SchoolGradeMapper;
import lin.jun.bin.model.SchoolGrade;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
public class LinController {

    @Resource
    private SchoolGradeMapper schoolGradeMapper;
    @Value("${realPath}")
    String realPath;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");

    @GetMapping("/ces")
    public ModelAndView ces() {
        List<SchoolGrade> schoolGrades = schoolGradeMapper.selectSchoolGradeAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("schoolGrades", schoolGrades);
        mv.setViewName("schoolGrade");
        return mv;
    }

    @GetMapping("/uploadHtml")
    public ModelAndView uploadHtml() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("upload");
        return mv;
    }

    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest req) {
        
        String format = sdf.format(new Date());
        boolean pathBoolean = false;
        String path = "";
        if (pathBoolean) {
            path = this.realPath;
        } else {
            //E:\student\Projects\English-Project\englishStudy\target\classes
            path = Thread.currentThread().getContextClassLoader().getResource("").getPath() + "static\\";
        }

        File file = new File(path + format);
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        String oldName = uploadFile.getOriginalFilename();
        //UUID为36位。
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());
        try {
            uploadFile.transferTo(new File(file, newName));
            String filePath = file + "\\" + newName;
            String filePath2 = req.getScheme() + "://" + req.getServerName()+":"+req.getServerPort() + "/static/" + format+"/" + newName;
            return "本地路径：" + filePath + "  " + "网络路径："+filePath2;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "上传失败";
    }
}
