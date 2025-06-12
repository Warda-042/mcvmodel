/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import View.View;

/**
 *
 * @author WARDA YOUSAF
 */
public class Controller {
        private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setData(String data) {
        model.setData(data);
    }

    public String getData() {
        return model.getData();
    }

    public void updateView() {
        view.printData(getData());
    }
}
