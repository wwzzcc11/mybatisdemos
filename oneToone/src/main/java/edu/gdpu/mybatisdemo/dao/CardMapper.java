package edu.gdpu.mybatisdemo.dao;

import edu.gdpu.mybatisdemo.pojo.IdCard;
import edu.gdpu.mybatisdemo.pojo.Person;

public interface CardMapper {
    public void addCard(IdCard card);
    public IdCard queryCardById(int id);
    public void deleteCardById(int id);
    public void updateCard(IdCard card);

}
