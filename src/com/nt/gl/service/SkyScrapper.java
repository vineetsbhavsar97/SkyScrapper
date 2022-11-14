package com.nt.gl.service;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class SkyScrapper {public void toBuild(int[] arr) {
	PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);

	for (int i : arr) {
		pq.add(i);
	}
	Deque<Integer> stack = new ArrayDeque<>();
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Day: " + (i + 1));
		if (!pq.isEmpty() && arr[i] != pq.peek()) {
			stack.push(arr[i]);
			System.out.println(" ");
		} else {
			stack.push(arr[i]);
			while (!stack.isEmpty() && stack.peek().equals(pq.peek())) {
				System.out.print(pq.poll() + " ");
				stack.pop();
			}
			System.out.println(" ");
		}
	}
}
}
