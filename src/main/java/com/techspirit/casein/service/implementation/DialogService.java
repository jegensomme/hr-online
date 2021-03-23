package com.techspirit.casein.service.implementation;


import com.techspirit.casein.model.Dialog;
import com.techspirit.casein.repository.DialogRepository;
import com.techspirit.casein.service.prototype.ServiceDialog;
import org.springframework.stereotype.Service;

@Service
public class DialogService implements ServiceDialog {
    private final DialogRepository dialogRepository;

    public DialogService(DialogRepository dialogRepository) {
        this.dialogRepository = dialogRepository;
    }

    @Override
    public Dialog read(int id){
        return dialogRepository.getOne(id);
    }
}
