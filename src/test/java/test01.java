import com.ywl.dto.GspwArchives;
import com.ywl.mapper.GspwArchivesMapper;
import com.ywl.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * Create by ywl--- 2021-09-07-11:44
 **/
public class test01 {
    @Test
    public void test011() {
        SqlSession session = MybatisUtil.getSqlSession();
        GspwArchives archives = session.getMapper(GspwArchivesMapper.class).selectByPrimaryKey(1);
        System.out.println(archives);
    }
}
