package com.java110.user.bmo.questionAnswerTitleValue;
import com.java110.dto.questionAnswerTitleValue.QuestionAnswerTitleValueDto;
import org.springframework.http.ResponseEntity;
public interface IGetQuestionAnswerTitleValueBMO {


    /**
     * 查询答卷选项
     * add by wuxw
     * @param  questionAnswerTitleValueDto
     * @return
     */
    ResponseEntity<String> get(QuestionAnswerTitleValueDto questionAnswerTitleValueDto);


}