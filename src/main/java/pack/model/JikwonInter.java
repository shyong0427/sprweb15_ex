package pack.model;

import java.util.List;

import org.springframework.dao.DataAccessException;

import pack.controller.JikwonBean;

public interface JikwonInter {
	List list() throws DataAccessException;
	List search(JikwonBean bean) throws DataAccessException;
}
