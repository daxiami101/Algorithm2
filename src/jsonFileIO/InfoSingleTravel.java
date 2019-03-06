/**
 * 
 */
package jsonFileIO;

public class InfoSingleTravel{

	private String orderNo;//订单号
	private String driverName;//司机姓名
	private String driverIdCode;//网约车驾驶员证号（即身份证号）
	private String vehicleLicense;//车牌号码
	private Double realVehicleLon;//车辆实际出发地点经度 
	private Double realVehicleLat;//车辆实际出发地点纬度
	private Double destVehLon;//车辆实际到达地点经度
	private Double destVehLat;//车辆实际到达地点纬度
	private String onTime;//实际上车时间
	private String offTime;//实际下车时间
	private String realOnLocation;//实际上车地点
	private String realOffLocation;//实际下车地点
	private String passengerTel;//乘客电话
	private Double passengerMil;//载客里程
	private Double noneMil;//空驶里程
	private Double passengerTime;//载客时间
	private Double cash;//现金支付金额
	private Double elePay;//电子支付金额
	private Double posPay;//Pos机支付金额
	private Double bargain;//优惠金额
	private Double paid;//实收金额
	private Double receivable;//应收金额
	private Double callCharge;//电召费/预约服务费
	private Double extraCharge;//附加费
	private Double otherExtraCharge;//其他附加费用
	private Double dynamicsAddCharge;//动态加价金额
	private Double rushAddCharge;//高峰时段时间加价金额
	private Double nightAddCharge;//夜间时段里程加价金额
	private String transPriceType;//运价类型 
	private String posAgency;//Pos机收单机构
	private String ePay;//电子支付机构
	private String calStatus;//结算状态0：未结算 1：已结算
	private String calTime;//结算时间
	private String billStatus;//发票状态 0：未开 1：已开
	private String createTime;//创建时间
	private String updateTime;//更新时间
	private String dataSource;//数据来源
	private String partDate;//分区
	
