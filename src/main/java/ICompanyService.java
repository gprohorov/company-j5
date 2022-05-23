
import java.util.List;

/**
 * Created by george on 12/2/16.
 */
public interface ICompanyService {
    /**
     * @param child - company for whom we are searching the top level parent
     *              (parent of parent of ...)
     * @return top level paren
     */
    Company getTopLevelParent(Company child);

    /**
     * @param company   - company for whom we are searching the count of employees
     *                  (count of this company employees +
     *                  count employees of all children and their children employees )
     * @param companies - list of all available companies
     * @return count of employees
     */
    long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies);
}