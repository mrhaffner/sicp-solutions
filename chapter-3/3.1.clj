;; Exercise 3.1
;; Page 303

;; Write a procedure make-accumulator that generates accumulators, 
;; each maintaining an independent sum. The input to make-accumulator
;; should specify the initial value of the sum

(defn make-accumulator
    [initial-sum]
    (let [sum (atom initial-sum)]
        (fn [add-num]
            (swap! sum #(+ % add-num)))))