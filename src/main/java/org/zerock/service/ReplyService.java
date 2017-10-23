package org.zerock.service;

import org.zerock.domain.ReplyVO;

import java.util.List;

public interface ReplyService {
    public void addReply(ReplyVO vo) throws Exception;

    public List<ReplyVO> listReply(Integer bno) throws Exception;

    public void modifyReply(ReplyVO vo) throws  Exception;

    public void removeReply(Integer rno)  throws  Exception;

}
