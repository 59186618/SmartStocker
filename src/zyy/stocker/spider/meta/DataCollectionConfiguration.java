package zyy.stocker.spider.meta;

import java.util.List;

/**
 * ���ݲɼ����������࣬��������Ҫ�ɶ������Դ���ù���
 * 
 * @author zyy
 *
 */
public class DataCollectionConfiguration {
	private int MaxThread;
	private int MAX_LIST_SIZE = 10;
	private List<DataSourceConfig> dataSourceConfigs;

	public int getMaxThread() {
		return MaxThread;
	}

	public void setMaxThread(int maxThread) {
		MaxThread = maxThread;
	}

	public List<DataSourceConfig> getDataSourceConfigs() {
		return dataSourceConfigs;
	}

	public void setDataSourceConfigs(List<DataSourceConfig> dataSourceConfigs) {
		this.dataSourceConfigs = dataSourceConfigs;
	}

	public int getMAX_LIST_SIZE() {
		return MAX_LIST_SIZE;
	}

	public void setMAX_LIST_SIZE(int mAX_LIST_SIZE) {
		MAX_LIST_SIZE = mAX_LIST_SIZE;
	}

}
