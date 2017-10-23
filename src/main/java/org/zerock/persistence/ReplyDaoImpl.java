package org.zerock.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.ReplyVO;

import javax.inject.Inject;
import javax.swing.*;
import java.util.List;

@Repository
public class ReplyDaoImpl implements ReplyDao{

    @Inject
    private SqlSession session;

    private static String namespace ="org.zerrock.mapper.ReplyMapper";


    @Override
    public List<ReplyVO> list(Integer bno) throws Exception {
        return session.selectList(namespace+".list",bno);
    }

    @Override
    public void create(ReplyVO vo) throws Exception {
        session.insert(namespace+".create",vo);

    }

    @Override
    public void update(ReplyVO vo) throws Exception {
        session.update(namespace+".update",vo);
    }

    @Override
    public void delete(Integer rno) throws Exception {
        session.delete(namespace+".delete",rno);
    }
}
