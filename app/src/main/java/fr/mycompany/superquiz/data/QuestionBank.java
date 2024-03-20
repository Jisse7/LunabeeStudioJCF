package fr.mycompany.superquiz.data;

import java.util.Arrays;
import java.util.List;

public class QuestionBank {
    public List<Question> getQuestions() {
        return Arrays.asList(
                new Question(
                        "Quand a été créé Lunabee Studio?",
                        Arrays.asList(
                                "2012",
                                "2008",
                                "2011",
                                "2014"
                        ),
                        2
                ),
                new Question(
                        "Qui est le créateur d'Android?",
                        Arrays.asList(
                                "Andy Rubin",
                                "Steve Wozniak",
                                "Jake Wharton",
                                "Paul Smith"
                        ),
                        0
                ),
                new Question(
                        "Qui a crée Lunabee Studio?",
                        Arrays.asList(
                                "Peter PARKER",
                                "Simon PRUNAYRE",
                                "Jude BENZ",
                                "Thomas LAMY"
                        ),
                        3
                ),
                new Question(
                        "Quel est le code postal de Lyon ?",
                        Arrays.asList(
                                " :) ",
                                "on est là",
                                "→ne pas cliquer",
                                "69000"
                        ),
                        3
                ),
                new Question(
                        "*:hover { display :none;}",
                        Arrays.asList(
                                "C'est pas gentil",
                                "C'est du bon code ça ",
                                "20% de remise sur le nutella chez Auchan",
                                "C'est du C++ ! "
                        ),
                        0
                ),
                new Question(
                        "Il me reste 1% de batterie, je :",
                        Arrays.asList(
                                "continue de coder",
                                "cède le passage",
                                "spam CTRL S ",
                                "git branch -d <nom>"
                        ),
                        2
                )
        );
    }

    private static QuestionBank instance;
    public static QuestionBank getInstance() {
        if (instance == null) {
            instance = new QuestionBank();
        }
        return instance;
    }
}
