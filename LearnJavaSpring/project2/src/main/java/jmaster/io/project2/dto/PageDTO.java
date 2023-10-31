package jmaster.io.project2.dto;

import java.util.List;

public class PageDTO<T> {
	
	private int totalPages;
	private long totalElements;
	private List<T> content;
	
	
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	public List<T> getContent() {
		return content;
	}
	public void setContent(List<T> contents) {
		this.content = contents;
	}
	
	
}
