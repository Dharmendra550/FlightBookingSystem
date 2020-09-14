package com.pack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pack.entity.Ticket;
import com.pack.repository.TicketRepository;


@RestController
public class TicketRestController 
{
@Autowired
TicketRepository repo;

@GetMapping("/Alltickets")
public ResponseEntity<List<Ticket>> getAlltickets()
{
	List<Ticket> ticket=repo.findAll();
	return new ResponseEntity<List<Ticket>>(ticket,HttpStatus.OK);
}
@GetMapping("/Alltickets/{ticketid}")
public ResponseEntity<Optional<Ticket>> getTickeId(@PathVariable("ticketid") Integer  ticketId)
{
Optional<Ticket> opt=repo.findById(ticketId);
	
	return   new  ResponseEntity<Optional<Ticket>>(opt, HttpStatus.OK);
}
@PostMapping("/Alltickets/create")
public String storeTicket(@RequestBody Ticket ticket)
{
	boolean flag=repo.existsById(ticket.getTicketid());
	{
		if(flag==true)
		{
			return "Ticket is Rejected";
		}
		else
		{
			repo.save(ticket);
			return "Ticket is booking successfully";
		}
	}
			
}
@PutMapping("/Alltickets/update")
public String storeupdateTicket(@RequestBody Ticket ticket)
{
	boolean flag=repo.existsById(ticket.getTicketid());
	{
		if(flag==true)
		{
			return "Ticket is not updated";
		}
		else
		{
			repo.saveAndFlush(ticket);
			return "Ticket is updated successfully";
		}
	}
}
@DeleteMapping("/Alltickets/delete")
public   String   deleteTicket(@RequestParam("ticketid") Integer   ticketId) {
	
	boolean  flag=repo.existsById(ticketId);
	if(flag==true) {
		repo.deleteById(ticketId);
		return  "The ticket is  deleted.";
		
	}
	else {
		return  "Sorry, The ticket doesn't  exist";
	}
}

}
