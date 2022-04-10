import edu.gdpu.mybatisdemo.dao.CardMapper;
import edu.gdpu.mybatisdemo.dao.PersonMapper;
import edu.gdpu.mybatisdemo.pojo.IdCard;
import edu.gdpu.mybatisdemo.pojo.Person;
import edu.gdpu.mybatisdemo.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTEST {
    @Test
    public void test01(){
        SqlSession session = MyBatisUtil.getSession();
        CardMapper mapper = session.getMapper(CardMapper.class);
        mapper.deleteCardById(4);
    }
    @Test
    public void test02(){
        SqlSession session = MyBatisUtil.getSession();
        CardMapper mapper = session.getMapper(CardMapper.class);
        IdCard idCard = mapper.queryCardById(2);
        System.out.println(idCard);
    }
    @Test
    public void test03(){
        SqlSession session = MyBatisUtil.getSession();
        CardMapper mapper = session.getMapper(CardMapper.class);
        mapper.addCard(new IdCard(4,33));
    }
    @Test
    public void test04(){
        SqlSession session = MyBatisUtil.getSession();
        PersonMapper mapper = session.getMapper(PersonMapper.class);
        Person person = mapper.queryPersonById(2);
        System.out.println(person);
    }
    @Test
    public void test05(){
        SqlSession session = MyBatisUtil.getSession();
        PersonMapper mapper = session.getMapper(PersonMapper.class);
        Person person = mapper.queryPersonWithCard(2);
        System.out.println(person);
    }
}
