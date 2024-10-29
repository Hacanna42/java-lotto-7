package lotto.util;

public class Validator {
    /* LOTTO_NUMBER_REGEX 정규식 설명
     * 1. 각 숫자는 1부터 45사이의 값이어야 한다.
     * 2. 숫자가 한자리일 경우, 앞에 0을 붙여도 정상 입력으로 처리한다. (예: 03)
     * 3. 각 숫자는 쉼표(,)로 구분되어야 하며, 구분자 양 옆의 띄어쓰기는 허용한다.
     */
    private static final String LOTTO_NUMBERS_REGEX = "^(0?[1-9]|[1-3][0-9]|4[0-5])(\\s?,\\s?(0?[1-9]|[1-3][0-9]|4[0-5])){5}$";
    private static final String PURCHASE_MONEY_REGEX = "^[1-9]\\d*000$"; // 맨 앞은 무조건 0이 아니고, 맨 뒷자리는 무조건 000으로 끝나야 함
    private static final String BONUS_NUMBER_REGEX = "^(0?[1-9]|[1-3][0-9]|4[0-5])$";

    public void checkLottoNumbers(String input) {
        if (!input.matches(LOTTO_NUMBERS_REGEX)) {
            throw new IllegalArgumentException("로또 번호의 형식이 올바르지 않습니다.");
        }
    }

    public void checkPurchaseMoney(String input) {
        if (!input.matches(PURCHASE_MONEY_REGEX)) {
            throw new IllegalArgumentException("구입 금액은 1,000원 단위로 입력해야 합니다.");
        }
    }

    public void checkBonusNumber(String input) {
        if (!input.matches(BONUS_NUMBER_REGEX)) {
            throw new IllegalArgumentException("로또 번호는 1부터 45 사이의 숫자여야 합니다.");
        }
    }
}
