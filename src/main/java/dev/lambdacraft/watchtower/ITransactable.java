package dev.lambdacraft.watchtower;

import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.util.Pair;

public interface ITransactable {
  void trackLatestTransactions();
  List<Pair<Item, Integer>> getTransactions();
}