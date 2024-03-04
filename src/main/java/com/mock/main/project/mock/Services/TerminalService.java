package com.mock.main.project.mock.Services;

import com.mock.main.project.mock.Entites.Outlet;
import com.mock.main.project.mock.Entites.Terminal;
import com.mock.main.project.mock.Pojo.TerminalPojo;

import java.util.List;

public interface TerminalService {

    List<Terminal> getAllTerminals();

    Terminal saveTerminal(TerminalPojo terminalPojo, Outlet outlet);

}
