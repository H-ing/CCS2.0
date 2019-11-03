package dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.goclass.pojo.Role;

@Mapper
@Repository
public interface RoleDao {
	@Select("SELECT FROM tb_role WHERE role_id <= #{roleId}")
	public List<Role> queryRoles(Integer roleId);
}
