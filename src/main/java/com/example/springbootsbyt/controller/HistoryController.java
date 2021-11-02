package com.example.springbootsbyt.controller;

import com.example.springbootsbyt.model.Cartridges;
import com.example.springbootsbyt.model.History;
import com.example.springbootsbyt.service.impl.CartridgeServiceImpl;
import com.example.springbootsbyt.service.impl.HistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class HistoryController {
    private final HistoryServiceImpl historyServiceImpl;
    private final CartridgeServiceImpl cartridgeServiceImpl;

    @Autowired
    public HistoryController(HistoryServiceImpl historyServiceImpl,
                             CartridgeServiceImpl cartridgeService1) {
        this.historyServiceImpl = historyServiceImpl;
        this.cartridgeServiceImpl = cartridgeService1;
    }

    @GetMapping("/history-create/{id}")
    public String createHistoryForm(@PathVariable("id") Integer id,Model model, History history) {
        Cartridges cartridges = cartridgeServiceImpl.findById(id);
        model.addAttribute("cartridges", cartridges);
        model.addAttribute("history", history);
        return "history-create";
    }

    @PostMapping("/history-create/{id}")
    public String createHistory(@PathVariable("id") Integer id,History history) {
        String str1 = Integer.toString(id);
        historyServiceImpl.saveHistory(history);
        return "redirect:/cartridge-moreInfo/" + str1;
    }

    @GetMapping("/cartridge-moreInfo/history-update/{idHistory}/{id}")
    public String updateHistoryForm(@PathVariable("idHistory") Integer idHistory,@PathVariable("id") Integer id, Model model){
        History history = historyServiceImpl.findById(idHistory);
        List<Cartridges> cartridges = cartridgeServiceImpl.findAll();
        model.addAttribute("history", history);
        model.addAttribute("cartridges", cartridges);
        return "history-update";
    }

    @PostMapping("/history-update/{id}")
    public String updateHistory(@PathVariable("id") Integer id, History history1){
        historyServiceImpl.saveHistoryUpdate(history1);
        String str = Integer.toString(id);
        return"redirect:/cartridge-moreInfo/" + str;
    }

    @GetMapping("/cartridge-moreInfo/history-delete/{idHistory}/{id}")
    public String deleteHistory(@PathVariable("idHistory") Integer idHistory, @PathVariable("id") Integer id){
        History history = historyServiceImpl.findById(idHistory);
        historyServiceImpl.deleteById(idHistory,history);
        String str2 = Integer.toString(id);
        return "redirect:/cartridge-moreInfo/" + str2;
    }

}
