package spring.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private ItemService itemService;
	
	
	//@RequestMapping("/items/")
	@RequestMapping(method=RequestMethod.GET, value="/items/")
	public List<Item> getAllItems() {
		return itemService.getAllItems();
	}
	
	//@RequestMapping("/items/{no}")
	@RequestMapping(method=RequestMethod.GET, value="/items/{no}")
	public  Optional <Item>  getItem(@PathVariable int no) {
		return itemService.getItem(no);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/items/")
	public void addItem(@RequestBody Item item) {
		itemService.addItem(item);
	}
	
	
	@RequestMapping(method=RequestMethod.PATCH, value="/items/{no}")
	public void UpdateQuantityItem(@RequestParam int amount,@PathVariable int no) {
		itemService.UpdateQuantityItem(amount, no);
	}
	
	

	@RequestMapping(method=RequestMethod.DELETE, value="/items/{no}")
	public void deleteItem(@PathVariable int no) {
		 itemService.deleteItem(no);
	}
	
}
