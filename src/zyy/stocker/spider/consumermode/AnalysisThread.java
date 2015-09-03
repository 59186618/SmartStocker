package zyy.stocker.spider.consumermode;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;

import zyy.stocker.model.Stock;
import zyy.stocker.service.StockService;
import zyy.stocker.spider.meta.IDataSource;

/**
 * 
 * �������ݽ������洢���߳�
 * 
 * @author zyy
 *
 */

public class AnalysisThread extends Thread {
	BlockingQueue<IDataSource> queues;
	int size = 0;

	public AnalysisThread(BlockingQueue<IDataSource> queues) {
		this.queues = queues;
	}

	@Override
	public void run() {

		try {
			while (true) {
				IDataSource dataSource = queues.take();
				System.out.println("ȡ��һ������" + queues.size() + ",������"
						+ (++size));
				Iterator<Stock> iterator = dataSource.getIterator(null);
				Stock stock;
				while (iterator.hasNext()) {
					stock = iterator.next();
					StockService.getInstance().addStock(stock);
				}
				StockService.getInstance().commint();
				System.out.println("������"
						+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
								.format(new Date()));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void start(IDataSource dataSource) {
	}
}
