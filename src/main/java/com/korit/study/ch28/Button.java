package com.korit.study.ch28;

public class Button implements ClickKistener{
    @Override
    public void onClick() {
        System.out.println("버튼이 클릭되었습니다.");
    }

    private ClickKistener listener;

    public void setListener(ClickKistener listener) {
        this.listener = listener;
    }
    public void click() {
        if (listener != null) {
            listener.onClick();
        }
        // 굳이 이 조건을 넣은 이유 ?
        //  -> set을 안해서 null이 들어가는 상황을 대비
    }
}
