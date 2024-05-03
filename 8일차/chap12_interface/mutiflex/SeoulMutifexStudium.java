package chap12_interface.mutiflex;

// MutiFlexStadium이 stadium과 ConcertHall의 형태도 가지고 있기 때문에
// Stadium 타입의 변수에도 사용할 수 있고 concertHall 타입의 변수에도 사용할 수 있고
// MutiflexStudium 타입 변수에도 사용할 수 있으며 SeoulMutifexStudium 타입 변수로도 사용할 수 있다.
// 총 4가지 형태를 가짐
// 한 클래스에서 클래스 상속도 받고 인터페이스도 상속받을 수 있다.
public class SeoulMutifexStudium extends Theater implements MutiflexStudium {

	@Override
	public void getSportSchedule(int month) {
		// TODO Auto-generated method stub
		System.out.println(month + "월에 예정된 경기는 총 5경기입니다.");
	}

	@Override
	public int getSportsTicketPrice(int people) {
		// TODO Auto-generated method stub
		return 7000 * people;
	}
	
	@Override
	public void getSupporterItem(int people) {
		System.out.println("아이템 구매 가격은 " + people*15000 + "입니다.");
		
	}

	@Override
	public void printSchedule(int month) {
		// TODO Auto-generated method stub
		System.out.println(month + "월에 예정된 콘서트는 총 2건입니다.");
	}

	@Override
	public int getTicketPrice(int people) {
		return people * 96000;

	}

	@Override
	public void getRemainSeat() {
		System.out.println("남아있는 총 좌석은 125석 입니다.");

	}

	@Override
	public void platSportsgameOrConcert() {
		System.out.println("토요일에는 수원 대 서울 경기가 진행되고 일요일에는 싸이 콘서트가 진행될 예정입니다.");

	}

	@Override
	public void playMovie() {
		System.out.println("영화를 상영한다.");
		
	}



}
