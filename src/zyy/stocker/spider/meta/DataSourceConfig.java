package zyy.stocker.spider.meta;

/**
 * ����Դ�����࣬������spring�����ã���������Ҫ�ɼ���Ʊ�Ĵ��뷶Χ�����ڣ��Լ���Ӧ�Ĵ�����
 * 
 * @author zyy
 *
 */
public class DataSourceConfig {
	private String fromCode;
	private String toCode;
	private String fromDate;
	private String toDate;
	private String handleClass;

	public String getFromCode() {
		return fromCode;
	}

	public void setFromCode(String fromCode) {
		this.fromCode = fromCode;
	}

	public String getToCode() {
		return toCode;
	}

	public void setToCode(String toCode) {
		this.toCode = toCode;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getHandleClass() {
		return handleClass;
	}

	public void setHandleClass(String handleClass) {
		this.handleClass = handleClass;
	}

}
