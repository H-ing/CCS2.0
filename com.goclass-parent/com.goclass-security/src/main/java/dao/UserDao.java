package dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.goclass.pojo.User;

@Mapper
@Repository
public interface UserDao {
	@Select("SELECT * FROM tb_user WHERE accounts = #{accounts}")
	public User hasUser(String accounts);
}
