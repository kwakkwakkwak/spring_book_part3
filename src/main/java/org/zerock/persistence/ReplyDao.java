package org.zerock.persistence;

import org.zerock.domain.ReplyVO;

import java.util.List;

public interface ReplyDao {

    public List<ReplyVO> list(Integer bno) throws Exception;

    public void create(ReplyVO vo) throws Exception;

    public void update(ReplyVO vo) throws Exception;

    public void delete(Integer rno) throws Exception;
}
