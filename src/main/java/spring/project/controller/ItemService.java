package spring.project.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service


public class ItemService {

	@Autowired
	private ItemRepositary itemRepository;

	private List <Item> items=new ArrayList<>( Arrays.asList(
			new Item("test",1,"check",12,"0001"),
			new Item("test2",2,"check2",11,"0002")
			));
	
	
	public List<Item> getAllItems(){
		List <Item> items=new ArrayList<>();
		itemRepository.findAll()
		.forEach(items::add);
		return items;
	}
	
	
	public Optional <Item> getItem(int no) {
		int id= no;
		return itemRepository.findById(id);
        }
		
	
	

	public void addItem(Item item) {
		itemRepository.save(item);
	}
	
	
	public void UpdateQuantityItem(int amount, int no) {
		for(int i=0; i<items.size(); i++) {
			Item t=items.get(i);
			if(t.getNo()==no) {
				int newQuantity=t.getAmount()-amount;
				t.setAmount(newQuantity);
				itemRepository.save(t);
				return;
			}
		}
		
	}
	
	

	public void deleteItem(int no) {
		itemRepository.deleteById(no);
	}
	
}
