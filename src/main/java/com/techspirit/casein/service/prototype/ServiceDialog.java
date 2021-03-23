package com.techspirit.casein.service.prototype;

import com.techspirit.casein.model.Dialog;


public interface ServiceDialog {
    /**
     * Возвращает диалог по его ID
     * @param id - id диалога
     * @return - диалога с заданным ID
     */
    Dialog read(int id);
}
