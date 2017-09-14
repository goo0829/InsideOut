package project_01;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JFrame;

/**
 * ������ �������� ��Ʈ���� ���ִ� Ŭ�����̴�.
 * 
 * @author Yun
 *
 */
public class InsideOut extends JFrame {

	private MainScreenPanel mainScreenPanel;
	private Container contentpane;

	public InsideOut() {
		// �����̸� ����
		setTitle("Inside Out");
		// ������ ���� ������ ����, �ݵ�� �ʿ��� �Լ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �ʿ��� ������ ����ϴ� �κ��� contentpane �̴�.
		contentpane = getContentPane();
		// ����â ũ�� ����
		setSize(Main.SCREENT_WIDTH, Main.SCREENT_HEIGHT);
		// ���ȭ���� �������� �������ش�.
		setBackground(Color.BLACK);
		// ����â�� �� �߾ӿ� ���
		setLocationRelativeTo(null);
		// �����̳��� ũ�Ⱑ ����ɶ� ������Ʈ���� ũ��� ��ġ�� �ڵ������� ����Ǵµ� �װ� �����Ѵ�.
		setLayout(null);
		// �޴��ٰ� ������ �ʰԲ� ����
		setUndecorated(true);
		// ����ڰ� ����â�� ���Ƿ� ���̰� �ϴ°� �Ұ���, true�� �ϸ� ����
		setResizable(false);
		// ȭ�� ��� ���� �⺻���� false �̹Ƿ� ���� ������Ѵ�.
		setVisible(true);
		// ���� �г� ����
		mainScreenPanel = new MainScreenPanel();
		// �г��� �߰����ش�.
		contentpane.add(mainScreenPanel);
	}
}