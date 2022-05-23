import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
  @author   george
  @project   company-j5
  @class  CompanyServiceImplTest
  @version  1.0.0 
  @since 22.05.22 - 23.42
*/

class CompanyServiceImplTest {
    Company single = new Company(null, 111);
    Company root = new Company(null, 5);
    Company booking = new Company(root, 3);
    CompanyServiceImpl underTest = new CompanyServiceImpl();

    @Test
    public void whenCompanyIsSingleThenTopLevelIsTheSameCompany(){
        Company actual = underTest.getTopLevelParent(single);
        assertEquals(single, actual);
    }

    @Test
    public void whenCompanyIsOnTopThenTopLevelIsTheSameCompany(){
        Company actual = underTest.getTopLevelParent(root);
        assertEquals(root, actual);
    }

    @Test
    public void whenCompanyIsInsideChainThenTopLevelIsTheCompanyWithParentNull(){
        Company actual = underTest.getTopLevelParent(booking);
        assertEquals(root, actual);
    }

}
