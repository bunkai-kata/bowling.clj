(ns bowling.core-spec
  (:require [bowling.core :refer :all]
            [speclj.core :refer :all]))

(describe "Scoring a bowling game"

  (with g (new-game))

  (defn roll-many [game n pins]
    (->> (repeat n pins)
         (reduce #(roll %1 %2) @g)))

  (it "scores a gutter game"
    (should= 0
             (-> @g
                 (roll-many 20 0)
                 score)))

  (it "scores a singles game"
    (should= 20
             (-> @g
                 (roll-many 20 1)
                 score))))
