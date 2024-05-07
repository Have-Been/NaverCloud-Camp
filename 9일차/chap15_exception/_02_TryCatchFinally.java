package chap15_exception;

public class _02_TryCatchFinally {

	// 또 다른 예외 처리
	// throws Exception : 예외 처리를 main에다가 위임, 별로 추천하는 방식은 아님
	public static void main(String[] args) {
		int[] intArr = new int[3];
		String[] strArr = new String[3];
		
		int idx = 0;
		
		// 1. try ~ catch ~ finally
		// try 블록에 실행될 코드를 작성하고 try 블록에 작성된 코드에서 에러가 발생하면
		// catch 블록으로 이동해서 예외처리를 한다.
		// finally 블록은 예외가 발생하던 발생하지 않던 무조건 실행되는 블록이다.
		// try ~ catch 블록은 항상 짝으로 작성해줘야 되지만
		// finally 블록은 개발자의 선택사항이다.
		while(true) {
			try {
				// 2. ArrayIndexOutOfBoundsException 발생
//				System.out.println(intArr[idx++]);
				
				// 3. ArithmeticException 발생
//				int result = 10 / 0;
				
				// 4. NullPointerException 발생
				strArr[0].length();
				
			}
			
			catch(ArrayIndexOutOfBoundsException ae) {
				// 발생한 예외의 메시지 출력
				System.out.println(ae.getMessage());
				System.out.println("인덱스의 범위를 초과했습니다.");
			} 
			
			catch(ArithmeticException are) {
				System.out.println(are.getMessage());
				System.out.println("분모는 0이 될 수 없습니다.");
				break;
			}
			
			catch(NullPointerException ne) {
				System.out.println(ne.getMessage());
				System.out.println("null에는 속성이나 기능이 존재하지 않습니다.");
				break;
			}
			
			// 생각치도 못한 예외 처리
			catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("알 수 없는 에러 발생");
			} finally {
				if(idx < 3) {
					System.out.println("정상 출력");
				}else {
					System.out.println("예외 발생. idx를 0으로 초기화합니다.");
					idx = 0;
				}
				// finally까지 넣으면 결과문
				// 정상 출력 -> 0 -> 예외 발생. idx를 0으로 초기화합니다 무한 반복
			}
			
		}
		// 만약 try ~ catch문을 사용하지 않으면 에러가 뜨며 실행이 되지 않지만
		// try ~ catch문만 사용해줘도 프로그램이 종료되지 않게 막을 수 있다.
	}

}
