/*
  @author   george
  @project   company-j5
  @class  CompanyServiceImpl
  @version  1.0.0 
  @since 22.05.22 - 23.40
*/

import java.util.List;

public class CompanyServiceImpl implements ICompanyService {
    @Override
    public Company getTopLevelParent(Company child) {
        Company result = child;
        if (child.getParent() != null) {
            result = getTopLevelParent(child.getParent());
        }
            return result;
    }

    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {

        return 0;
    }
}
