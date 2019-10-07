package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import pack.controller.JikwonBean;

@Repository
public class JikwonImpl extends SqlSessionDaoSupport implements JikwonInter {
	public JikwonImpl(SqlSessionFactory factory) {
		setSqlSessionFactory(factory);
	}
	
	@Override
	public List list() throws DataAccessException {
		return getSqlSession().selectList("selectDataAll");
	}

	@Override
	public List search(JikwonBean bean) throws DataAccessException {
		return getSqlSession().selectList("selectSearch", bean);
	}
}