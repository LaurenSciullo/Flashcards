
public class FlashCard
	{

		private String question;
		private String answer;
		
		public FlashCard (String q, String a)
		{
			question = q;
			answer = a;
		}

		public String getQuestion()
			{
				return question;
			}

		public void setQuestion(String question)
			{
				this.question = question;
			}

		public String getAnswer()
			{
				return answer;
			}

		public void setAnswer(String answer)
			{
				this.answer = answer;
			}
		
		// another way:
		/* public Flashcard (String question, String answer)
		 * {
		 * this.question = question;
		 * this.answer = answer;
		 * }
		 */

	}
