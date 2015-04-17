(ns bowling.core-spec
  (:require [bowling.core :refer :all]
            [speclj.core :refer :all]))

(describe "scoring a bowling game"

  (it "scores a gutter game"
    (let [g (new-game)]
      (should= 0
               (->> (repeat 20 0)
                    (reduce #(roll %1 %2) g)
                    score))))

  (it "scores a singles game"
    (let [g (new-game)]
      (should= 20
               (->> (repeat 20 1)
                    (reduce #(roll %1 %2) g)
                    score)))))
