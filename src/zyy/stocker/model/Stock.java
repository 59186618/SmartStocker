package zyy.stocker.model;

public class Stock {
	private String code;
	private String date;
	private float openPrice;
	private float closePrice;
	private float maxPrice;
	private float leastPrice;
	private float turnOverRate;// ������
	private float turnVolumn;// �ɽ���
	private float volumn;// �ɽ���
	private float changeRate;// �ǵ���

	public String getCode() {
		return code;
	}

	public Stock setCode(String code) {
		this.code = code;
		return this;
	}

	public String getDate() {
		return date;
	}

	public Stock setDate(String date) {
		this.date = date;
		return this;
	}

	public float getOpenPrice() {
		return openPrice;
	}

	public Stock setOpenPrice(float openPrice) {
		this.openPrice = openPrice;
		return this;
	}

	public float getClosePrice() {
		return closePrice;
	}

	public Stock setClosePrice(float closePrice) {
		this.closePrice = closePrice;
		return this;
	}

	public float getMaxPrice() {
		return maxPrice;
	}

	public Stock setMaxPrice(float maxPrice) {
		this.maxPrice = maxPrice;
		return this;
	}

	public float getLeastPrice() {
		return leastPrice;
	}

	public Stock setLeastPrice(float leastPrice) {
		this.leastPrice = leastPrice;
		return this;
	}

	public float getTurnOverRate() {
		return turnOverRate;
	}

	public Stock setTurnOverRate(float turnOverRate) {
		this.turnOverRate = turnOverRate;
		return this;
	}

	public float getTurnVolumn() {
		return turnVolumn;
	}

	public Stock setTurnVolumn(float turnVolumn) {
		this.turnVolumn = turnVolumn;
		return this;
	}

	public Float getVolumn() {
		return volumn;
	}

	public Stock setVolumn(Float volumn) {
		this.volumn = volumn;
		return this;
	}

	public float getChangeRate() {
		return changeRate;
	}

	public Stock setChangeRate(float changeRate) {
		this.changeRate = changeRate;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append("��Ʊ���룺");
		sb.append(code);
		sb.append("��ʱ�䣺");
		sb.append(date);
		sb.append("�����̼ۣ�");
		sb.append(openPrice);
		sb.append("�����̼ۣ�");
		sb.append(closePrice);
		sb.append(",��߼ۣ�");
		sb.append(maxPrice);
		sb.append(",��ͼۣ�");
		sb.append(leastPrice);
		sb.append(",�����ʣ�");
		sb.append(turnOverRate);
		sb.append(",�ɽ��");
		sb.append(turnVolumn);
		sb.append(",�ɽ�����");
		sb.append(volumn);
		sb.append(",�ǵ�����");
		sb.append(changeRate);
		sb.append("]");
		return sb.toString();
	}
}
