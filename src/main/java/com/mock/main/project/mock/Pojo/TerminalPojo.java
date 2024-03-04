package com.mock.main.project.mock.Pojo;

import com.mock.main.project.mock.Entites.Outlet;
import lombok.*;

import java.util.List;

@Data
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class TerminalPojo {

    private Long id;
    @NonNull
    private Long terminalNumber;

    private List<OutletPojo> outlets;

}
