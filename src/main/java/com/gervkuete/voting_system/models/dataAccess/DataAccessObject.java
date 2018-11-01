
package com.gervkuete.voting_system.models.dataAccess;

import java.util.List;


// this interface provides methods for performing CRUD operations
public interface DataAccessObject<Elector> {
    
    Elector getElector(String login, String password);
    List<Elector> getAllElectors();
    int insertElector(String name, String login, String password, boolean voted);
    void updateElector(Elector elector);
    int deleteElector(String login);
}
