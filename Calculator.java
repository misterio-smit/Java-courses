package calc;


/** Реализует калькулятор
*/
	public class Calculator {
	
	
 /**Результат вычисления
		 */
	   
		private int result;
		
	/**Суммируем аргументы.
	 param params Аргументы суммируются.
	*/
	public void add(int...params) {
		for (Integer param : params) {
			this.result += param;
			}
		}
	 /**Получить результатю
	  return результат вычисления.
	  */
	public int getResult() {
		return this.result;
		
		}
	/**Очистить результат вычисленияю
	 */
	public void cleanResult() {
			this.result = 0;
	}
}

