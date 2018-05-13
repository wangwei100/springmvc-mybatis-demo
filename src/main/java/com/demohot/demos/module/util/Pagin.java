package com.demohot.demos.module.util;

import java.util.List;

public class Pagin<T> {

	/** 分页栏显示多少条 */
	private static final int NavSize = 10;

	public static <T> Pagin<T> parse(List<T> rows, Long count) {
		return parse(rows, null, null, count, NavSize);
	}

	public static <T> Pagin<T> parse(List<T> rows, Integer page, Integer size, Long count) {
		return parse(rows, page, size, count, NavSize);
	}

	public static <T> Pagin<T> parse(List<T> rows, Integer page, Integer size, Long count, Integer nav_size) {
		if (null == rows || rows.size() < 1) {
			return null;
		}
		if (null == page) {
			page = 1;
		}
		if (null == size) {
			size = rows.size();
		}
		if (null == count) {
			count = (long) rows.size();
		}
		Pagin<T> r = new Pagin<T>();
		r.page = page;
		r.size = size;
		r.rows = rows;
		r.count = count;
		r.pages = (long) Math.ceil((double) count / size);
		// 页面范围
		r.start_page = r.page - (nav_size % 2 == 0 ? nav_size / 2 - 1 : nav_size / 2);
		r.end_page = r.page + nav_size / 2;
		if (r.start_page < 1) {
			r.start_page = 1;
			if (r.pages >= nav_size)
				r.end_page = nav_size;
			else
				r.end_page = r.pages;
		}
		if (r.end_page > r.pages) {
			r.end_page = r.pages;
			if ((r.end_page - nav_size) > 0)
				r.start_page = r.end_page - nav_size + 1;
			else
				r.start_page = 1;
		}
		// 首页
		if (r.start_page > 1) {
			r.top_page = 1;
		}
		// 尾页
		if (r.end_page < r.pages) {
			r.bottom_page = r.pages;
		}
		// 上一页
		if (r.page > 1) {
			r.previous_page = page - 1;
		}
		// 下一页
		if (r.page < r.pages) {
			r.next_page = r.page + 1;
		}
		return r;
	}

	private List<T> rows;

	/** 第n页，从1开始 */
	private int page;

	/** 每页n条，从1开始 */
	private int size;

	/** 记录数 */
	private long count;

	/** 共n页，从1开始 */
	private long pages;

	private long top_page;

	private long bottom_page;

	private long previous_page;

	private long next_page;

	private long start_page;

	private long end_page;

	private Pagin() {
	}

	@Override
	public String toString() {
		return JsonUtils.toJsonString(this);
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public long getPages() {
		return pages;
	}

	public void setPages(long pages) {
		this.pages = pages;
	}

	public long getTop_page() {
		return top_page;
	}

	public void setTop_page(long top_page) {
		this.top_page = top_page;
	}

	public long getBottom_page() {
		return bottom_page;
	}

	public void setBottom_page(long bottom_page) {
		this.bottom_page = bottom_page;
	}

	public long getPrevious_page() {
		return previous_page;
	}

	public void setPrevious_page(long previous_page) {
		this.previous_page = previous_page;
	}

	public long getNext_page() {
		return next_page;
	}

	public void setNext_page(long next_page) {
		this.next_page = next_page;
	}

	public long getStart_page() {
		return start_page;
	}

	public void setStart_page(long start_page) {
		this.start_page = start_page;
	}

	public long getEnd_page() {
		return end_page;
	}

	public void setEnd_page(long end_page) {
		this.end_page = end_page;
	}

}