	//新增字段20170110
	private Double specialTimes;//特殊情况加价倍数
	private String specialTimesNote;//特殊情况加价倍数说明
	//新增字段20170306
	private Double driverIncome;//司机实际收入
	//新增字段20170322
	private Double lowSpeedTime;//低速时长
	private Double driverReceivable;//司机应收金额
	private Double waitMil;//调度里程
	private Double waitingTime;//等候时间
	private Double waitingCharge;//等候费用
	//20170414新增字段
	private String receiveTime;//消息接收时间	
	//20170425新增字段
	private String orderTime;//下单时间
	//新增字段20170626
	private String operateFlag;//专快标识
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverIdCode() {
		return driverIdCode;
	}
	public void setDriverIdCode(String driverIdCode) {
		this.driverIdCode = driverIdCode;
	}
	public String getVehicleLicense() {
		return vehicleLicense;
	}
	public void setVehicleLicense(String vehicleLicense) {
		this.vehicleLicense = vehicleLicense;
	}
	public Double getRealVehicleLon() {
		return realVehicleLon;
	}
	public void setRealVehicleLon(Double realVehicleLon) {
		this.realVehicleLon = realVehicleLon;
	}
	public Double getRealVehicleLat() {
		return realVehicleLat;
	}
	public void setRealVehicleLat(Double realVehicleLat) {
		this.realVehicleLat = realVehicleLat;
	}
	public Double getDestVehLon() {
		return destVehLon;
	}
	public void setDestVehLon(Double destVehLon) {
		this.destVehLon = destVehLon;
	}
	public Double getDestVehLat() {
		return destVehLat;
	}
	public void setDestVehLat(Double destVehLat) {
		this.destVehLat = destVehLat;
	}
	public String getOnTime() {
		return onTime;
	}
	public void setOnTime(String onTime) {
		this.onTime = onTime;
	}
	public String getOffTime() {
		return offTime;
	}
	public void setOffTime(String offTime) {
		this.offTime = offTime;
	}
	public String getRealOnLocation() {
		return realOnLocation;
	}
	public void setRealOnLocation(String realOnLocation) {
		this.realOnLocation = realOnLocation;
	}
	public String getRealOffLocation() {
		return realOffLocation;
	}
	public void setRealOffLocation(String realOffLocation) {
		this.realOffLocation = realOffLocation;
	}
	public String getPassengerTel() {
		return passengerTel;
	}
	public void setPassengerTel(String passengerTel) {
		this.passengerTel = passengerTel;
	}
	public Double getPassengerMil() {
		return passengerMil;
	}
	public void setPassengerMil(Double passengerMil) {
		this.passengerMil = passengerMil;
	}
	public Double getNoneMil() {
		return noneMil;
	}
	public void setNoneMil(Double noneMil) {
		this.noneMil = noneMil;
	}
	public Double getPassengerTime() {
		return passengerTime;
	}
	public void setPassengerTime(Double passengerTime) {
		this.passengerTime = passengerTime;
	}
	public Double getCash() {
		return cash;
	}
	public void setCash(Double cash) {
		this.cash = cash;
	}
	public Double getElePay() {
		return elePay;
	}
	public void setElePay(Double elePay) {
		this.elePay = elePay;
	}
	public Double getPosPay() {
		return posPay;
	}
	public void setPosPay(Double posPay) {
		this.posPay = posPay;
	}
	public Double getBargain() {
		return bargain;
	}
	public void setBargain(Double bargain) {
		this.bargain = bargain;
	}
	public Double getPaid() {
		return paid;
	}
	public void setPaid(Double paid) {
		this.paid = paid;
	}
	public Double getReceivable() {
		return receivable;
	}
	public void setReceivable(Double receivable) {
		this.receivable = receivable;
	}
	public Double getCallCharge() {
		return callCharge;
	}
	public void setCallCharge(Double callCharge) {
		this.callCharge = callCharge;
	}
	public Double getExtraCharge() {
		return extraCharge;
	}
	public void setExtraCharge(Double extraCharge) {
		this.extraCharge = extraCharge;
	}
	public Double getOtherExtraCharge() {
		return otherExtraCharge;
	}
	public void setOtherExtraCharge(Double otherExtraCharge) {
		this.otherExtraCharge = otherExtraCharge;
	}
	public Double getDynamicsAddCharge() {
		return dynamicsAddCharge;
	}
	public void setDynamicsAddCharge(Double dynamicsAddCharge) {
		this.dynamicsAddCharge = dynamicsAddCharge;
	}
	public Double getRushAddCharge() {
		return rushAddCharge;
	}
	public void setRushAddCharge(Double rushAddCharge) {
		this.rushAddCharge = rushAddCharge;
	}
	public Double getNightAddCharge() {
		return nightAddCharge;
	}
	public void setNightAddCharge(Double nightAddCharge) {
		this.nightAddCharge = nightAddCharge;
	}
	public String getTransPriceType() {
		return transPriceType;
	}
	public void setTransPriceType(String transPriceType) {
		this.transPriceType = transPriceType;
	}
	public String getPosAgency() {
		return posAgency;
	}
	public void setPosAgency(String posAgency) {
		this.posAgency = posAgency;
	}
	public String getePay() {
		return ePay;
	}
	public void setePay(String ePay) {
		this.ePay = ePay;
	}
	public String getCalStatus() {
		return calStatus;
	}
	public void setCalStatus(String calStatus) {
		this.calStatus = calStatus;
	}
	public String getCalTime() {
		return calTime;
	}
	public void setCalTime(String calTime) {
		this.calTime = calTime;
	}
	public String getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getDataSource() {
		return dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	public String getPartDate() {
		return partDate;
	}
	public void setPartDate(String partDate) {
		this.partDate = partDate;
	}
	public Double getSpecialTimes() {
		return specialTimes;
	}
	public void setSpecialTimes(Double specialTimes) {
		this.specialTimes = specialTimes;
	}
	public String getSpecialTimesNote() {
		return specialTimesNote;
	}
	public void setSpecialTimesNote(String specialTimesNote) {
		this.specialTimesNote = specialTimesNote;
	}
	public Double getDriverIncome() {
		return driverIncome;
	}
	public void setDriverIncome(Double driverIncome) {
		this.driverIncome = driverIncome;
	}
	public Double getLowSpeedTime() {
		return lowSpeedTime;
	}
	public void setLowSpeedTime(Double lowSpeedTime) {
		this.lowSpeedTime = lowSpeedTime;
	}
	public Double getDriverReceivable() {
		return driverReceivable;
	}
	public void setDriverReceivable(Double driverReceivable) {
		this.driverReceivable = driverReceivable;
	}
	public Double getWaitMil() {
		return waitMil;
	}
	public void setWaitMil(Double waitMil) {
		this.waitMil = waitMil;
	}
	public Double getWaitingTime() {
		return waitingTime;
	}
	public void setWaitingTime(Double waitingTime) {
		this.waitingTime = waitingTime;
	}
	public Double getWaitingCharge() {
		return waitingCharge;
	}
	public void setWaitingCharge(Double waitingCharge) {
		this.waitingCharge = waitingCharge;
	}
	public String getReceiveTime() {
		return receiveTime;
	}
	public void setReceiveTime(String receiveTime) {
		this.receiveTime = receiveTime;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getOperateFlag() {
		return operateFlag;
	}
	public void setOperateFlag(String operateFlag) {
		this.operateFlag = operateFlag;
	}
	
}
