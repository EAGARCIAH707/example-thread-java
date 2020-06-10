/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.MasterController;
import view.MasterView;

/**
 * @author AndresG
 */
public class Main {

    public static void main(String[] args) {
        MasterView masterView = new MasterView();
        MasterController masterController = new MasterController(masterView);
        masterView.addController(masterController);
        masterView.setVisible(true);
        masterView.setLocationRelativeTo(null);
    }

}
