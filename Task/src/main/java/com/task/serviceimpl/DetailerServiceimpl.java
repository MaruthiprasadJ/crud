package com.task.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.DTO.DetailerDTO;
import com.task.model.Detailer;
import com.task.repository.DetailerRepository;
import com.task.service.DetailerService;
import com.task.util.DetailerUtil;
@Service
public class DetailerServiceimpl extends DetailerUtil implements DetailerService {
	
	@Autowired
	private DetailerRepository detailerRepository;

	@Override
	public DetailerDTO addDetailer(DetailerDTO detailerDTO) {
		Detailer det = detailerRepository.save(convertDetailerDTOtoDO(detailerDTO));
		return convertDetailerDOtoDTO(det);
	}

	@Override
	public List<Detailer> getAllDetailer() {
		List<Detailer> findall = detailerRepository.findAll();
		return findall;
	}

	@Override
	public DetailerDTO updateDetailer(DetailerDTO detailerDTO) {
		Detailer det = detailerRepository.save(convertDetailerDTOtoDO(detailerDTO));
		return convertDetailerDOtoDTO(det);
	}

	@Override
	public String deleteDetailerById(long id) {
		detailerRepository.deleteById(id);
		return "deteted the detailer by id";
	}

	@Override
	public String getDetailerById(long id) {
		detailerRepository.getById(id);
		return "we get deatailer by id";
	}

	@Override
	public String updateDetailerStatudById(long id ,String status) {
		detailerRepository.updateDetailerStatusdById(id,status);
		return "employee status has been updated sucessfully";
	}
	

}
