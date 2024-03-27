package com.mock.main.project.mock.Services;

import com.mock.main.project.mock.Entites.Outlet;
import com.mock.main.project.mock.Entites.Terminal;
import com.mock.main.project.mock.Pojo.TerminalPojo;
import com.mock.main.project.mock.Repositories.TerminalRepository;
import com.mock.main.project.mock.ServiceInterfaces.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerminalServiceImpl implements TerminalService {
    @Autowired
    TerminalRepository terminalRepository;

    @Override
    public List<Terminal> getAllTerminals() {
        return terminalRepository.findAll();
    }

    @Override
    public Terminal saveTerminal(TerminalPojo terminalPojo, Outlet outlet) {

        Terminal terminal = new Terminal();
        terminal.setTerminalNumber(terminalPojo.getTerminalNumber());
        terminal.setOutlets(outlet);

        return terminalRepository.save(terminal);
    }
}
