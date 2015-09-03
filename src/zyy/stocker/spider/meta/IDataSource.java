package zyy.stocker.spider.meta;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import zyy.stocker.model.Stock;

/**
 * ����Դ�Ľӿڣ����ڻ�ȡ����Դ����������
 * 
 * @author zyy
 *
 */
public interface IDataSource {
	/**
	 * ��ȡ��������Դ�����ý�������Ӧ��URL
	 * 
	 * @return URL
	 */
	public String getURL();

	/**
	 * ��ȡ������Դ�����������ʵ��
	 * 
	 * @param inputStream
	 *            ��Ҫ���н�������
	 * @return �����������ʵ��ĵ�����
	 */
	public Iterator<Stock> getIterator(InputStream inputStream);

	// public void config(String code, String begindate, String enddate);

	/**
	 * ��������Դ���ã���ȡ����Դ�б�
	 * 
	 * @param dataSourceConfig
	 *            ����������Դ����
	 * @return ����Դ�б�
	 */
	public List<IDataSource> getDataSources(DataSourceConfig dataSourceConfig);

	public void setInputStream(InputStream inputStream);
}
