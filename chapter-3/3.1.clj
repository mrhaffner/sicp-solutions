;; Exercise 3.1
;; Page 303

(defn make-accumulator
    [initial-sum]
    (let [sum (atom initial-sum)]
        (fn [add-num]
            (swap! sum #(+ % add-num)))))