class Variable02 
{
	public static void main(String[] args) 
	{
		//�Ǽ� : float(4byte), double(8byte:�Ǽ����� �⺻)

		//float num = 10.5; ����
		float num = (float)10.5; //����ȯ, float num = 10.5f; �� ���� ��
		double num2 = 25.5;

		System.out.println("num="+ num);
		System.out.println("num2="+ num2);
		//������ ������ ����ϸ� ������ ���´�.(����,����=����) ������ �Ǽ��� ����ϸ� �Ǽ��� ���´�.(����,�Ǽ�=�Ǽ�)
		double result = num2 / 5; //�Ǽ��� �����ϱ� double
		int resultInt = 15/4; // ������ �����ϱ� ����ϸ� ������ ���´�.(�Ҽ� ���ϸ� ������.)
		System.out.println("result="+ result);
		System.out.println("resultInt="+ resultInt);

		double resultInt2 = 15/(double)4; //�Ǽ�����ȯ �ϸ� ���� int�� double�� ��ȯ
		System.out.println("resultInt2="+ resultInt2);

		//���� ������ ó�� boolean��
		boolean boo = true;  // ������ false
		System.out.println("boo="+boo);
		//������ : 1����, char���� ''�� �ٿ�����
		char c1 = 'A';
		char c2 = 'ȫ';
		System.out.println(c1+","+ c2);

		c1++;

		System.out.println("c1="+ c1);
		//�ƽ�Ű�ڵ� �빮�� A : 65, B : 66 (A:65������ �ܿ��) �ҹ��� a : 97
		//�ƽ�Ű�ڵ� ǥ ����

		// c1 = c1 + 1; 
		// �������� ���� : int���� char�� ������ �������� �߱� ������. int�� +-21�� 4����Ʈ char�� 2����Ʈ. int�� �� ũ�⶧���� �������� ����ȯ�ؾ��Ѵ�.
		c1 = (char)(c1 + 1); //c1�� 1 �����ϴ� �� 
		// = �� �������� �ؼ� �������� ���� ����ϰ� �� ����� �������� ����ִ´�.
		
		System.out.println("c1="+ c1);

		c1 = (char)120;
		System.out.println("c1="+c1);
		
		String userName = "ȫ�浿";
		String addr = "����� ������ �ż���";
		//String�̶� Ŭ������ �Ϲ� ����ó�� ����� �� �ְԲ� ��������ִ�. Ư���� Ŭ����
		System.out.println(userName);
		System.out.println(addr);

		//�̰��� �ִ� �������� main �޼ҵ��� �����������̴�. �� �������� stack�� ����.
		//Stack : �ٱ��Ͽ� ���������� ������� ������ ����־� ���� �� ������ ���� ������ ����
		//Stack : First In Last out ���� �� ������ �ؿ� �׿� �ʰԳ����� �ڴʰ� �� ������ ���� ���´�.

	}
}
