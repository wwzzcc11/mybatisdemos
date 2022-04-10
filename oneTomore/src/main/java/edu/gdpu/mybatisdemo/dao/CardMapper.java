package edu.gdpu.mybatisdemo.dao;

import edu.gdpu.mybatisdemo.pojo.Card;

/**
 * @author:ws
 * @Date:2022/3/29/029
 * @description:learning
 */
public interface CardMapper {

    public void addCard(Card card);

    public void deleteCard(int id);

    public Card queryCardById(int id);
}
