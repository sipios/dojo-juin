package com.sipios.dojo.realestatebff.controller;

import com.sipios.dojo.realestatebff.controller.dto.UserAmountDTO;
import com.sipios.dojo.realestatebff.controller.dto.UserLevelDTO;
import com.sipios.dojo.realestatebff.controller.dto.UserScoreDTO;
import com.sipios.dojo.realestatebff.controller.mapper.UserAmountMapper;
import com.sipios.dojo.realestatebff.controller.mapper.UserLevelMapper;
import com.sipios.dojo.realestatebff.controller.mapper.UserScoreMapper;
import com.sipios.dojo.realestatebff.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    private final UserAmountMapper userAmountMapper;
    private final UserScoreMapper userScoreMapper;
    private final UserLevelMapper userLevelMapper;

    public UserController(UserService userService, UserAmountMapper userAmountMapper, UserScoreMapper userScoreMapper, UserLevelMapper userLevelMapper) {
        this.userService = userService;
        this.userAmountMapper = userAmountMapper;
        this.userScoreMapper = userScoreMapper;
        this.userLevelMapper = userLevelMapper;
    }

    @GetMapping("amount")
    public UserAmountDTO getUserAmount(){
        return  userAmountMapper.from(userService.getUserAmountDTOService());
    }

    @GetMapping("level")
    public UserLevelDTO getUserLevel() {
        return userLevelMapper.from(userService.getCurrentUserLevel());
    }

    @GetMapping("score")
    public UserScoreDTO getUserScore(){
        return userScoreMapper.from(userService.getUserScore());
    }
}
