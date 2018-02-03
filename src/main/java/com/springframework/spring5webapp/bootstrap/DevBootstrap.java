package com.springframework.spring5webapp.bootstrap;

import com.springframework.spring5webapp.model.*;
import com.springframework.spring5webapp.repositories.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {



    private UserRepository userRepository;
    private CommunicationRepository communicationRepository;

    public DevBootstrap(UserRepository userRepository, CommunicationRepository communicationRepository) {
        this.userRepository = userRepository;
        this.communicationRepository = communicationRepository;
    }



    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        initData();
    }

    private void initData(){

        //user
        User harish = new User("harish","mandhadi","harish1","dummy","23","male");
        userRepository.save(harish);

        //communication
        Communication communication = new Communication("harishh486@gmail.com","513-884-5013");
        communicationRepository.save(communication);

    }
}
